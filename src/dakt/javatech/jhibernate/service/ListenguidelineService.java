package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ListenguidelineDao;
import dakt.javatech.jhibernate.entity.ListenGuideline;

@Service
public class ListenguidelineService {
		
		@Autowired ListenguidelineDao listenGuidelineDao;
		
		@Transactional
		public List<ListenGuideline> list()
		{
			return listenGuidelineDao.list();
		}
		
		@Transactional
		public List<ListenGuideline> list(int first, int max)
		{
			return listenGuidelineDao.list(first,max) ;
		}
				
		@Transactional
		public ListenGuideline getById(int id)
		{
			return listenGuidelineDao.getById(id);
		}
		
		@Transactional
		public void add(ListenGuideline listenguideline)
		{
			listenGuidelineDao.add(listenguideline);
		}
		
		public void update(ListenGuideline listenguideline)
		{
			listenGuidelineDao.update(listenguideline);
		}
		
		@Transactional
		public void delete(int id)
		{
			listenGuidelineDao.delete(id);
		}
		
//		@Transactional
//		public List<ListenGuideline> getId(String s, int id)
//		{			
//			return listenGuidelineDao.getId(s, id) ;
//		}
		
		@Transactional
		public List<ListenGuideline> getListByLevelId(String level)
		{			
			return listenGuidelineDao.getListByLevelId(level);
		}
		
		@Transactional
		public  ListenGuideline getListenGuidelineById(String id)
		{
			return listenGuidelineDao.getListenGuidelineById(id);
		}
		
		@Transactional
		public List<ListenGuideline> getListByLevelId(String id, int first, int max)
		{
			return listenGuidelineDao.getListByLevelId(id, first, max);
		}
}
