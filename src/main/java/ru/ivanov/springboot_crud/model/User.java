package ru.ivanov.springboot_crud.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 32)
    @NotEmpty(message = "Введите имя")
    @Size(min = 2, max = 32, message = "Имя должно быть от 2 до 32 символов")
    private String name;

    @Column
    @NotEmpty(message = "Введите фамилию")
    @Size(min = 2, message = "Фамилия должна содержать более 2 символов")
    private String surname;

    @Column
    @Min(value = 0, message = "Возраст должен быть больше 0")
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
