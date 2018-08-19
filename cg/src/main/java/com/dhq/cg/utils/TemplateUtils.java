package com.dhq.cg.utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.jfinal.template.Engine;
import com.jfinal.template.Template;

public class TemplateUtils {
	
	private static String templateFileBaseDir ="tpl";
	
	public static void renderToFile(String templateFileName,Map<?, ?> data,String outFileName) throws IOException{
		
		Engine engine = EngineUtils.getEngine();
		Template template = engine.getTemplate(getTemplateFilePath(templateFileName));
		File file = new File(outFileName);
	    if(!file.getParentFile().exists()) {
	    	file.getParentFile().mkdirs();
        }

		if(!file.exists()){
			file.createNewFile();
		}
		template.render(data , file);
	}

	private static String getTemplateFilePath(String templateFileName) {
		return templateFileBaseDir+File.separator + templateFileName;
	}

}
