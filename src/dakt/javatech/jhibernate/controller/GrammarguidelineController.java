package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Categorymember;
import dakt.javatech.jhibernate.entity.Grammarguideline;
import dakt.javatech.jhibernate.service.GrammarguidelineService;
import dakt.javatech.jhibernate.service.ListenquestionService;

@RestController
public class GrammarguidelineController {
	@Autowired
	GrammarguidelineService GrammarguidelineService;
	@RequestMapping(value ="/getListGrammarguideline", method = RequestMethod.GET, headers ="Accept=application/json")
	 public List<Grammarguideline> List(){
		List<Grammarguideline> list = GrammarguidelineService.list();
		return list;
	}
	@RequestMapping(value ="/getListGrammarguideline/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Grammarguideline> getListGrammarguideline(@PathVariable int first, @PathVariable int max) {
		List<Grammarguideline> list = GrammarguidelineService.list(first, max);
		return list;
	}
	@RequestMapping(value = "/getGrammarguidelineById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Grammarguideline getGrammarguidelineById(@PathVariable int id) {
		return GrammarguidelineService.getById(id);
	}
	@RequestMapping(value ="/addGrammarguideline", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addGrammarguideline(@RequestBody Grammarguideline gram) {
		GrammarguidelineService.add(gram);
	}
	@RequestMapping(value = "/updateGrammarguideline", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateGrammarguideline(@RequestBody Grammarguideline gram) {
		GrammarguidelineService.update(gram);
	}
	@RequestMapping(value = "/deleteGrammarguideline/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteGrammarguideline(@PathVariable("id") int id) {
		GrammarguidelineService.delete(id);	
	}
	

	@RequestMapping(value ="/getListGrammarguidelineByLevelIdPhanTrang/LevelId={id}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Grammarguideline> getListByLevelId(@PathVariable String id,@PathVariable int first,@PathVariable int max){
		 List<Grammarguideline> ListByLevelId = GrammarguidelineService.getListByLevelId(id, first, max);
		 return ListByLevelId;
		
	}
	
	@RequestMapping(value ="/getListGrammarguidelineByLevelId/LevelId={LevelId}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Grammarguideline> getListByLevelId(@PathVariable String LevelId){
		 List<Grammarguideline> ListByLevelId = GrammarguidelineService.getListByLevelId(LevelId);
		 return ListByLevelId;
		
	}
}
