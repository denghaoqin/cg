package com.hiav.zgtj.smis.dpa.ui;

import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;

@Component
public class DpaFieldSafetyResourceUI extends
		BaseUI<DpaFieldSafetyResource, DpaFieldSafetyResourceService> {

	@DataProvider
	public Collection<DpaFieldSafetyResource> find(Map<String, Object> parameter,
			Criteria filterCriteria) {
		return this.baseService.find(parameter,filterCriteria);
	}

	@Transactional(rollbackFor = Exception.class)
	@Expose
	public void delete(String levelId) throws Exception {
		this.baseService.delete(levelId);
	}

	@Transactional(rollbackFor = Exception.class)
	@DataResolver
	public void save(Collection<DpaFieldSafetyResource> datas)
			throws Exception {
		this.baseService.save(datas);
	}
}