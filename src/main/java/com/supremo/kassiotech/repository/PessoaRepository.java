package com.supremo.kassiotech.repository;

import com.supremo.kassiotech.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


}
