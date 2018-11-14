package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.GrammarguidelineDao;
import dakt.javatech.jhibernate.entity.Grammarguideline;

@Service
public class GrammarguidelineService {
	@Autowired GrammarguidelineDao GrammarguidelineDao;
	
	@Transactional
	public List<Grammarguideline> list(){
		return GrammarguidelineDao.list();
	}
	@Transactional
	public List<Grammarguideline> list(int first, int max){
		return GrammarguidelineDao.list(first, max);
	}
	@Transactional
	public Grammarguideline getById(int id) {
		return GrammarguidelineDao.getById(id);
	}
	@Transactional
	public void add(Grammarguideline sp) {
		GrammarguidelineDao.add(sp);
	}
	@Transactional
	public void delete(int id) {
		GrammarguidelineDao.delete(id);
	}
	@Transactional
	public List<Grammarguideline> getId(String s, int id){
		return GrammarguidelineDao.getId(s, id);
	}
	@Transactional
	public List<Grammarguideline> getListByLevelId(String level){
		return GrammarguidelineDao.getListByLevelId(level);
	}
	@Transactional
	public List<Grammarguideline> getListByLevelId(String id, int first, int max){
		return GrammarguidelineDao.getListByLevelId(id, first, max);
	}
	
}
