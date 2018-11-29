package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.LevelDao;
import dakt.javatech.jhibernate.entity.Level;

@Service
public class LevelService {
	
	@Autowired LevelDao levelDAO;
	@Transactional
	public List<Level> list(){
		return levelDAO.list();
	}
	@Transactional
	public List<Level> list(int first, int max){
		return levelDAO.list(first, max);
	}
	@Transactional
	public Level getById(int id) {
		return levelDAO.getById(id);
	}
	@Transactional
	public void add(Level level) {
		levelDAO.add(level);
	}
	
	@Transactional
	public void update(Level level) {
		levelDAO.update(level);
	}
	
	@Transactional
	public void delete(int id) {
		levelDAO.delete(id);
	}
	@Transactional
	public List<Level> getId(String s, int id){
		return levelDAO.getId(s, id);
	}
	

}