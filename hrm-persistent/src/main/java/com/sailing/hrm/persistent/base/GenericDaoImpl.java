package com.sailing.hrm.persistent.base;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author guanxianchun
 * @2015 下午3:29:25
 * @TODO
 * 
 */
@Service
@Transactional
public class GenericDaoImpl extends HibernateDaoSupport implements GenericDao {
	public <T> void save(T t) {
		getHibernateTemplate().save(t);
	}

	public <T> void delete(T t) {
		getHibernateTemplate().delete(t);
	}

	public <T> void update(T t) {
		getHibernateTemplate().update(t);
	}

	@SuppressWarnings("unchecked")
	public <T> T findById(Class<T> clazz, int id) {
		return (T) getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List findByPage(final String hql, final Object[] values, final int offset, final int pageSize) {
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				for (int i = 0; i < values.length; i++) {
					query.setParameter(i, values);
				}
				List result = query.setFirstResult(offset).setMaxResults(pageSize).list();
				return result;
			}
		});
		return list;
	}

	@Override
	public List findByPage(final String hql, final Object value, final int offset, final int pageSize) {
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException
			// 该方法体内以Hibernate方法进行持久层访问
			{
				List result = session.createQuery(hql).setParameter(0, value).setFirstResult(offset)
						.setMaxResults(pageSize).list();
				return result;
			}
		});
		return list;
	}

	@Override
	public List findByPage(final String hql, final int offset, final int pageSize) {
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException
			// 该方法体内以Hibernate方法进行持久层访问
			{
				List result = session.createQuery(hql).setFirstResult(offset).setMaxResults(pageSize).list();
				return result;
			}
		});
		return list;
	}

}
