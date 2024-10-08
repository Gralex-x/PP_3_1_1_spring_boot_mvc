package ru.gralexx.PP_3_1_1_spring_boot_mvc.PP_3_1_1_spring_boot_mvc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @PrePersist
    public void prePersist() {
        if (this.age == null) {
            this.age = 0;
        }
    }

    public int getAge() {
        return age != null ? age : 0;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative");
        }
        this.age = age;
    }
}
