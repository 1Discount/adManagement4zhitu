package com.imzhitu.adManagement.pojo;

import java.io.Serializable;

/**
 *
 * @author zhangbo 2015年7月4日
 */
public class HTWorldCommentDTO implements Serializable{

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -1264933448345579763L;
	
	/**
	 * 主键id
	 */
	private Integer id;
	/**
	 * 织图ID
	 */
	private Integer worldID;
	
	/**
	 * 用户ID
	 */
	private Integer authorID;

	/**
	 * 评论
	 */
	private String comment;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the worldID
	 */
	public Integer getWorldID() {
		return worldID;
	}

	/**
	 * @param worldID the worldID to set
	 */
	public void setWorldID(Integer worldID) {
		this.worldID = worldID;
	}

	/**
	 * @return the authorID
	 */
	public Integer getAuthorID() {
		return authorID;
	}

	/**
	 * @param authorID the authorID to set
	 */
	public void setAuthorID(Integer authorID) {
		this.authorID = authorID;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}
