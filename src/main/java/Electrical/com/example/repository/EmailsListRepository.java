Below is the repository class which can be generated using the above requirements:

package Electrical.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Electrical.com.example.entity.EmailsList;

@Repository
public interface EmailsListRepository extends JpaRepository<EmailsList, Long> {
    
    List<EmailsList> findByFrom(String from);
    List<EmailsList> findByTo(String to);
    List<EmailsList> findBySubject(String subject);
    List<EmailsList> findByOpenCloseDate(Date openCloseDate);
    List<EmailsList> findByNote(String note);
    List<EmailsList> findByAction(String action);
    List<EmailsList> findByUsername(String username);
    List<EmailsList> findByEmail(String email);
    List<EmailsList> findAllByLimit(int limit);
    List<EmailsList> findAllByUserId(long userId);
    List<EmailsList> findByImportDataFile(String importDataFile);
    List<EmailsList> findByPage(int page);
}