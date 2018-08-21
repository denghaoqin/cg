package com.hiav.zgtj.smis.dpa.ui;

import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;

@Component
public class DpaSafetyDisclosureMeasureUI extends
		BaseUI<DpaSafetyDisclosureMeasure, DpaSafetyDisclosureMeasureService> {

	@DataProvider
	public Collection<DpaSafetyDisclosureMeasure> find(Map<String, Object> parameter) {
		return this.baseService.find(parameter);
	}

	@Transactional(rollbackFor = Exception.class)
	@Expose
	public void delete(String levelId) throws Exception {
		this.baseService.delete(levelId);
	}

	@Transactional(rollbackFor = Exception.class)
	@DataResolver
	public void save(Collection<DpaSafetyDisclosureMeasure> datas)
			throws Exception {
		this.baseService.save(datas);
	}
}