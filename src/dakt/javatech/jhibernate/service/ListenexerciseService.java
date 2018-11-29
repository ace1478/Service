package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ListenexerciseDao;
import dakt.javatech.jhibernate.entity.Listenexercise;

@Service
public class ListenexerciseService {
	@Autowired
	ListenexerciseDao listenexrDAO;
	@Transactional
	public List<Listenexercise> list(){
		return listenexrDAO.list();
	}
	@Transactional
	public List<Listenexercise> list(int first, int max)
	{
		return listenexrDAO.list(first,max);
	}
	@Transactional
	public List<Listenexercise> getListByLevelId(String id, int first, int max)
	{
		return listenexrDAO.getListByLevelId(id,first,max);
	}
	@Transactional
	public List<Listenexercise> getListByLevelId(String id)
	{
		return listenexrDAO.getListByLevelId(id);

	}
	@Transactional
	public Listenexercise getById(int id)
	{
		return listenexrDAO.getById(id);
	}
	
	@Transactional
	public void add(Listenexercise listenexercise)
	{
		 listenexrDAO.add(listenexercise);
	}
	
	@Transactional
	public void update(Listenexercise listenexercise)
	{
		 listenexrDAO.update(listenexercise);;
	}
	
	@Transactional
	public void delete(int id)
	{
		listenexrDAO.delete(id);
	}
	@Transactional
	public List<Listenexercise> getId(String s, int id)
	{
		return listenexrDAO.getId(s,id);
	}
}
