package com.dio.pontoeacesso.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    //YYYY-MM-ddTHH:mm:ss
    private LocalDateTime dataEspecial;
}
