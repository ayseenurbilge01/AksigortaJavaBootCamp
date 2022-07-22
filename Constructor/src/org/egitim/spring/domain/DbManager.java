package org.egitim.spring.domain;

public class DbManager {
	
	public DbManager(String connectionURL, String user, String password, int timeoutMinute) {
		//Construction
		//Connection operations
	}
	
	public DbManager(String connectionURL, String user, String password) {
		int timeoutMinute = 60;
		//Construction
		//Connection operations
	}
	
	public boolean insertEntity(Object entity) {
		//Database operations
		return true;
	}
	
	public boolean updateEntity(Object entity) {
		//Database operations
		return true;
	}

}
