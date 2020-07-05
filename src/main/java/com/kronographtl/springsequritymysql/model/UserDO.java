package com.kronographtl.springsequritymysql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name ="user")
@Table(name = "user")
public class UserDO {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    private String userName;
    private String password;
    private String status;
    private String roles;

}
