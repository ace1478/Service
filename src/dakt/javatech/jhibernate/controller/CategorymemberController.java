package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Categorymember;
import dakt.javatech.jhibernate.entity.ListenGuideline;
import dakt.javatech.jhibernate.service.CategorymemberService;



@RestController

public class CategorymemberController {
	
	@Autowired CategorymemberService categorymemberService;
	
	@RequestMapping(value ="/getAllListCategorymember", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Categorymember> List() {
		List<Categorymember> list = categorymemberService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListCategorymember/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Categorymember> getListCategorymember(@PathVariable int first, @PathVariable int max) {
		List<Categorymember> list = categorymemberService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getCategorymemberById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Categorymember getCategorymemberById(@PathVariable int id) {
		return categorymemberService.getById(id);
	}
	
	@RequestMapping(value ="/addCategorymember", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addCategorymember(@RequestBody Categorymember cate) {
		categorymemberService.add(cate);
	}
	
	@RequestMapping(value = "/updateCategorymember", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateCategorymember(@RequestBody Categorymember catemember) {
		categorymemberService.update(catemember);
	}

	@RequestMapping(value = "/deleteCategorymember/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCategorymember(@PathVariable("id") int id) {
		categorymemberService.delete(id);	
	}

}
