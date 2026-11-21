package com.mazur.controlecontas.lancamento;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "lancamento")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Column(nullable = false, length = 100)
    private String descricao;
    @Column(precision = 19, scale = 2)
    private BigDecimal valor;
    @NotBlank
    TipoLancamento tipoLancamento;
    private LocalDate dataVencimento;
    @Column(nullable = false)
    private boolean pago;
    @CreationTimestamp
    @Column(name = "Criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;


}
