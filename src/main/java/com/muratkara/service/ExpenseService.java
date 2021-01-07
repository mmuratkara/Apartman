package com.muratkara.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.muratkara.dao.ExpenseDAO;
import com.muratkara.entity.Expense;

@Service
@Transactional
public class ExpenseService {
	
	@Autowired
	private ExpenseDAO expenseDAO;
	
	
	public Long createExpense(Expense expense) {
		
		return expenseDAO.insert(expense);
	}
	public void updateExpense(Expense expense) {
		 expenseDAO.update(expense);
	}
	public void deleteExpense(Expense expense) {
		 expenseDAO.delete(expense);
	}
	
	public ArrayList<Expense> getExpenses(){
		return expenseDAO.getExpense();
		
	}

}
