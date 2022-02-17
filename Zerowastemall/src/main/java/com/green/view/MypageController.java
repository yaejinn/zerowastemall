package com.green.view;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.biz.dto.CartVO;
import com.green.biz.dto.MemberVO;
import com.green.biz.dto.OrderVO;
import com.green.biz.order.CartService;
import com.green.biz.order.OrderService;

@Controller
public class MypageController {
/*
 * ��ٱ��� ��� ��û ó��   
 */
   @Autowired
   private CartService cartService;
   @Autowired
   private OrderService orderService;
   
   @PostMapping(value="/cart_insert") // mypage.js�� "cart_insert"
   // productDetail.jsp�� quantity, pseq --command��ü CartVO �� ����
   public String insertCart(CartVO vo, Model model, HttpSession session) {
      
      // (1) ���ǿ� ����� ����� ������ �о� �´�.
      //       MemberController�� loginAction -- loginUser
      MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
         
      // (2) �α����� �ȵǾ� ������ �α���, 
      //          �α����� �Ǿ� ������, ��ٱ��Ͽ� �׸� ����   
      if (loginUser == null) {
         return "member/login";
         
      } else {
         vo.setId(loginUser.getId()); // 
         
         cartService.insertCart(vo);
         
         // (3) ��ٱ��� ��� ��ȸ�Ͽ� ȭ�� ǥ��
         return "redirect:cart_list";
      }
   }
/*
 * ��ٱ��� ��� ó��   
 * cartList.jsp
 */
//   @GetMapping(value="shoping-cart")
//   public String listCart(HttpSession session, Model model) {
//      
////      MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
////      
////      // �α����� �ȵǾ� ������ �α��� ��������
////      if (loginUser == null) {
////         return "member/login"; // jsp
////      
////      // �α����� �Ǿ� ������, ��ٱ��� �������
////      // cart-mapping.xml��  "listCart" - id�� ������
////      } else {
////         List<CartVO> cartList = cartService.listCart(loginUser.getId());
////         
////         // �Ѿ� ��� = ���� * �ǸŰ�
////         int totalAmount = 0;
////         for (CartVO vo : cartList) {
////            totalAmount += vo.getQuantity() * vo.getPrice2();
////         }
////         
////         // ��ٱ��� ��ϰ� ���� ��� ������ ���尴ü�� ����
////         model.addAttribute("cartList", cartList);   // cartList.jsp�� ${cartList}
////         model.addAttribute("totalPrice", totalAmount); // cartList.jsp�� ${totalPrice}
////         
//         return "shoping-cart"; // jsp
//      }
//   }
   @GetMapping(value="shoping-cart")
   public String listCart(){
	   return "shoping-cart";
   }
   /*
    * ��ٱ��� �׸� ���� ��û ó��
    */
   @PostMapping(value="/cart_delete")
   public String cartDelete(@RequestParam(value="cseq") int[] cseq) {
	   
	   for(int i=0; i<cseq.length; i++) {
		   System.out.println(("������ cart seq = " +cseq[i]));
		   cartService.deleteCart(cseq[i]);
	   }
	   return "redirect:cart_list";
   }
   /*
    * ��ٱ��� ������ �ֹ� ó��
    */
   @PostMapping(value="/order_insert")
   public String orderInsert(OrderVO vo,HttpSession session,Model model) {
	   
	   MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
	   
	   if(loginUser == null) {
		   return "member/login";
	   }else {
		   vo.setId(loginUser.getId());
		   
		   int oseq = orderService.insertOrder(vo);
		   
		   //TODO:�ֹ���ȣ����
		   model.addAttribute("oseq",oseq);
		   
		   return "redirect:order_list";
	   }
   }
   /*
    * �������� �ֹ����� ��ȸ
    * �Է� �Ķ����:oseq
    * 			result = '1'
    */
//   @GetMapping(value="order_list")
//   public String orderList(@RequestParam(value="oseq") int oseq,
//		   					HttpSession session,OrderVO order, Model model) {
//	   //(1) �α��� Ȯ��
//	   MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
//	   if(loginUser == null) {
//		   return "member/login";
//	   }else {
//	   //(2) �ֹ���ȣ�� �������� �ֹ� ���� ��ȸ
//		   order.setId(loginUser.getId());
//		   order.setOseq(oseq);
//		   order.setResult("1");
//		   List<OrderVO> orderList = orderService.listOrderById(order);
//		   
//	   //(3) �ֹ� �Ѿ� ���
//		   int totalAmount = 0;
//		   for(OrderVO vo : orderList) {
//			   totalAmount +=(vo.getQuantity() * vo.getPrice2());
//		   }
//	   //(4) ���� ��ü�� ��� ����
//		   model.addAttribute("orderList",orderList);
//		   model.addAttribute("totalPrice",totalAmount);
//	   
//	   //(5)ȭ�� ȣ��
//	   return "mypage/orderList";
//  }
// }
   
   @GetMapping(value="checkout")
 public String orderList() {
	   return "checkout";
   }
   
