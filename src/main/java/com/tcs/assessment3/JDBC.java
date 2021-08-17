package com.tcs.assessment3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
		public static void main(String[] args) {
			String DB_URL = "jdbc:mysql://localhost/bankaccount";
			String DB_USER = "root";
			String DB_PASSWORD = "Nuvelabs123$";

			try(Connection connection=DriverManager.getConnection(DB_URL, DB_USER,DB_PASSWORD);
					Statement statement = connection.createStatement();){
//				create(statement);//create operation
//				update(statement);
				delete(statement);
//				List<String> reg = retrieveWithCondittion(statement, "A");
//				logger.debug(reg.toString());
//				sort(statement);
				 retrieve(statement);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			;
		}
		
		private static void create(Statement statement) throws SQLException {
			statement.execute("INSERT INTO ACCOUNT VALUES('Pooja','Kalyan West','2021-07-11','active','saving')");
			statement.execute("INSERT INTO account values('Aniket','Chembur East','2021-08-04','inactive','saving')");
		}
		private static void retrieve(Statement statement) throws SQLException {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM account");

			while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " | "+ resultSet.getNString("name") + " | " + resultSet.getNString("address") + " | " + resultSet.getDate("dateCreated")+ resultSet.getNString("status") + " | " + resultSet.getNString("accountType") );
			}
			System.out.println("");
		}
		
		private static void update(Statement statement) throws SQLException {
			statement.execute("UPDATE account SET ownerName='Siddhi' WHERE idaccount=9");
		}
		
		private static void delete(Statement statement) throws SQLException {
			statement.execute("DELETE FROM account WHERE idaccount=9");
		}
	}

