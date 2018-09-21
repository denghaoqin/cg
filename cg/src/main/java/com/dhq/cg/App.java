package com.dhq.cg;

import java.util.List;

import com.dhq.cg.bean.DataBaseAnalyzer;
import com.dhq.cg.bean.Table;
import com.dhq.cg.generators.dorado.DoradoServiceGenerator;
import com.dhq.cg.generators.dorado.DoradoUIGenerator;
import com.dhq.cg.generators.dorado.DoradoViewGenerator;
import com.dhq.cg.generators.dorado.DoradoViewJsGenerator;
import com.dhq.cg.generators.dorado.HibernateEntityGenerator;
import com.dhq.cg.utils.JDBCUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	HibernateEntityGenerator hg = new HibernateEntityGenerator("dorado/hibernateEntity.tpl","output", "com.aster.crm.entity");
    	DoradoServiceGenerator dsg = new DoradoServiceGenerator("dorado/doradoService.tpl","output", "com.aster.crm.ship.service");
    	DoradoUIGenerator dug = new DoradoUIGenerator("dorado/doradoUI.tpl","output", "com.aster.crm.ship.ui");
    	DoradoViewGenerator dvg = new DoradoViewGenerator("dorado/doradoView1.tpl","output", "com.aster.crm.ship.view");
    	DoradoViewJsGenerator dvjg = new DoradoViewJsGenerator("dorado/doradoViewJs.tpl","output", "com.aster.crm.ship.view");
    	List<Table> allTables = DataBaseAnalyzer.getAllTables(JDBCUtils.getConnection(),"^ship.*$");
		hg.setTables(allTables);
		dsg.setTables(allTables);
		dug.setTables(allTables);
		dvg.setTables(allTables);
		dvjg.setTables(allTables);
		hg.start();
		dsg.start();
		dug.start();
		dvg.start();
		dvjg.start();
    }
}
