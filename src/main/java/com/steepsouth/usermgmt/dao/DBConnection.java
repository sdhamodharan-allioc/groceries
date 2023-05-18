package com.steepsouth.usermgmt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 * @author Chandan Singh
 */
public class DBConnection
{
    public static Connection getConnection() throws SQLException
    {
        Connection connection = null;
        try{

            Context ctx = new InitialContext();
            DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/demo");
            connection = ds.getConnection();
            System.out.println(connection);
        }catch(Exception e){
            throw new SQLException(e);
        }finally {

        }

        return connection;
    }
}