package com.sailing.hrm.persistent.organization.dao;

import org.springframework.stereotype.Component;

import com.sailing.hrm.persistent.base.HibernateDao;
import com.sailing.hrm.persistent.organization.bean.Org;

/**
 * 部门持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class OrgDao extends HibernateDao<Org, Long> {

}
