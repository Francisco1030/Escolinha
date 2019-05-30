package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	public Connection getConnection(){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolinha", "root", "");
//			System.out.println("Conectado");
			return con;
					 
		}catch (SQLException e){
//			System.out.println("ERRO");
//			System.out.println(e.getMessage());
			return null;
		}finally {
//			System.out.println("SEMPRE VAI EXECUTAR");
		}
	}
}
