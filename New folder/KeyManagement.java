
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "KeyManagement")
public class KeyManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "key_id")
    private Integer keyId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "key_type", nullable = false)
    private KeyType keyType;

    @Column(name = "key_value", nullable = false, columnDefinition = "TEXT")
    private String keyValue;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Enum for key types
    public enum KeyType {
        PUBLIC, PRIVATE, ENCRYPTION
    }

    // Default constructor
    public KeyManagement() {}

    // Constructor with fields
    public KeyManagement(User user, KeyType keyType, String keyValue) {
        this.user = user;
        this.keyType = keyType;
        this.keyValue = keyValue;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public KeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(KeyType keyType) {
        this.keyType = keyType;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // You can add additional methods here if needed
}