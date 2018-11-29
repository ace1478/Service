package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ReadexerciseDao;
import dakt.javatech.jhibernate.entity.Readexercise;

@Service
public class ReadExerciseService {

	@Autowired
	ReadexerciseDao readExerciseDao;
	
	@Transactional
	public List<Readexercise> list()
	{
		return readExerciseDao.list();
	}
	
	@Transactional
	public List<Readexercise> list(int first, int max)
	{
		return readExerciseDao.list(first, max);
	}
	
	@Transactional
	public Readexercise getById(int id)
	{
		return readExerciseDao.getById(id);
	}
	
	@Transactional
	public void add(Readexercise readexercise)
	{
		readExerciseDao.add(readexercise);
	}
	
	@Transactional
	public void update(Readexercise readexercise)
	{
		readExerciseDao.update(readexercise);
	}
	
	@Transactional
	public void delete(int id)
	{
		readExerciseDao.delete(id);
	}
	
	@Transactional
	public List<Readexercise> getId(String s, int id)
	{
		return readExerciseDao.getId(s, id);
	}
	
	@Transactional
	public List<Readexercise> getListByLevelId(String level){
		return readExerciseDao.getListByLevelId(level);
	}
	
	public List<Readexercise> getListByLevelIdPage(String level, int first, int max)
	{
		return readExerciseDao.getListByLevelIdPage(level, first, max);
	}
	
}
