package com.springcss.account.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@Data
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String accountCode;

    private String accountName;

}
