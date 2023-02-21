package com.home.testtask.entity;

import com.home.testtask.entity.enums.Sex;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Student {
    @Id
    @Column(name = "id")
    private Long id;
    private String name;
    private String surname;
    private String fathername;
    private Date dateOfBirgthday;
    private Enum<Sex> sex;
}
