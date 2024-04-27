package com.example.AccountService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/getRestMethod")
    public String method() {
        return "12345678";
    }

    @PostMapping("/accounts")
    public AccountEntity createAccount(@RequestBody AccountEntity entity) {
        return accountService.createAccount(entity);
    }

    @PutMapping("/accounts")
    public AccountEntity updateAccount(@RequestBody AccountEntity entity) {
        return accountService.updateAccount(entity);
    }

    @GetMapping("/accounts/{id}")
    public Optional<AccountEntity> getAccount(@RequestParam int id) {
        return accountService.getAccount(id);
    }

    @DeleteMapping("/accounts/{id}")
    public String deleteAccount(@RequestParam int id) {
        return accountService.deleteAccount(id);
    }
}