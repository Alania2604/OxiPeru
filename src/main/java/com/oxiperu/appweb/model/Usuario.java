package com.oxiperu.appweb.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Column;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_user")
<<<<<<< HEAD
public class Usuario implements Serializable {
   
    @Id
    @Column(name = "user_id")
    private String userID;
    private String password;
    private String tipoUsuario;

   
=======

public class Usuario implements Serializable{
    @Id
    @Column(name = "user_id")
        private String userID;
        private String password;
        private String tipoUsuario;
>>>>>>> 01efe8c6d78502109aad941bff3729bf8889acc5
}
