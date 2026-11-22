package com.mazur.controlecontas.lancamento;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LancamentoRequest(
        @NotBlank(message = "Descrição é obrigatória")
        @Size(min = 2, max = 100, message = "Descrição deve ter entre {min} e {max} caracteres")
        String descricao,
        @NotNull(message = "Valor é obrigatório")
        @Positive(message = "Valor deve ser maior que zero")
        BigDecimal valor,
        @NotNull(message = "Tipo é obrigatório")
        TipoLancamento tipo,
        LocalDate dataVencimento


) {
}
