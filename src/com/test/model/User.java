package com.test.model;

import java.util.Date;

public class User {
 
	  private String USER_ID;
	  private String IP_ADDRESS;
	  private String HOST_NAME;
	  private Date TOKEN;
	  private String LAST_UPD_DATE;
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getIP_ADDRESS() {
		return IP_ADDRESS;
	}
	public void setIP_ADDRESS(String iP_ADDRESS) {
		IP_ADDRESS = iP_ADDRESS;
	}
	public String getHOST_NAME() {
		return HOST_NAME;
	}
	public void setHOST_NAME(String hOST_NAME) {
		HOST_NAME = hOST_NAME;
	}
	public Date getTOKEN() {
		return TOKEN;
	}
	public void setTOKEN(Date tOKEN) {
		TOKEN = tOKEN;
	}
	public String getLAST_UPD_DATE() {
		return LAST_UPD_DATE;
	}
	public void setLAST_UPD_DATE(String lAST_UPD_DATE) {
		LAST_UPD_DATE = lAST_UPD_DATE;
	}
	

}
