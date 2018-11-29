package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dakt.javatech.jhibernate.entity.Readexercise;

@Component 
@Transactional
public class ReadexerciseDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Readexercise> list()
	{
		String hql="FROM Readexercise";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Readexercise> list(int first, int max)
	{
		String hql="FROM Readexercise";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Readexercise getById(int id)
	{
		return (Readexercise)sessionFactory.getCurrentSession().get(Readexercise.class, id);
	}
	public void add(Readexercise readexercise)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(readexercise);
	}

	public void update(Readexercise readexercise) {
		sessionFactory.getCurrentSession().update(readexercise);
	}
	
	public void delete(int id)
	{
		Readexercise readexercise=getById(id);
		sessionFactory.getCurrentSession().delete(readexercise);
	}
	
	public List<Readexercise> getId(String s, int id)
	{
		String hql="FROM Readexercise WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Readexercise>)query.list();
	}
	
	public List<Readexercise> getListByLevelId(String level){
		String hql="FROM Readexercise WHERE levelid='"+ level +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Readexercise>)query.list();
	}
	
	public List<Readexercise> getListByLevelIdPage(String level, int first, int max)
	{
		String hql="From Readexercise  where levelid ='"+level+"'"; 
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}

}
