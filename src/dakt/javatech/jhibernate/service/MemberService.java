package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.MemberDao;
import dakt.javatech.jhibernate.entity.Member;

@Service
public class MemberService {
	@Autowired MemberDao memberDao;
	@Transactional
	public List<Member> list(){
		return memberDao.list();
		
	}
	@Transactional
	public List<Member> list(int first, int max){
		return memberDao.list(first, max);
	}
	@Transactional
	public Member getById(int id) {
		return memberDao.getById(id);
	}
	@Transactional
	public void add(Member mem) {
		memberDao.add(mem);
	}
	@Transactional
	public void delete(int id) {
		memberDao.delete(id);
	}
	@Transactional
	public void update(Member member) {
		memberDao.update(member);
	}
}
