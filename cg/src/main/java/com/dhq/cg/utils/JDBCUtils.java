package com.dhq.cg.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {

    // 数据源
    private static ComboPooledDataSource ds;

    /**
     * 获取数据库连接
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
    	
    	return getDataSource().getConnection();
    }

    /**
     * 获取数据源
     * @return
     */
    public static DataSource getDataSource() {
    	if(ds == null){
    		ds = new ComboPooledDataSource();
    	}
        return ds;
    }
}