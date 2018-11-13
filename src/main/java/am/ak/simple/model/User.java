package  am.ak.simple.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

public class User {
	private String userName;
	private String password;
	private String email;

	@DateTimeFormat(iso = DATE, pattern = "dd-MM-yyyy")
	private Date birthDate;

	private String profession;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}
