package com.dhq.cg;

import com.dhq.cg.generators.CodeGenerator;

public abstract class AbstractGeneratorAdapter implements CodeGenerator{
	
	private String templateFileName;
	
	private String outPutFileName;
	
	public void setOutPutFileName(String fileName) {
		this.outPutFileName = fileName;
		
	}

	public void setTemplateFileName(String fileName) {
		this.templateFileName = fileName;
		
	}

	public String getTemplateFileName() {
		return templateFileName;
	}

	public String getOutPutFileName() {
		return outPutFileName;
	}

}
