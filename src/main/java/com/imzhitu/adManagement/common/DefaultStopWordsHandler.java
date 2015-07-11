package com.imzhitu.adManagement.common;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * <p>Title:DefaultStopWordsHandler</p>
 * <p>Description: 是否为停用词�?��
 * </p>
 * @createDate�?013-8-30
 * @author xq
 * @version 1.0
 */
public class DefaultStopWordsHandler {
	/**
	 * 常用停用�?
	 */
	private static Set<String> stopWordsSet =new HashSet<String>();
	static {
		stopWordsSet.add("我们");
		stopWordsSet.add("自己");
	}
	
	/**
	 * 
	* @Title: isStopWord
	* @Description: �?��单词是否为停用词
	* @param @param word
	* @param @return    
	* @return boolean   
	* @throws
	 */
	public static boolean isStopWord(String word)
	{
		return stopWordsSet.contains(word);
	}
	
	/**
	* 去掉停用�?
	* @param text 给定的文�?
	* @return 去停用词后结�?
	*/
	public static Set<String> dropStopWords(Set<String> oldWords){
		Set<String> set = new HashSet<String>();
		for(String word: oldWords)		{
			if(DefaultStopWordsHandler.isStopWord(word)==false){
				//不是停用�?
				set.add(word);
			}
		}
		return set;
	}
}
