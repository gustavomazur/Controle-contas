package com.mazur.controlecontas.lancamento;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "lancamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(nullable = false, length = 100)
    private String descricao;
    @Positive
    @NotNull
    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal valor;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoLancamento tipo;
    private LocalDate dataVencimento;
    @Column(nullable = false)
    private boolean pago;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime criadoEm;


}
