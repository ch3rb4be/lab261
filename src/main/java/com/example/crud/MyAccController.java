package com.example.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/myaccounts")
public class MyAccController {

    @Autowired
    private myAccRepo myAccountRepository;

    // ดึงข้อมูล myAccount ทั้งหมด
    @GetMapping
    public List<myAccount> getAllMyAccounts() {
        return myAccountRepository.findAll();
    }

    // สร้างข้อมูล myAccount ใหม่
    @PostMapping("/add")
    public myAccount createMyAccount(@RequestBody myAccount account) {
        return myAccountRepository.save(account);
    }
}