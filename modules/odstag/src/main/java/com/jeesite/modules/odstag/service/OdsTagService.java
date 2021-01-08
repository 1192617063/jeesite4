/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.odstag.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.odstag.entity.OdsTag;
import com.jeesite.modules.odstag.dao.OdsTagDao;

/**
 * 标准代码Service
 * @author zyrho
 * @version 2020-12-15
 */
@Service
@Transactional(readOnly=true)
public class OdsTagService extends CrudService<OdsTagDao, OdsTag> {
	
	/**
	 * 获取单条数据
	 * @param odsTag
	 * @return
	 */
	@Override
	public OdsTag get(OdsTag odsTag) {
		return super.get(odsTag);
	}
	
	/**
	 * 查询分页数据
	 * @param odsTag 查询条件
	 * @param odsTag.page 分页对象
	 * @return
	 */
	@Override
	public Page<OdsTag> findPage(OdsTag odsTag) {
		return super.findPage(odsTag);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param odsTag
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(OdsTag odsTag) {
		super.save(odsTag);
	}
	
	/**
	 * 更新状态
	 * @param odsTag
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(OdsTag odsTag) {
		super.updateStatus(odsTag);
	}
	
	/**
	 * 删除数据
	 * @param odsTag
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(OdsTag odsTag) {
		super.delete(odsTag);
	}
	
}