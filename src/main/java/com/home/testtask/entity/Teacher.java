package com.home.testtask.entity;

import com.home.testtask.entity.enums.Sex;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "fathername")
    private String fathername;

    @Column(name = "dateofbirghtday")
    private Date dateOfBirghtday;

    @Column(name = "sex")
    private String sex;

    @Column(name = "subject")
    private String subject;
}
