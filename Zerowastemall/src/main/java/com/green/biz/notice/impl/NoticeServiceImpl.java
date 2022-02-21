package com.green.biz.notice.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.green.biz.dao.NoticeDAO;
import com.green.biz.dto.NoticeVO;
import com.green.biz.notice.NoticeService;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDAO noticeDao;
	
	@Override
	public List<NoticeVO> listNotice() {
		return noticeDao.listNotice();
	}

	@Override
	public NoticeVO getNotice(int nseq) {
		return noticeDao.getNotice(nseq);
	}

	// ** Admin������ ������ �ۼ��� �߰� �κ�
	@Override
	public void insertNotice(NoticeVO vo) {
		noticeDao.insertNotice(vo);
	}
}
