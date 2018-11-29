package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dakt.javatech.jhibernate.entity.Grammarguideline;

@Component 
@Transactional
public class GrammarguidelineDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Grammarguideline> list()
	{
		String hql="FROM Grammarguideline";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Grammarguideline> list(int first, int max)
	{
		String hql="FROM Grammarguideline";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Grammarguideline getById(int id)
	{
		return (Grammarguideline)sessionFactory.getCurrentSession().get(Grammarguideline.class, id);
	}
	public void add(Grammarguideline gramguideline)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(gramguideline);
	}

	public void update(Grammarguideline gramguideline) {
		sessionFactory.getCurrentSession().update(gramguideline);
	}
	
	public void delete(int id)
	{
		Grammarguideline gramguideline=getById(id);
		sessionFactory.getCurrentSession().delete(gramguideline);
	}
	
	public List<Grammarguideline> getId(String s, int id)
	{
		String hql="FROM Grammarguideline WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Grammarguideline>)query.list();
	}
	
	public List<Grammarguideline> getListByLevelId(String level){
		String hql="FROM Grammarguideline WHERE levelid='"+ level +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Grammarguideline>)query.list();
	}
	public List<Grammarguideline> getListByLevelIdPhanTrang(String id, int first, int max)
	{
		String hql="From Grammarguideline  where levelid ='"+id+"'"; 
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}

}
