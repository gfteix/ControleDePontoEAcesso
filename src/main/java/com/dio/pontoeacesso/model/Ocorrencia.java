package com.dio.pontoeacesso.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String descricao;
}
