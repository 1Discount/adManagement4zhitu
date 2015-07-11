package com.imzhitu.adManagement.bayes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.imzhitu.adManagement.op.mapper.HTWorldCommentMapper;
import com.imzhitu.adManagement.pojo.HTWorldCommentDTO;

public class NaiveBayesMain {
	
	@Autowired
	private HTWorldCommentMapper mapper;
	
	private List<HTWorldCommentDTO> queryComment(){
		HTWorldCommentDTO dto = new HTWorldCommentDTO();
		dto.setAuthorID(0);
		List<HTWorldCommentDTO> list = new ArrayList<HTWorldCommentDTO>();
		System.out.println("mapper:::::" + mapper);
//		try {
//			list = mapper.queryComment(dto);
//		} catch (Exception e) {
//			System.out.println("error>>>>>" + e.getMessage());
//		}
		return list; 
	}
	
	public static void main(String[] args){
		NaiveBayesMain mm = new NaiveBayesMain();
		List<HTWorldCommentDTO> list = mm.queryComment();
//		for (HTWorldCommentDTO htWorldCommentDTO : list) {
//			htWorldCommentDTO.getComment();
//		}
//		String s = list.get(0).getComment();
		String s = "";
		Set<String> words=ChineseTokenizer.segStr(s).keySet();
//		Map<String,BigDecimal> resultMap=MultinomialModelNaiveBayes.classifyResult(DefaultStopWordsHandler.dropStopWords(words));
//		Set<String> set=resultMap.keySet();
//		for(String str: set){
//			System.out.println("classifer:"+str+"     probability:"+resultMap.get(str));
//		}
//		System.out.println("The final result:"+MultinomialModelNaiveBayes.getClassifyResultName());
		
		for (String string : words) {
			System.out.println(">>>>>>>>>>>" + string);
		}
	}
}
