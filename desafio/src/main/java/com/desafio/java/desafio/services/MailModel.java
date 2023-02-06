package com.desafio.java.desafio.services;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_MAIL")
public class MailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID emailId;
    private String emailDe;
    private String emailPara;
    private String assunto;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;

}
