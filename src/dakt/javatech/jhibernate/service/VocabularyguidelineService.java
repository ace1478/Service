package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.VocabularyguidelineDao;
import dakt.javatech.jhibernate.entity.Vocabularyguideline;
@Service
public class VocabularyguidelineService {
	@Autowired VocabularyguidelineDao vocabularyGuidelineDao;
	
	@Transactional
	public List<Vocabularyguideline> list()
	{
		return vocabularyGuidelineDao.list();
	}
	
	@Transactional
	public List<Vocabularyguideline> list(int first, int max)
	{
		return vocabularyGuidelineDao.list(first,max);
	}
	
	@Transactional
	public Vocabularyguideline getById(int id)
	{
		return vocabularyGuidelineDao.getById(id);
	}
	
	@Transactional
	public void add(Vocabularyguideline vocabularyguideline)
	{
		vocabularyGuidelineDao.add(vocabularyguideline);
	}
	
	@Transactional
	public void update(Vocabularyguideline vocabularyguideline)
	{
		vocabularyGuidelineDao.update(vocabularyguideline);
	}
	
	@Transactional
	public void delete(int id)
	{
		vocabularyGuidelineDao.delete(id);;
	}
	
	@Transactional
	public List<Vocabularyguideline> getId(String s, int id)
	{
		return vocabularyGuidelineDao.getId(s,id);
	}
	
	@Transactional
	public List<Vocabularyguideline> getListByLevelId(String level)
	{		
		return vocabularyGuidelineDao.getListByLevelId(level);
	}
	
	@Transactional
	public List<Vocabularyguideline> getListByLevelId(String id, int first, int max)
	{
		return vocabularyGuidelineDao.getListByLevelId(id, first, max);
	}


}
