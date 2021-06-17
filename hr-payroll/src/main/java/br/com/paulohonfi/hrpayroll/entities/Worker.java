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
public class Worker implements Serializable {

	private static final long serialVersionUID = -632731150871774437L;

	private Long id;

	private String name;

	private Double dailyIncome;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

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

}
