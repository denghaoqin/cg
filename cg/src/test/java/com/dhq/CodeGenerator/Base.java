package com.dhq.CodeGenerator;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Base <E>{
	// 取得泛型实体的class
	@SuppressWarnings("unchecked")
	private Class<E> getEntityClass() {
		Type genType = this.getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		Class<E> entityClass = (Class<E>) params[0];
		return entityClass;
	}

	public Class<E> getE(){
		return getEntityClass();
	}
}
