package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.AccountDao;
import dakt.javatech.jhibernate.entity.Account;

@Service
public class AccountService {
	@Autowired
	AccountDao accDao;
	@Transactional
	public List<Account> list(){
		return accDao.list();
	}
	

}
