package com.dhq.cg.utils;

import com.jfinal.template.Engine;
import com.jfinal.template.source.ClassPathSourceFactory;

public class EngineUtils {

	public static Engine engine = null;
	
	public static Engine getEngine(){
		if(engine==null){
			engine = Engine.create("myEngine");
			engine.setDevMode(true);
			engine.setSourceFactory(new ClassPathSourceFactory());
			engine.addSharedMethod(new StringUtils());
		}
		return engine;
	}
}
