package com.green.biz.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NoticeVO {

	private int nseq;		// �Խñ� ��ȣ(������ȣ)
	private String nkind;	// ī�װ�  1:����, 2:���, 3:�̺�Ʈ, 4:��Ÿ
	private String subject;	// ����
	private String content;	// ���� ����
	private String notimg; // �������� �̹��� -- default.jpg
	private Timestamp indate;	// �������(�ۼ�����)
	private int count;	   // ��ȸ��
}
