package com.dhq.cg;

import java.util.List;

import com.dhq.cg.bean.DataBaseAnalyzer;
import com.dhq.cg.bean.Table;
import com.dhq.cg.generators.dorado.DoradoServiceGenerator;
import com.dhq.cg.generators.dorado.DoradoUIGenerator;
import com.dhq.cg.generators.dorado.DoradoViewGenerator;
import com.dhq.cg.generators.dorado.DoradoViewJsGenerator;
import com.dhq.cg.generators.hibernate.HibernateEntityGenerator;
import com.dhq.cg.utils.JDBCUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	HibernateEntityGenerator hg = new HibernateEntityGenerator("hibernateEntity.tpl","output", "com.hiav.zgtj.smis.entity");
    	DoradoServiceGenerator dsg = new DoradoServiceGenerator("doradoService.tpl","output", "com.hiav.zgtj.smis.dpa.service");
    	DoradoUIGenerator dug = new DoradoUIGenerator("doradoUI.tpl","output", "com.hiav.zgtj.smis.dpa.ui");
    	DoradoViewGenerator dvg = new DoradoViewGenerator("doradoView.tpl","output", "com.hiav.zgtj.smis.dpa.view");
    	DoradoViewJsGenerator dvjg = new DoradoViewJsGenerator("doradoViewJs.tpl","output", "com.hiav.zgtj.smis.dpa.view");
    	//List<String> tables = new ArrayList<String>();
    	//tables.add("dpa_daily_plan");
    	List<Table> allTables = DataBaseAnalyzer.getAllTables(JDBCUtils.getConnection(),"^dpa.*$");
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
