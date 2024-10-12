
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ComplianceLogs")
public class ComplianceLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Integer logId;

    @ManyToOne
    @JoinColumn(name = "email_id")
    private Email email;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ComplianceStatus status;

    @Column(name = "checked_at")
    private LocalDateTime checkedAt;

    @Column(name = "remarks", columnDefinition = "TEXT")
    private String remarks;

    // Enum for compliance status
    public enum ComplianceStatus {
        COMPLIANT, NON_COMPLIANT
    }

    // Default constructor
    public ComplianceLog() {}

    // Constructor with fields
    public ComplianceLog(Email email, ComplianceStatus status, String remarks) {
        this.email = email;
        this.status = status;
        this.remarks = remarks;
        this.checkedAt = LocalDateTime.now();
    }

    // Getters and setters

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public ComplianceStatus getStatus() {
        return status;
    }

    public void setStatus(ComplianceStatus status) {
        this.status = status;
    }

    public LocalDateTime getCheckedAt() {
        return checkedAt;
    }

    public void setCheckedAt(LocalDateTime checkedAt) {
        this.checkedAt = checkedAt;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    // You can add additional methods here if needed

    @Override
    public String toString() {
        return "ComplianceLog{" +
               "logId=" + logId +
               ", email=" + (email != null ? email.getEmailId() : "null") +
               ", status=" + status +
               ", checkedAt=" + checkedAt +
               ", remarks='" + remarks + '\'' +
               '}';
    }
}