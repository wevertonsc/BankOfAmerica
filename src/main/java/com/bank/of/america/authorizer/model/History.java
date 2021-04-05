package com.bank.of.america.authorizer.model;

/*
+- - - - - - - - - - - - - - - - - - - - - -+
| Bank of America Assessment				|
+- - - - - - - - - - - - - - - - - - - - - -+
| Candidate: Weverton de Souza Castanho		|
| Email: wevertonsc@gmail.com				|
| Data: 05.APRIL.2021						|
+- - - - - - - - - - - - - - - - - - - - - -
 */

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float balance;
    private Float valueOperation;
    private String typeOperation;
    private Date dateOperation;
    @ManyToOne
    private Messages messages;
    @ManyToOne
    private Card card;
}
