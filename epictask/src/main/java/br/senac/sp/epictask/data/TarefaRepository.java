package br.senac.sp.epictask.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.epictask.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    
}
