

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Auditing")
public class Auditing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "audit_id")
    private Integer auditId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "details", columnDefinition = "TEXT")
    private String details;

    // Default constructor
    public Auditing() {}

    // Constructor with fields
    public Auditing(User user, String action, String details) {
        this.user = user;
        this.action = action;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and setters

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    // You can add additional methods here if needed

    @Override
    public String toString() {
        return "Auditing{" +
               "auditId=" + auditId +
               ", user=" + (user != null ? user.getUserId() : "null") +
               ", action='" + action + '\'' +
               ", timestamp=" + timestamp +
               ", details='" + details + '\'' +
               '}';
    }
}