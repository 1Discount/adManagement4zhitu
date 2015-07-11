package com.imzhitu.adManagement.common;

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
//		String s = "浜诧紝鎯冲仛娣樺疂鍏艰亴涔堬紵鏃ヨ禋鐧惧厓锛屼笂涓嶅皝椤躲�傚伐璧勬棩缁擄紝澶氬姵澶氬緱銆傛兂鍋氬姞鎴慟649914906璇勮涓嶅洖";
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
