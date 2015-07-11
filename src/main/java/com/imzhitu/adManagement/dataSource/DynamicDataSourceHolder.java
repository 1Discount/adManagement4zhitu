/**
 * 
 */
package com.imzhitu.adManagement.dataSource;

/**
 * 动态数据源存储
 * @author zhangbo 2015年7月6日
 */
public class DynamicDataSourceHolder {
	public static final ThreadLocal<String> holder = new ThreadLocal<String>();
	
	public static void setDataSource(String name) {
		holder.set(name);
	}
	
	public static String getDataSource() {
		return holder.get();
	}
}
