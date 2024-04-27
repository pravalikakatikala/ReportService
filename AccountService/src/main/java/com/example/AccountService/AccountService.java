package com.example.AccountService;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AccountService {

	
	@Autowired
	AccountRepository accountRepository;
	
public AccountEntity accountCreate(AccountEntity entity) {
		
		return accountRepository.save(entity);
	}
	
	public AccountEntity accontUpdate(AccountEntity entity) {
			
		entity.setId(entity.getId());
		entity.setName(entity.getName());
		entity.setPin_number(entity.getPin_number());
		entity.setMobile(entity.getMobile());
		entity.setDeposit(entity.getDeposit());
		
		return accountRepository.save(entity);
	}
	
	public Optional<AccountEntity> accountGet(int id) {
		
		return accountRepository.findById(id);
	}
	
	public String accontDelete(int id) {
		
		accountRepository.deleteById(id);

		return "Delete successfully";
	}

	

	
	
	
}
