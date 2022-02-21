package com.green.biz.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.green.biz.dto.NoticeVO;


@Repository
public class NoticeDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	// ���Ǿ��� ��� Notice��ȸ
	public List<NoticeVO> listNotice() {
		
		return mybatis.selectList("mappings.notice-mapping.listNotice");
	}
	
	// �������� �� ��ȣ�� ���� ��ȸ
	public NoticeVO getNotice(int nseq) {
		return mybatis.selectOne("mappings.notice-mapping.getNotice", nseq);
	}
	
	
	// ���� Admin������ ������ �ۼ��� �߰� �κ�  �̸��ۼ�
	// Notice���� ����
	public void insertNotice(NoticeVO vo) {
		mybatis.insert("mappings.notice-mapping.insertNotice", vo);
	}
}

