package com.mazur.controlecontas.lancamento;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LancamentoService {

    private final LancamentoRepository lancamentoRepository;

    public LancamentoResponse criar(LancamentoRequest lancamentoRequest) {
        Lancamento lancamento = new Lancamento();
        lancamento.setDescricao(lancamentoRequest.descricao());
        lancamento.setValor(lancamentoRequest.valor());
        lancamento.setTipo(lancamentoRequest.tipo());
        lancamento.setDataVencimento(lancamentoRequest.dataVencimento());
        Lancamento salvo = lancamentoRepository.save(lancamento);
        return LancamentoResponse.from(salvo);
    }
}
