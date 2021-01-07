package com.muratkara.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratkara.service.ExpenseService;

@RestController
@RequestMapping(value = "/rest")
public class ExpenseEndpoint {
	
	@Autowired
	private ExpenseService expenseService;

}
