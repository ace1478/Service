package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Vocabularyguideline;
import dakt.javatech.jhibernate.service.VocabularyguidelineService;
@RestController
public class VocabularyguidelineController {

	@Autowired
	VocabularyguidelineService vocabularyGuidelineService;
	
	@RequestMapping(value ="/getAllListVocabularyguideline", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularyguideline> List() {
		List<Vocabularyguideline> list = vocabularyGuidelineService.list();
		return list;
	}
	
	@RequestMapping(value ="/getListListVocabularyguidelineByLevelId/LevelId={id}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularyguideline> getListByLevelId(@PathVariable String id,@PathVariable int first,@PathVariable int max){
		 List<Vocabularyguideline> ListByLevelId = vocabularyGuidelineService.getListByLevelId(id, first, max);
		 return ListByLevelId;
		
	}
	
	@RequestMapping(value ="/getListVocabularyguidelineByLevel/levelId={level}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularyguideline> getListByLevelId(@PathVariable String level) {
		List<Vocabularyguideline> lstVocabGui = vocabularyGuidelineService.getListByLevelId(level);
		return lstVocabGui;
	}
	
	@RequestMapping(value ="/getListVocabularyguideline/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularyguideline> getListVocabularyguideline(@PathVariable int first, @PathVariable int max) {
		List<Vocabularyguideline> list = vocabularyGuidelineService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getVocabularyguidelineById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Vocabularyguideline getVocabularyguidelineById(@PathVariable int id) {
		return vocabularyGuidelineService.getById(id);
	}
	
	@RequestMapping(value ="/addVocabularyguideline", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addVocabularyguideline(@RequestBody Vocabularyguideline vocabularyguideline) {
		vocabularyGuidelineService.add(vocabularyguideline);
	}
	
	@RequestMapping(value = "/updateVocabularyguideline", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateVocabularyguideline(@RequestBody Vocabularyguideline vocabularyguideline) {
		vocabularyGuidelineService.update(vocabularyguideline);
	}

	@RequestMapping(value = "/deleteVocabularyguideline/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteVocabularyguideline(@PathVariable("id") int id) {
		vocabularyGuidelineService.delete(id);	
	}
	
}
