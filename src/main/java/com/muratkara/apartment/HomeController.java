package com.muratkara.apartment;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.muratkara.entity.Expense;
import com.muratkara.service.ExpenseService;


@Controller
public class HomeController {
	public static String url = "http://localhost:8080/apartment";
	
	@Autowired
	private ExpenseService expenseService;
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest req) {

		return "redirect:/index";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homes(Model model, HttpServletRequest req) {
		
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req) {
		
		model.addAttribute("user",req.getSession().getAttribute("user"));
		
		System.out.println(req.getRemoteAddr());
		
		model.addAttribute("baslik","Apartman Gider Takip Sistemi");
		
		model.addAttribute("serverTime", "/" );
		
		model.addAttribute("giderler",expenseService.getExpenses());
		
		
		
		return "index";
	}
	
	@RequestMapping(value = "/addExpense",method = RequestMethod.POST)
	public ResponseEntity<String> addExpense(@RequestBody Expense expense,HttpServletRequest request){
		
		expense.setTotalValue(expense.getQuantity()*expense.getExpenseValue());
		
		System.out.println(expense.toString());
		
		expenseService.createExpense(expense);
		
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
		
	}
	
	
	@RequestMapping(value = "/addExpensePage", method = RequestMethod.GET)
	public String ekle(Model model) {
		
		
		return "addExpense";
	}
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(Model model) {
		
		
		return "detail";
	}
	@RequestMapping(value="/getExpenses", method=RequestMethod.POST)
	public ResponseEntity<ArrayList<Expense>> getExpenses(HttpServletRequest request){
		
		return new ResponseEntity<>(expenseService.getExpenses(),HttpStatus.CREATED);
		
	}
	
}
