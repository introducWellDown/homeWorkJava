package org.example.entity;

import jakarta.persistence.*;

/**
 * Класс Human описывает человека с основными характеристиками.
 */
@Entity
@Table(name = "users")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",nullable = false)
    private String firstName; // Имя
    @Column(name = "last_name",nullable = false)
    private String lastName;  // Фамилия
    @Column(name = "age",nullable = false)
    private Integer age;      // Возраст
    @Column(name = "gender",nullable = false)
    private String gender;    // Пол
    @Column(name = "password",nullable = false)
    private String password;  // Пароль
    @Column(name = "email",nullable = false)
    private String email;     // Электронная почта
    @Column(name = "nickname",nullable = false)
    private String nickname;  // Ник

    /**
     * Конструктор для создания объекта Human.
     *
     * @param firstName Имя человека.
     * @param lastName  Фамилия человека.
     * @param age       Возраст человека.
     * @param gender    Пол человека (например, "мужской" или "женский").
     * @param password  Пароль для учетной записи человека.
     * @param email     Электронная почта человека.
     * @param nickname  Ник человека (например, для соцсетей).
     */
    // Конструктор, геттеры и сеттеры
    public Human(String firstName, String lastName, Integer age, String gender, String password, String email, String nickname) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
    }

    // Конструктор для DB
    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
