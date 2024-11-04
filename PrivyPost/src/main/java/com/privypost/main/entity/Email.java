package com.privypost.main.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;


@Entity
@Table(name = "Emails")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Integer emailId;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "body_encrypted", nullable = false, columnDefinition = "TEXT")
    private String bodyEncrypted;

    @Lob
    @Column(name = "attachment_encrypted")
    private byte[] attachmentEncrypted;

    @Column(name = "encryption_key", nullable = false, columnDefinition = "TEXT")
    private String encryptionKey;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;

    // Default constructor
    public Email() {}

    // Constructor with fields
    public Email(User sender, User receiver, String subject, String bodyEncrypted, String encryptionKey) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.bodyEncrypted = bodyEncrypted;
        this.encryptionKey = encryptionKey;
        this.sentAt = LocalDateTime.now();
    }

    // Getters and setters

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBodyEncrypted() {
        return bodyEncrypted;
    }

    public void setBodyEncrypted(String bodyEncrypted) {
        this.bodyEncrypted = bodyEncrypted;
    }

    public byte[] getAttachmentEncrypted() {
        return attachmentEncrypted;
    }

    public void setAttachmentEncrypted(byte[] attachmentEncrypted) {
        this.attachmentEncrypted = attachmentEncrypted;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    // You can add additional methods here if needed
}
