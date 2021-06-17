/**
 * 
 */
package br.com.paulohonfi.hrpayroll.entities;

import java.io.Serializable;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
public class Payment implements Serializable {
	
	private static final long serialVersionUID = 1214348443958153427L;

	public Payment() {
	}

	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	private String name;
	
	private Double dailyIncome;
	
	private Integer days;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dailyIncome
	 */
	public Double getDailyIncome() {
		return dailyIncome;
	}

	/**
	 * @param dailyIncome the dailyIncome to set
	 */
	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	/**
	 * @return the days
	 */
	public Integer getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(Integer days) {
		this.days = days;
	}
	
	public Double getTotal() {
		return days * dailyIncome;
	}
	
}
