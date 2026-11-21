package com.mazur.controlecontas.lancamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer> {

}
