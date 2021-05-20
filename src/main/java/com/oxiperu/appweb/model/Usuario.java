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
    @Column(name = "user_id")
<<<<<<< HEAD
    private String userID;
    private String password;
=======
        private String userID;
        private String password;
>>>>>>> 6fb763e1f02d309575806a3ec4730b6bb69d4f1c

        public String getUserID() {
            return password;
        }
        public void setUserID(String userID) {
            this.password = userID;
        }
        
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
}
