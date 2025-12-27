package com.api.models.request;

public class profilerequest {
	private String firstName;
	private String  lastName;
	private String   email;
	private int  mobileNumber;
	public profilerequest(String firstName, String lastName, String email, int mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "profilerequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public static class Builder {
		private String firstName;
		private String  lastName;
		private String   email;
		private  int  mobileNumber;
		
		public Builder firstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		public Builder lastName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		public Builder email(String email) {
			this.email=email;
			return this;
		}
		public Builder mobileNumber(int mobileNumber) {
			this.mobileNumber=mobileNumber;
			return this;
		}
		
		public  profilerequest build() {
			profilerequest profilereq=new profilerequest(firstName,lastName,email,mobileNumber);
			return profilereq;
		}
	}
}
