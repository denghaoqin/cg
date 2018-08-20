package #(table.packageNameBase);

import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;

@Component
public class #(capitalFirstChar(hump(table.tableName)))UI extends
		BaseUI<#(capitalFirstChar(hump(table.tableName))), #(capitalFirstChar(hump(table.tableName)))Service> {

	@DataProvider
	public Collection<#(capitalFirstChar(hump(table.tableName)))> find(Map<String, Object> parameter) {
		return this.baseService.find(parameter);
	}

	@Transactional(rollbackFor = Exception.class)
	@Expose
	public void delete(String levelId) throws Exception {
		this.baseService.delete(levelId);
	}

	@Transactional(rollbackFor = Exception.class)
	@DataResolver
	public void save(Collection<#(capitalFirstChar(hump(table.tableName)))> datas)
			throws Exception {
		this.baseService.save(datas);
	}
}