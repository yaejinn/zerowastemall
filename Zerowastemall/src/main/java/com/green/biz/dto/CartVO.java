package com.green.biz.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CartVO {
	private int cseq;		 //��ٱ��� �Ϸù�ȣ
	private String id;		 //ȸ��id
	private int pseq;		 //��ǰ �Ϸù�ȣ
	private String mname;	 //ȸ����
	private String pname;	 //��ǰ��
	private int quantity;	 //����
	private int price2;		 //�ǸŰ�
	private Timestamp indate;//�����
}
