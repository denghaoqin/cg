package com.dhq.cg.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {

    // ���c3p0���ӳض���
    private static ComboPooledDataSource ds;

    /**
     * ������ݿ����Ӷ���
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
    	
    	return   getDataSource().getConnection();
    }

    /**
     * ���c3p0���ӳض���
     * @return
     */
    public static DataSource getDataSource() {
    	if(ds == null){
    		ds = new ComboPooledDataSource();
    	}
        return ds;
    }
}