//package org.springframework.samples.petclinic;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.PreparedStatement;
//
////import com.mysql.jdbc.PreparedStatement;
//
//public class JDBCApplication {
//	public static void main( String[] args ) {
//		System.out.println("-------- Test de conexión con MySQL ------------");
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("No encuentro el driver en el Classpath");
//			e.printStackTrace();
//			return;
//		}
//	
//		System.out.println("Driver instalado y funcionando");
//		Connection connection = null;
//		Statement statement = null;
//		try {
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/petclinic","root", "root");
//			if (connection != null) {
//				System.out.println("Conexión establecida");
//			
//				statement = connection.createStatement();
//				
