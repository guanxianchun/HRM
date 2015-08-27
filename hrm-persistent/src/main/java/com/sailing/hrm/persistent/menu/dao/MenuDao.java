package com.sailing.hrm.persistent.menu.dao;

import org.springframework.stereotype.Component;

import com.sailing.hrm.persistent.base.HibernateDao;
import com.sailing.hrm.persistent.menu.bean.Menu;

/**
 * 菜单持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class MenuDao extends HibernateDao<Menu, Long> {

}
