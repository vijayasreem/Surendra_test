package Electrical.com.example.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Electrical.com.example.entity.EmailsList;
import Electrical.com.example.repository.EmailsListRepository;

@Service
public class EmailsListService {
    
    @Autowired
    private EmailsListRepository emailsListRepository;

    public List<EmailsList> findByFrom(String from) {
        return emailsListRepository.findByFrom(from);
    }
    
    public List<EmailsList> findByTo(String to) {
        return emailsListRepository.findByTo(to);
    }
    
    public List<EmailsList> findBySubject(String subject) {
        return emailsListRepository.findBySubject(subject);
    }
    
    public List<EmailsList> findByOpenCloseDate(Date openCloseDate) {
        return emailsListRepository.findByOpenCloseDate(openCloseDate);
    }
    
    public List<EmailsList> findByNote(String note) {
        return emailsListRepository.findByNote(note);
    }
    
    public List<EmailsList> findByAction(String action) {
        return emailsListRepository.findByAction(action);
    }
    
    public List<EmailsList> findByUsername(String username) {
        return emailsListRepository.findByUsername(username);
    }
    
    public List<EmailsList> findByEmail(String email) {
        return emailsListRepository.findByEmail(email);
    }
    
    public List<EmailsList> findAllByLimit(int limit) {
        return emailsListRepository.findAllByLimit(limit);
    }
    
    public List<EmailsList> findAllByUserId(long userId) {
        return emailsListRepository.findAllByUserId(userId);
    }
    
    public List<EmailsList> findByImportDataFile(String importDataFile) {
        return emailsListRepository.findByImportDataFile(importDataFile);
    }
    
    public List<EmailsList> findByPage(int page) {
        return emailsListRepository.findByPage(page);
    }
}