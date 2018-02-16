package org.springframework.samples.petclinic.bill;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.visit.Visit;

@Entity
@Table( name = "facturas" )
public class Bill extends BaseEntity {

	@Column( name = "id_number", length = 10 )
	private long idNumber;

	@Column( name = "payment_date" )
	@Temporal( TemporalType.DATE )
	@DateTimeFormat( pattern = "yyyy/MM/dd" )
	private Date paymentDate;

	@Column( name = "money" )
	@Digits( integer = 5, fraction = 2 )
	@DecimalMin( "0.0" )
	private double money;

	@OneToOne( fetch = FetchType.LAZY, mappedBy = "bill", cascade = CascadeType.ALL )
	private Visit visit;

	//Constructor
	public Bill(  ){

	}

	/**
	 * @return the idNumber
	 */
	public long getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * @return the visit
	 */
	public Visit getVisit() {
		return visit;
	}

	/**
	 * @param visit the visit to set
	 */
	public void setVisit(Visit visit) {
		this.visit = visit;
	}
}