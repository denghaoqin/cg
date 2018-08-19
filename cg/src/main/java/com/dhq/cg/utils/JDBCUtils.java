package com.dhq.cg.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {

    // 获得c3p0连接池对象
    private static ComboPooledDataSource ds;

    /**
     * 获得数据库连接对象
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
    	
    	return   getDataSource().getConnection();
    }

    /**
     * 获得c3p0连接池对象
     * @return
     */
    public static DataSource getDataSource() {
    	if(ds == null){
    		ds = new ComboPooledDataSource();
    	}
        return ds;
    }
}