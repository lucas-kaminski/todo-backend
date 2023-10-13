package me.lucaskaminski.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  // Don't define @Column if the column name is the same as the field name
  @Column(unique = true)
  private String username;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
