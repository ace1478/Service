package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Examination;
import dakt.javatech.jhibernate.service.ExaminationService;

@RestController

public class ExaminationController {
	
@Autowired ExaminationService examinationService;
	
	@RequestMapping(value ="/getAllListExamination", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Examination> List() {
		List<Examination> list = examinationService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListExamination/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Examination> getListExamination(@PathVariable int first, @PathVariable int max) {
		List<Examination> list = examinationService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getExaminationById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Examination getExaminationById(@PathVariable int id) {
		return examinationService.getById(id);
	}
	
	@RequestMapping(value ="/addExamination", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addExamination(@RequestBody Examination exam) {
		examinationService.add(exam);
	}
	
	@RequestMapping(value = "/updateExamination", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateExamination(@RequestBody Examination exam) {
		examinationService.update(exam);
	}

	@RequestMapping(value = "/deleteExamination/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteExamination(@PathVariable("id") int id) {
		examinationService.delete(id);	
	}

}
