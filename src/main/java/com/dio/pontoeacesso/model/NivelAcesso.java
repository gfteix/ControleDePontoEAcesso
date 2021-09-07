package com.dio.pontoeacesso.model;

import lombok.*;
import javax.persistence.Id;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class NivelAcesso {
    @Id
    private long id;
    private String descricao;

}

