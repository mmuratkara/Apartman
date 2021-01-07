package com.muratkara.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type;
	@Column(nullable = false)
	private float expenseValue;
	
	@Column(nullable = false)
	private int quantity;
	
	@Column(length = 500)
	private String note;
	
	private Date createDate;
	private float totalValue;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getExpenseValue() {
		return expenseValue;
	}


	public void setExpenseValue(float expenseValue) {
		this.expenseValue = expenseValue;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public float getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(float totalValue) {
		this.totalValue = totalValue;
	}


	@Override
	public String toString() {
		return "Expense [id=" + id + ", type=" + type + ", expenseValue=" + expenseValue + ", quantity=" + quantity
				+ ", note=" + note + ", createDate=" + createDate + ", totalValue=" + totalValue + "]";
	}
	
}
