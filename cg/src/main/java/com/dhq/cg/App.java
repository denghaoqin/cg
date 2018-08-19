package com.dhq.cg;

import java.util.ArrayList;
import java.util.List;

import com.dhq.cg.generators.HibernateEntityGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	HibernateEntityGenerator hg = new HibernateEntityGenerator();
    	List<String> tables = new ArrayList<String>();
    	tables.add("dpa_check_task");
		hg.setTables(tables);
    	hg.start();
    }
}
