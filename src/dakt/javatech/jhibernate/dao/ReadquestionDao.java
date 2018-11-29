package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dakt.javatech.jhibernate.entity.Readquestion;

@Component 
@Transactional
public class ReadquestionDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Readquestion> list()
	{
		String hql="FROM Readquestion";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Readquestion> list(int first, int max)
	{
		String hql="FROM Readquestion";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Readquestion getById(int id)
	{
		return (Readquestion)sessionFactory.getCurrentSession().get(Readquestion.class, id);
	}
	public void add(Readquestion readquestion)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(readquestion);
	}

	public void update(Readquestion readquestion) {
		sessionFactory.getCurrentSession().update(readquestion);
	}
	
	public void delete(int id)
	{
		Readquestion readquestion=getById(id);
		sessionFactory.getCurrentSession().delete(readquestion);
	}
	
	public List<Readquestion> getId(String s, int id)
	{
		String hql="FROM Readquestion WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Readquestion>)query.list();
	}
	
	public List<Readquestion> getListByReadExerciseId(int readexeriseid){
		String hql="FROM Readquestion WHERE readexeriseid='"+ readexeriseid +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Readquestion>)query.list();
	}
	
	public List<Readquestion> getListByReadExerciseIdPage(int first, int max, String readexeriseid)
	{
		String hql="FROM Readquestion WHERE readexeriseid='"+ readexeriseid +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	
}
