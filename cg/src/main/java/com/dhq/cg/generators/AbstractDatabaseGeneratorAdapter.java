package com.dhq.cg.generators;

import java.util.List;

import com.dhq.cg.bean.DataBaseAnalyzer;
import com.dhq.cg.bean.Table;
import com.dhq.cg.utils.JDBCUtils;


public abstract class AbstractDatabaseGeneratorAdapter extends AbstractGeneratorAdapter{
	
	private List<Table> tables;
	
	public List<Table> getTables() {
		if(this.tables==null||this.tables.size()==0){
			try {
				return DataBaseAnalyzer.getAllTables(JDBCUtils.getConnection());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} 
		}else{
			return this.tables;
		}
	}
	
	public void setTables(List<Table> tables){
		this.tables = tables;
	}


}
