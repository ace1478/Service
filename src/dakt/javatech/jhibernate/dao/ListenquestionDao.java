package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dakt.javatech.jhibernate.entity.Listenquestion;

@Component 
@Transactional
public class ListenquestionDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Listenquestion> list()
	{
		String hql="FROM Listenquestion";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Listenquestion> list(int first, int max)
	{
		String hql="FROM Listenquestion";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Listenquestion getById(int id)
	{
		return (Listenquestion)sessionFactory.getCurrentSession().get(Listenquestion.class, id);
	}
	public void add(Listenquestion listenquestion)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(listenquestion);
	}

	public void update(Listenquestion listenquestion) {
		sessionFactory.getCurrentSession().update(listenquestion);
	}
	
	public void delete(int id)
	{
		Listenquestion listenquestion=getById(id);
		sessionFactory.getCurrentSession().delete(listenquestion);
	}
	
	public List<Listenquestion> getId(String s, int id)
	{
		String hql="FROM Listenquestion WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Listenquestion>)query.list();
	}

	public List<Listenquestion> getListByListenExerciseId(String ListenExerciseId,int first, int max) {
		String hql="From Listenquestion where listenexerciseid ='"+ListenExerciseId +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return (List<Listenquestion>)query.list();
	}
	public List<Listenquestion> getListByListenExerciseId(String ListenExerciseId) {
		String hql="From Listenquestion where listenexerciseid ='"+ListenExerciseId +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Listenquestion>)query.list();
	}

}
