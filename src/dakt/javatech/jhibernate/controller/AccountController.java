package dakt.javatech.jhibernate.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Account;
import dakt.javatech.jhibernate.service.AccountService;
@RestController
public class AccountController {
	@Autowired
	AccountService accService;
	
	@RequestMapping(value ="/getAccount", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Account> getAccount() {
		
		List<Account> listAcc = accService.list();
		return listAcc;
	}
}
