package com.mazur.controlecontas.lancamento;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record LancamentoRequest(
        @NotBlank(message = "Descrição é obrigatória")
        @Size(min = 5, max = 100, message = "Descrição deve conter no mínimo 5 e no máximo 100 caracteres")
        String descricao,
        @NotNull(message = "Valor é obrigatório")
        @DecimalMin(value = "0.00", inclusive = false, message = "Valor deve ser maior que zero")
        BigDecimal valor,
        @NotNull(message = "Tipo é obrigatório")
        TipoLancamento tipo,
        LocalDate dataVencimento


) {
}