   @GetMapping(value="/mypage")
   public String myPageView(HttpSession session,Model model) {
	   
	   //���ǿ� ����� �α��� ���� �о��
	   MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
	   
	   if(loginUser == null){
		   return "member/login";
	   }else {
	   //����ڰ� �ֹ��� ��� �ֹ���ȣ ��ȸ
	   OrderVO vo = new OrderVO();
	   vo.setId(loginUser.getId());
	   vo.setResult("1");
	   List<Integer> oseqList = orderService.selectSeqOrdering(vo);
	   
	   //�� �ֹ���ȣ�� ��ȸ�ƿ� �ֹ�������� ����
	   //(1)�ֹ� ��� ���� ���� ����
	   List<OrderVO> orderList = new ArrayList<OrderVO>();
	   
	  //(2)��� �ֺй�ȣ�� ���� ������� ����
	   for (int oseq : oseqList) {
		   OrderVO orderVO = new OrderVO();
		   
		   orderVO.setId(loginUser.getId());
		   orderVO.setOseq(oseq);
		   orderVO.setResult("1");
		   
		   //�� �ֹ��� ���� �ֹ����� ��ȸ
		   List<OrderVO> listByOseq = orderService.listOrderById(orderVO);
		   
		   //������ �ֹ��� �ֹ������� ������� ����
		   OrderVO order  = new OrderVO();
		   order.setOseq(listByOseq.get(0).getOseq());
		   order.setIndate(listByOseq.get(0).getIndate());
		   
		   if(listByOseq.size() > 1) {
			   order.setPname(listByOseq.get(0).getPname() + "��" +
					   	(listByOseq.size()-1)+"��");
		   }else {
			   order.setPname(listByOseq.get(0).getPname());
		   }
		   //�ֹ���ȣ�� �Ѿ� ���
		   int amount = 0;
		   for(int i  = 0; i<listByOseq.size();i++) {
			   amount += listByOseq.get(i).getQuantity()
					   *listByOseq.get(i).getPrice2();
		   }
		   order.setPrice2(amount);
		   
		   //��������� List������ �߰�
		   orderList.add(order);
	   }
	   model.addAttribute("title","�������� �ֹ� ����");
	   model.addAttribute("orderList",orderList);
	   }
	   return "mypage/mypage";
   }
   @GetMapping(value="/order_detail")
   public String orderDetail(OrderVO vo,HttpSession session,Model model) {
	   //���ǰ�ü���� �α��� Ȯ��
	   MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
	   
	   if(loginUser == null) {
		   return "member/login";
	   }else {
	   //�ֹ���ȣ�� �������� �ֹ� ��ȸ
	   vo.setId(loginUser.getId());
	   //vo.setResult("1");
	   vo.setResult("");
	   
	   List<OrderVO> orderList = orderService.listOrderById(vo);
	   //ȭ�鿡 ����� ���� ����
	   //(1)�ֹ��� ���� ����
	   OrderVO orderDetail = new OrderVO();
	   
	   orderDetail.setOseq(orderList.get(0).getOseq());
	   orderDetail.setIndate(orderList.get(0).getIndate());
	   orderDetail.setMname(orderList.get(0).getMname());
	   orderDetail.setResult(orderList.get(0).getResult());
	   
	   //�ֹ� �հ� �ݾ� ���
	   int amount = 0;
	   for(int i = 0;i<orderList.size();i++) {
		   amount +=(orderList.get(i).getQuantity()
				   *orderList.get(i).getPrice2());
	   }
	   model.addAttribute("title","My Page(�ֹ� �� ����)");
	   model.addAttribute("orderDetail",orderDetail);
	   model.addAttribute("totalPrice",amount);
	   model.addAttribute("orderList",orderList);
	   
	   return "mypage/orderDetail";
	  }
	  
   }
   /*
    * �� �ֹ����� ó��
    * ó������� ������� ������� ��� �ֹ� ��ȸ
    */
   @GetMapping(value="order_all")
	  public String orderAllVieww(OrderVO vo,HttpSession session,Model model) {
	   //(1)����� �α��� Ȯ��
	   MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
	   
	   if(loginUser == null){
		   return "member/login";
	   }else {		   
		   //(2)������� ��ü �ֹ���ȣ Ȯ��
		   vo.setId(loginUser.getId());
		   vo.setResult("");//ó����� ���� ����
		   List<Integer> oseqList = orderService.selectSeqOrdering(vo);
		   
		   //(3)�� �ֹ���ȣ �� �ֹ����� ��ȸ
		   List<OrderVO> orderList = new ArrayList<>(); //�ֹ�������� ���� ����
		   for(int oseq : oseqList) {
			   OrderVO orderVO = new OrderVO();
			   orderVO.setId(loginUser.getId());
			   orderVO.setOseq(oseq);
			   orderVO.setResult("");
			   
			   //�ֹ���ȣ�� �ֹ����� ��ȸ
			   List<OrderVO> orders = orderService.listOrderById(orderVO);
		   
			 //(4)�ֹ���� ���� ����
			 OrderVO summary = new OrderVO();
			 summary = orders.get(0); //�켱 ù��° ��ǰ���� ������ ����
			 if(orders.size()>1) {
				 summary.setPname(orders.get(0).getPname()+"��"+(orders.size()-1+"��"));
			 }else {
				 summary.setPname(orders.get(0).getPname());
			 }
			 int amount = 0;
			 for (OrderVO order : orders) {
				 amount += (order.getQuantity() * order.getPrice2());
			 }
			 summary.setPrice2(amount);
			 
			 orderList.add(summary);
		   }
		   
		   //����� ȭ�鿡 ����
		   model.addAttribute("title","�� �ֹ�����");
		   model.addAttribute("orderList",orderList);
		   
		   return "mypage/mypage";
  }
 }
}

