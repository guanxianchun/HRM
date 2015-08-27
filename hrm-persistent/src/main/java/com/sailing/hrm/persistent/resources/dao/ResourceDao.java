package com.sailing.hrm.persistent.resources.dao;

import org.springframework.stereotype.Component;

import com.sailing.hrm.persistent.base.HibernateDao;
import com.sailing.hrm.persistent.resources.bean.Resource;

/**
 * 资源持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class ResourceDao extends HibernateDao<Resource, Long> {

}
