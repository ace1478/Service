package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Examinationquestion;
import dakt.javatech.jhibernate.service.ExaminationquestionService;

@RestController

public class ExaminationquestionController {
	
	@Autowired ExaminationquestionService examinationquestionService;
	
	@RequestMapping(value ="/getAllListExaminationquestion", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Examinationquestion> List() {
		List<Examinationquestion> list = examinationquestionService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListExaminationquestion/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Examinationquestion> getListExaminationquestion(@PathVariable int first, @PathVariable int max) {
		List<Examinationquestion> list = examinationquestionService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getExaminationquestionById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Examinationquestion getExaminationquestionById(@PathVariable int id) {
		return examinationquestionService.getById(id);
	}
	
	@RequestMapping(value ="/addExaminationquestion", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addExaminationquestion(@RequestBody Examinationquestion examquestion) {
		examinationquestionService.add(examquestion);
	}
	
	@RequestMapping(value = "/updateExaminationquestion", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateExaminationquestion(@RequestBody Examinationquestion examquestion) {
		examinationquestionService.update(examquestion);
	}

	@RequestMapping(value = "/deleteExaminationquestion/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteExaminationquestion(@PathVariable("id") int id) {
		examinationquestionService.delete(id);	
	}
	@RequestMapping(value="/getListExaminationquestionByPart/part={part}&examinationId={examinationId}", method = RequestMethod.GET, headers ="Accept=application/json" )
	public List<Examinationquestion> getListByPart(@PathVariable String part,@PathVariable String examinationId)
	{
		List<Examinationquestion> list=examinationquestionService.getListByPart(part,examinationId);
		return list;
	}
	@RequestMapping(value="/getListExaminationquestionByExaminationId/ExaminationId={ExaminationId}", method = RequestMethod.GET, headers ="Accept=application/json" )
	public List<Examinationquestion> getListByExaminationId(@PathVariable int ExaminationId)
	{
		List<Examinationquestion> list=examinationquestionService.getListByExaminationId(ExaminationId);
		return list;
	}
}
