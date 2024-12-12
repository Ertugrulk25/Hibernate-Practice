package com.tpa.hb02.embeddable2;

import javax.persistence.*;

@Entity
@Table(name = "t_student")
public class Student02P {

    @Id
    private Integer id;
    @Column(name = "std_name", unique = true, nullable = false, length = 20)
    private String name;
    @Column
    private String surname;
    @Column
    private int grade;

    @Embedded
    private Address02P address;

    public Student02P(Integer id, String name, String surname, int grade ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;

    }

    public Student02P() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Address02P getAddress() {
        return address;
    }

    public void setAddress(Address02P address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student02P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }
}

