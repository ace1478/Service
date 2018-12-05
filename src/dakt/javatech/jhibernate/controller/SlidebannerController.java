package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Level;
import dakt.javatech.jhibernate.entity.Slidebanner;
import  dakt.javatech.jhibernate.service.SlidebannerService;

@RestController
public class SlidebannerController {
	@Autowired SlidebannerService  SlidebannerService;
	@RequestMapping(value ="/getListSlidebanner", method = RequestMethod.GET, headers ="Accept=application/json")
	 public List<Slidebanner> List(){
		List<Slidebanner> list = SlidebannerService.list();
		return list;
	}
	@RequestMapping(value ="/getListSlidebanner/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Slidebanner> getListBySlidebanner(@PathVariable int first, @PathVariable int max) {
		List<Slidebanner> list = SlidebannerService.list(first, max);
		return list;
	}
	@RequestMapping(value = "/getSlidebanner/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Slidebanner getLevelById(@PathVariable int id) {
		return SlidebannerService.getById(id);
	}
	@RequestMapping(value = "/addSlidebanner", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addSlidebanner(@RequestBody Slidebanner slidebanner) {	
		SlidebannerService.add(slidebanner);
	}
	@RequestMapping(value = "/updateSlidebanner", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateSlidebanner(@RequestBody Slidebanner slidebanner) {
		SlidebannerService.update(slidebanner);
	}
	@RequestMapping(value = "/deleteSlidebanner/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteLevel(@PathVariable("id") int id) {
		SlidebannerService.delete(id);	
	}
}
