package Electrical.com.example.controller;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Electrical.com.example.entity.EmailsList;
import Electrical.com.example.service.EmailsListService;

@RestController
@RequestMapping("/emailslist")
public class EmailsListController {
    
    @Autowired
    private EmailsListService emailsListService;
    
    @GetMapping("/from/{from}")
    public List<EmailsList> findByFrom(@PathVariable String from) {
        return emailsListService.findByFrom(from);
    }
    
    @GetMapping("/to/{to}")
    public List<EmailsList> findByTo(@PathVariable String to) {
        return emailsListService.findByTo(to);
    }
    
    @GetMapping("/subject/{subject}")
    public List<EmailsList> findBySubject(@PathVariable String subject) {
        return emailsListService.findBySubject(subject);
    }
    
    @GetMapping("/openclosedate/{openCloseDate}")
    public List<EmailsList> findByOpenCloseDate(@PathVariable Date openCloseDate) {
        return emailsListService.findByOpenCloseDate(openCloseDate);
    }
    
    @GetMapping("/note/{note}")
    public List<EmailsList> findByNote(@PathVariable String note) {
        return emailsListService.findByNote(note);
    }
    
    @GetMapping("/action/{action}")
    public List<EmailsList> findByAction(@PathVariable String action) {
        return emailsListService.findByAction(action);
    }
    
    @GetMapping("/username/{username}")
    public List<EmailsList> findByUsername(@PathVariable String username) {
        return emailsListService.findByUsername(username);
    }
    
    @GetMapping("/email/{email}")
    public List<EmailsList> findByEmail(@PathVariable String email) {
        return emailsListService.findByEmail(email);
    }
    
    @GetMapping("/limit/{limit}")
    public List<EmailsList> findAllByLimit(@PathVariable int limit) {
        return emailsListService.findAllByLimit(limit);
    }
    
    @GetMapping("/userid/{userId}")
    public List<EmailsList> findAllByUserId(@PathVariable long userId) {
        return emailsListService.findAllByUserId(userId);
    }
    
    @GetMapping("/importdatafile/{importDataFile}")
    public List<EmailsList> findByImportDataFile(@PathVariable String importDataFile) {
        return emailsListService.findByImportDataFile(importDataFile);
    }
    
    @GetMapping("/page/{page}")
    public List<EmailsList> findByPage(@PathVariable int page) {
        return emailsListService.findByPage(page);
    }
    
    @PostMapping("/save")
    public EmailsList save(@RequestBody EmailsList emailsList) {
        return emailsListService.save(emailsList);
    }
}