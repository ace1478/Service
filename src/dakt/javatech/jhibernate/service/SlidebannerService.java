package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.SlidebannerDao;
import dakt.javatech.jhibernate.entity.Slidebanner;

@Service
public class SlidebannerService {
	@Autowired SlidebannerDao slidebannerDao;
	@Transactional
	public List<Slidebanner> list(){
		return slidebannerDao.list();
	}
	@Transactional
	public List<Slidebanner> list(int first, int max){
		return slidebannerDao.list(first, max);
	}
	@Transactional
	public Slidebanner getById(int id) {
		return slidebannerDao.getById(id);
	}
	@Transactional
	public void add(Slidebanner slidebanner) {
		slidebannerDao.add(slidebanner);
	}
	@Transactional
	public void update(Slidebanner slidebanner) {
		slidebannerDao.update(slidebanner);
	}
	@Transactional
	public void delete(int id) {
		slidebannerDao.delete(id);
	}
	@Transactional
	public List<Slidebanner> getId(String s, int id){
		return slidebannerDao.getId(s, id);
	}
}
