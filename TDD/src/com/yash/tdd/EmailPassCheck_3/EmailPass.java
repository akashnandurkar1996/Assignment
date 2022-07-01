package com.yash.tdd.EmailPassCheck_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class User {
	String email;
	String password;

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
}

public class EmailPass {

	public static boolean checkdetails(String email, String password) throws Exception {

		boolean userfound = false;
		List<User> userlist = new ArrayList<>();

		// database connectivity set up
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from user");

		while (rs.next()) {
			userlist.add(new User(rs.getString("email"), rs.getString("password")));
		}
		for (User u : userlist) {
			if (u.email.equals(email) && u.password.equals(password)) {
				userfound = true;
			}
		}
		return userfound;
	}
}
