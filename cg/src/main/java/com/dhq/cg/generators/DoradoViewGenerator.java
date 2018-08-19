package com.dhq.cg.generators;

import java.io.File;

import com.dhq.cg.utils.StringUtils;

public class DoradoViewGenerator extends SimpleDatabaseGenerator{

	public DoradoViewGenerator(String templateFileName,
			String outPutFileBaseDir, String packageNameBase) {
		super(templateFileName, outPutFileBaseDir, packageNameBase);
		// TODO Auto-generated constructor stub
	}

	public String getOutPutFilePath(String packageNameBase,String tableName){
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
		.append(".view")
		;
		return filePath.toString();
	}
	
}
