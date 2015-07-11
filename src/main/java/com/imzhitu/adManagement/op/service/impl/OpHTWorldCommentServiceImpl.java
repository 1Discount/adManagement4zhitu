/**
 * 
 */
package com.imzhitu.adManagement.op.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imzhitu.adManagement.bayes.ChineseTokenizer;
import com.imzhitu.adManagement.op.mapper.HTWorldCommentMapper;
import com.imzhitu.adManagement.op.service.OpHTWorldCommentService;
import com.imzhitu.adManagement.pojo.HTWorldCommentDTO;

/**
 *
 * @author zhangbo 2015年7月7日
 */
@Service
public class OpHTWorldCommentServiceImpl implements OpHTWorldCommentService {
	
	@Autowired
	private HTWorldCommentMapper mapper;
	
	@Override
	public void queryComment() {
		HTWorldCommentDTO dto = new HTWorldCommentDTO();
		dto.setId(2);
		System.out.println("mapper:::::" + mapper);
		List<HTWorldCommentDTO> list = mapper.queryComment(dto);
		String s = list.get(0).getComment();
		Set<String> words=ChineseTokenizer.segStr(s).keySet();
		for (String string : words) {
			System.out.println(">>>>>>>>>>>" + string);
		}
	}
}
