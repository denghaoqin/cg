package com.hiav.zgtj.smis.dpa.ui;

import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;

@Component
public class DpaSafetyMgmtWorkResourceUI extends
		BaseUI<DpaSafetyMgmtWorkResource, DpaSafetyMgmtWorkResourceService> {

	@DataProvider
	public Collection<DpaSafetyMgmtWorkResource> find(Map<String, Object> parameter,
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
	public void save(Collection<DpaSafetyMgmtWorkResource> datas)
			throws Exception {
		this.baseService.save(datas);
	}
}