package com.imzhitu.adManagement.op.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imzhitu.adManagement.base.AbstractSpringTest;


/**
 *
 * @author zhangbo 2015年7月7日
 */
public class OpHTWorldCommentServiceTest extends AbstractSpringTest{
	
	@Autowired
	private OpHTWorldCommentService service;
	
	@Test
	public void queryCommentTest()throws Exception{
		System.out.println("service>>>>>>>>>>" + service);
		service.queryComment();
	}
}
