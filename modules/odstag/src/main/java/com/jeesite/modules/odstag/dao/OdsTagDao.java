/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.odstag.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.odstag.entity.OdsTag;

/**
 * 标准代码DAO接口
 * @author zyrho
 * @version 2020-12-15
 */
@MyBatisDao
public interface OdsTagDao extends CrudDao<OdsTag> {
	
}