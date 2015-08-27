package com.sailing.hrm.persistent.base;

import java.util.List;

/**
 * 
 * @author guanxianchun
 * @2015 下午3:28:35
 * @TODO DAO接口类
 */
public interface GenericDao {
	public <T> void save(T t);

	public <T> void delete(T t);

	public <T> void update(T t);
	/**
	 * 
	 * @auther guanxianchun
	 * @description
	 * @version 1.0
	 * @date 2015年8月21日 下午2:41:41
	 * @param clazz 对象类
	 * @param id 主键ID
	 * @return
	 */
	public <T> T findById(Class<T> clazz, int id);
	/** 
	 *   
	 * @auther guanxianchun
	 * @description  使用hql 语句进行分页查询操作  
	 * @version 1.0
	 * @date 2015年8月21日 下午2:40:06
     * @param hql 需要查询的hql语句  
     * @param values 如果hql有多个参数需要传入，values就是传入的参数数组  
     * @param offset 第一条记录索引  
     * @param pageSize 每页需要显示的记录数  
     * @return 当前页的所有记录  
	 */
	public List findByPage(final String hql, final Object[] values, final int offset,final int pageSize);
	/**
	 * 
	 * @auther guanxianchun
	 * @description 使用hql 语句进行分页查询操作  
	 * @version 1.0
	 * @date 2015年8月21日 下午2:44:14
     * @param hql 需要查询的hql语句  
     * @param value 如果hql有一个参数需要传入，value就是传入的参数  
     * @param offset 第一条记录索引  
     * @param pageSize 每页需要显示的记录数  
     * @return 当前页的所有记录  
	 * @return
	 */
	public List findByPage(final String hql, final Object value, final int offset,final int pageSize);
	/**
	 * 
	 * @auther guanxianchun
	 * @description 使用hql语句进行分页查询操作  
	 * @version 1.0
	 * @date 2015年8月21日 下午2:45:12
	 * @param hql 需要查询的hql语句  
     * @param offset 第一条记录索引  
     * @param pageSize 每页需要显示的记录数  
     * @return 当前页的所有记录  
	 */
	public List findByPage(final String hql,final int offset, final int pageSize);
}