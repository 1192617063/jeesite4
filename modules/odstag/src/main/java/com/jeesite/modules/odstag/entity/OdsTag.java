/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.odstag.entity;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 标准代码Entity
 * @author zyrho
 * @version 2020-12-15
 */
@Table(name="${_prefix}z_tag", alias="a", columns={
		@Column(name="id", attrName="id", label="编号", isPK=true),
		@Column(name="stan_cd_no", attrName="stanCdNo", label="标准代码编号", isUpdate=false),
		@Column(name="stan_cd_desc", attrName="stanCdDesc", label="标准代码描述", queryType=QueryType.LIKE),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class OdsTag extends DataEntity<OdsTag> {
	
	private static final long serialVersionUID = 1L;
	private String stanCdNo;		// 标准代码编号
	private String stanCdDesc;		// 标准代码描述
	
	public OdsTag() {
		this(null);
	}

	public OdsTag(String id){
		super(id);
	}
	
	@NotBlank(message="标准代码编号不能为空")
	@Length(min=0, max=10, message="标准代码编号长度不能超过 10 个字符")
	public String getStanCdNo() {
		return stanCdNo;
	}

	public void setStanCdNo(String stanCdNo) {
		this.stanCdNo = stanCdNo;
	}
	
	@Length(min=0, max=200, message="标准代码描述长度不能超过 200 个字符")
	public String getStanCdDesc() {
		return stanCdDesc;
	}

	public void setStanCdDesc(String stanCdDesc) {
		this.stanCdDesc = stanCdDesc;
	}
	
}