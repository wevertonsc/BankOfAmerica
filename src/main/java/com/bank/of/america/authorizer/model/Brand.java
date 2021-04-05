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

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "card")
@ToString(exclude = "card")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany
    private List<Card> card;
}
