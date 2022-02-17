package com.green.biz.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.green.biz.dto.AddressVO;
import com.green.biz.dto.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	//ȸ�� ������ ��ȸ
	public MemberVO getMember(String id) {
		
		return mybatis.selectOne("mappings.member-mapping.getMember",id);
	}
	
	//ȸ�� ���翩�� Ȯ��
	/*
	 * ���ϰ�:
	 * 		ȸ���� �����ϸ�: 1
	 * 		ȸ���� �������� ������: -1
	 */
	public int confirmID(String id) {
		
		String pwd = mybatis.selectOne("mappings.member-mapping.confirmID",id);
		
		if(pwd != null)
			return 1;
		else
			return -1;
	}
	
	/*
	 * ȸ�� ����
	 * 
	 * id�� �������� ���� ��� : -1��ȯ
	 * pwd�� Ʋ�� ���: 0��ȯ
	 * id,pwd�� ��ġ�� ���: 1��ȯ
	 */
	public int loginID(MemberVO vo) {
		int result = -1;//��ȸ ���
		String pwd_in_db = mybatis.selectOne("mappings.member-mapping.confirmID",vo.getId());
		
		if(pwd_in_db == null) {
			result = -1;
		}else if(vo.getPwd().equals(pwd_in_db)) {//�Է� pwd�� ���̺���� pwd�� ��ġ
			result = 1;
		}else {
			result = 0;
		}
		return result;
	}
	
	//ȸ�� ���
	public void insertMember(MemberVO vo) {
		
		mybatis.insert("mappings.member-mapping.insertMember",vo);
	}
	
//	//���̸�����  �ּ� ã��
//	public List<AddressVO> selectAddressByDong(String dong){
//		return mybatis.selectList("mappings.member-mapping.selectAddressByDong",dong);
//	}
//	
	//ȸ�� ��� ��ȸ
	public List<MemberVO> listMember(String name){
		
		return mybatis.selectList("mappings.member-mapping.listMember",name);
	}
}
