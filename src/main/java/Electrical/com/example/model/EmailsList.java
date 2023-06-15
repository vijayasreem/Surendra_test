package Electrical.com.example.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emails_list")
public class EmailsList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "from")
    private String from;

    @Column(name = "to")
    private String to;

    @Column(name = "subject")
    private String subject;

    @Column(name = "open_close_date")
    private Date openCloseDate;

    @Column(name = "note")
    private String note;

    @Column(name = "action")
    private String action;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "limit")
    private int limit;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "import_data_file")
    private String importDataFile;

    @Column(name = "page")
    private int page;
    
    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getOpenCloseDate() {
        return openCloseDate;
    }

    public void setOpenCloseDate(Date openCloseDate) {
        this.openCloseDate = openCloseDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getImportDataFile() {
        return importDataFile;
    }

    public void setImportDataFile(String importDataFile) {
        this.importDataFile = importDataFile;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}