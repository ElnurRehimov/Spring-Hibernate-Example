package az.spring.hibernate.model;


import lombok.Data;

import javax.persistence.*;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name",length = 25)
    private String name;
    @Column(length = 35)
    private String surname;

    private int age;
    private double salary;
}
