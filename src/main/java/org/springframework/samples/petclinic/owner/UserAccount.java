//package org.springframework.samples.petclinic.owner;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.samples.petclinic.model.BaseEntity;
//
//@Entity
//@Table( name = "user_account" )
//public class UserAccount extends BaseEntity {
//
//	@Column( name = "user_name", unique = true )
//	private String userName;
//	
//	@Column( name = "password", unique = true )
//	private String password;
//	
//	@Column( name = "creation_date" )
//	@Temporal( TemporalType.DATE )
//	@DateTimeFormat( pattern = "dd/MM/yyyy hh:mm:ss" )
//	private Date creationDate;
//	
//	@ManyToOne
//    @JoinColumn( name = "user" )
//	private Owner user;
//	
//	/**
//	 * @return the userName
//	 */
//	public String getUserName() {
//		return userName;
//	}
//
//	/**
//	 * @param userName the userName to set
//	 */
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	/**
//	 * @return the password
//	 */
//	public String getPassword() {
//		return password;
//	}
//
//	/**
//	 * @param password the password to set
//	 */
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	/**
//	 * @return the creationDate
//	 */
//	public Date getCreationDate() {
//		return creationDate;
//	}
//
//	/**
//	 * @param creationDate the creationDate to set
//	 */
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}
//
//	/**
//	 * @return the user
//	 */
//	public Owner getUser() {
//		return user;
//	}
//
//	/**
//	 * @param user the user to set
//	 */
//	public void setUser(Owner user) {
//		this.user = user;
//	}
//	
//}
