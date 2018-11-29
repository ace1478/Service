package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ListenquestionDao;
import dakt.javatech.jhibernate.entity.Listenquestion;
@Service
public class ListenquestionService {
	@Autowired ListenquestionDao listenQuestionDao; 
	
	@Transactional
	public List<Listenquestion> list()
	{
		return listenQuestionDao.list();
	}
	@Transactional
	public List<Listenquestion> list(int first, int max)
	{
		return listenQuestionDao.list(first, max);
	}
	@Transactional
	public  Listenquestion getById(int id)
	{
		return listenQuestionDao.getById(id);
	}
	@Transactional
	public void add(Listenquestion listenquestion)
	{
		listenQuestionDao.add(listenquestion);
	}
	
	@Transactional
	public void update(Listenquestion listenquestion)
	{
		listenQuestionDao.update(listenquestion);
	}
	
	@Transactional
	public void delete(int id)
	{
		listenQuestionDao.delete(id);
	}
	@Transactional
	public List<Listenquestion> getId(String s, int id)
	{
		return listenQuestionDao.getId(s, id);
	}
	@Transactional
	public List<Listenquestion> getListByListenExerciseId(String ListenExerciseId,int first, int max) 
	{
		return listenQuestionDao.getListByListenExerciseId(ListenExerciseId, first, max);
	}
	@Transactional
	public List<Listenquestion> getListByListenExerciseId(String ListenExerciseId) 
	{
		return listenQuestionDao.getListByListenExerciseId(ListenExerciseId);
	}
		
		

}
