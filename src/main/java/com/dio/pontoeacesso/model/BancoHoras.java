package com.dio.pontoeacesso.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Movimentacao movimentacao;
    @ManyToOne
    private Usuario usuario;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;

}
