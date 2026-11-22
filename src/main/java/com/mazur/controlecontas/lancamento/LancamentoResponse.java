package com.mazur.controlecontas.lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record LancamentoResponse(
        Long id,
        String descricao,
        BigDecimal valor,
        TipoLancamento tipo,
        LocalDate dataVencimento,
        boolean pago,
        LocalDateTime criadoEm
) {
    public static LancamentoResponse from(Lancamento lancamento) {
        return new LancamentoResponse(
                lancamento.getId(),
                lancamento.getDescricao(),
                lancamento.getValor(),
                lancamento.getTipo(),
                lancamento.getDataVencimento(),
                lancamento.isPago(),
                lancamento.getCriadoEm()
        );
    }
}
