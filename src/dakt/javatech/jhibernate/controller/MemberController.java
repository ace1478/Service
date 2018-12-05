package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Level;
import dakt.javatech.jhibernate.entity.Member;
import dakt.javatech.jhibernate.service.MemberService;

@RestController
public class MemberController {
	@Autowired MemberService memberService;
	@RequestMapping(value ="/getListMember", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Member> List(){
		List<Member> list = memberService.list();
		return list;
	}
	@RequestMapping(value ="/getListMember/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Member> getListByMember1(@PathVariable int first, @PathVariable int max) {
		List<Member> list = memberService.list(first, max);
		return list;
	}
	@RequestMapping(value = "/getMember/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Member getById(@PathVariable int id) {
		return memberService.getById(id);
	}
	@RequestMapping(value = "/addMember", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addMember(@RequestBody Member mem) {	
		memberService.add(mem);
	}
	@RequestMapping(value = "/updateMember", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateMember(@RequestBody Member member) {
		memberService.update(member);
	}
	@RequestMapping(value = "/deleteMember/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteMember(@PathVariable("id") int id) {
		memberService.delete(id);	
	}

}
