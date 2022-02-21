package com.green.biz.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QnaVO {

	private int qseq;		// �۹�ȣ
	private String qkind;	// ���� ī�װ�  1:��ǰ, 2:���, 3:ȯ��, 4:��Ÿ
	private String subject;	// ����
	private String content;	// ���� ����
	private String reply;	// �亯 ����
	private String id;		// �ۼ��� ���̵�(member���̺�)
	private String rep;		// �亯���� 1:�亯X, 2:�亯O
	private Timestamp indate;	// �������(�ۼ�����)
}
