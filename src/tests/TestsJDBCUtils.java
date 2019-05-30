package tests;

import utils.JDBCUtils;

public class TestsJDBCUtils {
	
	public static void main(String[] args) {
		
		JDBCUtils jdbc = new JDBCUtils();
		jdbc.getConnection();
	}

}
