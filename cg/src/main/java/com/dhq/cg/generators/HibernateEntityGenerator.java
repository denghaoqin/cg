package com.dhq.cg.generators;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dhq.cg.AbstractGeneratorAdapter;
import com.dhq.cg.bean.DataBaseAnalyzer;
import com.dhq.cg.bean.Table;
import com.dhq.cg.utils.JDBCUtils;
import com.dhq.cg.utils.StringUtils;
import com.jfinal.template.Engine;
import com.jfinal.template.Template;
import com.jfinal.template.source.ClassPathSourceFactory;

public class HibernateEntityGenerator extends AbstractGeneratorAdapter{
	
	private List<String> tables;
	
	public void start(){
		try {
			
			List<Table> allTables = DataBaseAnalyzer.getAllTables(JDBCUtils.getConnection());
			List<Table> list;
			if(tables==null||tables.size()==0){
				list = allTables;
			}else{
				list = new ArrayList<Table>();
				for(String table:tables ){
					for(Table t:allTables){
						if(t.getTableName().toLowerCase().equals(table.toLowerCase())){
							list.add(t);
							continue;
						}
					}
				}
			}
			
			Engine engine = Engine.create("myEngine");
			engine.setDevMode(true);
			engine.setSourceFactory(new ClassPathSourceFactory());
			engine.addSharedMethod(new StringUtils());
			Template template = engine.getTemplate("tpl/hibernateEntity.tpl");
			for(Table t:list){
				t.setPackageNameBase("com.hiav.zgtj.smis.entity");
				Map<String, Table> data = new HashMap<String, Table>();
				data.put("table", t);
				template.render(data , new File(StringUtils.hump(t.getTableName())));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<String> getTables() {
		return tables;
	}

	public void setTables(List<String> tables) {
		this.tables = tables;
	}
	
}
