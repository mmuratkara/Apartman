package com.muratkara.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.muratkara.entity.Expense;

@Repository
public class ExpenseDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Long insert(Expense expense) {
		return (Long) sessionFactory.getCurrentSession().save(expense);
	}
	
	public void update(Expense expense) {
		sessionFactory.getCurrentSession().update(expense);
	}
	
	public void persist(Expense expense) {
		sessionFactory.getCurrentSession().persist(expense);
	}
	
	public void delete(Expense expense) {
		sessionFactory.getCurrentSession().delete(expense);
	}
	
	public ArrayList<Expense> getExpense(){
		Query query =sessionFactory.getCurrentSession().createQuery("FROM Expense");
		return (ArrayList<Expense>) query.getResultList();
		
	}
	
	public Expense getFindById(Long id){
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Expense WHERE id=:id")
				.setLong("id", id);
		return (Expense) query.getSingleResult();
		}
	
}
