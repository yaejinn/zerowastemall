package com.green.biz.member;

import java.util.List;

//import com.green.biz.dto.AddressVO;
import com.green.biz.dto.MemberVO;

public interface MemberService {

	//ȸ�� ������ ��ȸ
	MemberVO getMember(String id);

	//ȸ�� ���翩�� Ȯ��
	/*
	 * ���ϰ�:
	 * 		ȸ���� �����ϸ�: 1
	 * 		ȸ���� �������� ������: -1
	 */
	int confirmID(String id);

	//����� ����
	public int loginID(MemberVO vo);
	
	//ȸ�� ���
	void insertMember(MemberVO vo);

//	//���̸����� �ּ� ã��
//	public List<AddressVO> selectAddressByDong(String dong);
	
	//ȸ�� ��� ��ȸ
	public List<MemberVO> listMember(String name);
}