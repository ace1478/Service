package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	@RequestMapping(value ="/getListGrammarguidelineByLevelId/LevelId={LevelId}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Grammarguideline> getListByLevelId(@PathVariable String LevelId,@PathVariable int first,@PathVariable int max){
		 List<Grammarguideline> ListByLevelId = GrammarguidelineService.getListByLevelId(LevelId, first, max);
		 return ListByLevelId;
		
	}
	
	@RequestMapping(value ="/getListGrammarguidelineByLevelId/LevelId={LevelId}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Grammarguideline> getListByLevelId(@PathVariable String LevelId){
		 List<Grammarguideline> ListByLevelId = GrammarguidelineService.getListByLevelId(LevelId);
		 return ListByLevelId;
		
	}
}
