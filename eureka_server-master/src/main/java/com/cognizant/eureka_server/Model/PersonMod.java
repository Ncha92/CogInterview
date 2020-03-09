package com.cognizant.eureka_server.Model;

import javax.persistence.*;

@Entity
@Table (name = "Person")
public class PersonMod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "PersonId")
    private Integer Id;
    @Column (name = "FirstName")
    private String FirstName;
    @Column (name= "personage")
    private int age;

    public PersonMod() {
    }

    public PersonMod(int Id, String FirstName, int age){
        this.age = age;
        this.FirstName = FirstName;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonMod{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", age=" + age +
                '}';
    }
}
