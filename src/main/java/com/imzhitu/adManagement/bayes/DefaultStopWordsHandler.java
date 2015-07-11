package com.imzhitu.adManagement.bayes;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * <p>Title:DefaultStopWordsHandler</p>
 * <p>Description: 是否为停用词检测
 * </p>
 */
public class DefaultStopWordsHandler {
	/**
	 * 常用停用词
	 */
	private static Set<String> stopWordsSet =new HashSet<String>();
	static {
		stopWordsSet.add("我们");
		stopWordsSet.add("自己");
	}
	
	/**
	 * 
	* @Title: isStopWord
	* @Description: 检查单词是否为停用词
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
	* 去掉停用词
	* @param text 给定的文本
	* @return 去停用词后结果
	*/
	public static Set<String> dropStopWords(Set<String> oldWords){
		Set<String> set = new HashSet<String>();
		for(String word: oldWords)		{
			if(DefaultStopWordsHandler.isStopWord(word)==false){
				//不是停用词
				set.add(word);
			}
		}
		return set;
	}
}
