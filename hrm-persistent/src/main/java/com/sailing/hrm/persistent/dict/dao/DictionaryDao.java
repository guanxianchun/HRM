package com.sailing.hrm.persistent.dict.dao;

import org.springframework.stereotype.Component;

import com.sailing.hrm.persistent.base.HibernateDao;
import com.sailing.hrm.persistent.dict.bean.Dictionary;

/**
 * 配置字典持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class DictionaryDao extends HibernateDao<Dictionary, Long> {

}
