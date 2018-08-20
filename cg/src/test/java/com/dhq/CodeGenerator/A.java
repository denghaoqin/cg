package com.dhq.CodeGenerator;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;

public class A<E> extends B<String>{

	public static void main(String[] args) {
		A<String> a = new A<String>();
		Class tClass = (Class)((ParameterizedType)a.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        System.out.println(tClass);
        
	}
}
