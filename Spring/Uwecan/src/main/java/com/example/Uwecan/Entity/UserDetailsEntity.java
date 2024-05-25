package com.example.Uwecan.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name ="tbl_user_details")
@Data
public class UserDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "hibernateseq")
    @SequenceGenerator(name="hibernateseq", sequenceName = "hibernate_sequence",allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    private String address;
    private String userType;
    private String phoneNumber;
    private String name;
}
