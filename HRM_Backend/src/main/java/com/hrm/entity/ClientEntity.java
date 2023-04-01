package com.hrm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "client")
public class ClientEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )

    private Long id;
    private String  clientName;
    private String email;

    public ClientEntity(String clientName, String email) {
        this.clientName = clientName;
        this.email = email;
    }
}
