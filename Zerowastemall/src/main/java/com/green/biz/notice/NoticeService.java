package com.green.biz.notice;

import java.util.List;
import com.green.biz.dto.NoticeVO;

public interface NoticeService{

	// ���Ǿ��� ��� Notice��ȸ
	List<NoticeVO> listNotice();

	// �������� �� ��ȣ�� ���� ��ȸ
	NoticeVO getNotice(int nseq);

	// ���� Admin������ ������ �ۼ��� �߰� �κ�  �̸��ۼ�
	// Notice���� ����
	void insertNotice(NoticeVO vo);

}

