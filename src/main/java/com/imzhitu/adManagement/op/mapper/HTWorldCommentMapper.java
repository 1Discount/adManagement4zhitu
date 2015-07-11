package com.imzhitu.adManagement.op.mapper;

import java.util.List;

import com.imzhitu.adManagement.dataSource.DataSource;
import com.imzhitu.adManagement.pojo.HTWorldCommentDTO;

/**
 *
 * @author zhangbo 2015年7月4日
 */
public interface HTWorldCommentMapper {
	
	/**
	 * 查询评论结果
	 *
	 * @param dto
	 * @return
	 * @author zhangbo 2015年7月4日
	 */
	@DataSource("slave")
	public List<HTWorldCommentDTO> queryComment(HTWorldCommentDTO dto);
}
