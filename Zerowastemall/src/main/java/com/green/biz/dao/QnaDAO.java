package com.green.biz.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.dto.QnaVO;

@Repository
public class QnaDAO  {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<QnaVO> listQna(String id) {
		
		return mybatis.selectList("mappings.qna-mapping.listQna", id);
	}
	
	public QnaVO getQna(int qseq) {
		return mybatis.selectOne("mappings.qna-mapping.getQna", qseq);
	}
	
	public void insertQna(QnaVO vo) {
		
		mybatis.insert("mappings.qna-mapping.insertQna", vo);
	}
	
	// ���� Admin������ ������ �ۼ��� �߰� �κ� 
	// �����ڰ� ���Ǿ��� ��� Q&A�� �ֽż����� ��ȸ
	public List<QnaVO> listAllQna() {
		
		return mybatis.selectList("mappings.qna-mapping.listAllQna");
	}
	
	//Q&A ����
	public void updateQna(QnaVO vo) {
		
		mybatis.update("mappings.qna-mapping.updateQna", vo);
	}
}

