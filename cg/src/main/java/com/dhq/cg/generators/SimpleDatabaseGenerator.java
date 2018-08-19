package com.dhq.cg.generators;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dhq.cg.AbstractDatabaseGeneratorAdapter;
import com.dhq.cg.bean.Table;
import com.dhq.cg.utils.StringUtils;
import com.dhq.cg.utils.TemplateUtils;


public abstract class SimpleDatabaseGenerator extends AbstractDatabaseGeneratorAdapter{
	
	public SimpleDatabaseGenerator(String templateFileName,String outPutFileBaseDir,String packageNameBase) {
		super();
		this.templateFileName = templateFileName;
		this.outPutFileBaseDir = outPutFileBaseDir;
		this.packageNameBase = packageNameBase;
	}

	private String outPutFileBaseDir;
	
	private String templateFileName;
	
	private String packageNameBase;
	
	public void start(){
		try {
			
			List<Table> list = this.getTables();
			
			for(Table t:list){
				t.setPackageNameBase(packageNameBase);
				Map<String, Table> data = new HashMap<String, Table>();
				data.put("table", t);
				
				TemplateUtils.renderToFile(this.getTemplateFileName(), data, this.getOutPutFilePath(t.getPackageNameBase(),t.getTableName()));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public String getOutPutFilePath(String packageNameBase,String tableName) {
		/*StringBuffer filePath = new StringBuffer(this.getClass().getResource("/").getPath())
		.append(File.separator)*/
		StringBuffer filePath = new StringBuffer()
		.append(System.getProperty("user.dir"))
		.append(File.separator)
		.append(this.getOutPutFileBaseDir())
		.append(File.separator)
		.append(packageNameBase.replaceAll("\\.", "/"))
		.append(File.separator)
		.append(StringUtils.capitalFirstChar(StringUtils.hump(tableName)))
		.append(".java")
		;
		return filePath.toString();
	}

	public String getOutPutFileBaseDir() {
		return this.outPutFileBaseDir;
	}

	public String getTemplateFileName() {
		return templateFileName;
	}

	public void setTemplateFileName(String templateFileName) {
		this.templateFileName = templateFileName;
	}

}
