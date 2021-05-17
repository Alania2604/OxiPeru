package com.oxiperu.appweb.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_user")
public class Usuario {
    @Id
<<<<<<< HEAD
    @Column(name = "user_id")
    private String userID;
    private String password;
=======
        private String userID;
        
>>>>>>> 4d5aa59e76b1c131efa13e808735b1da0db9125a


}
