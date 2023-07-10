package com.inha.inhaplus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "users") /* User 테이블을 생성 */
@Getter /* 필드의 get */
@Setter /* 필드의 set */
public class User {
    @Id
    private long id;
    private String password;
    private String email;
}
