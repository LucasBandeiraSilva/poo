package br.senac.sp.epictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.senac.sp.epictask.data.TarefaRepository;
import br.senac.sp.epictask.model.Tarefa;

@Controller
public class TarefaController {

    @Autowired
    TarefaRepository repository;

    @PostMapping("/tarefas")
    public String cadastrar(Tarefa tarefa){
        repository.save(tarefa);
        return "redirect:/tarefas";
    }

    @GetMapping("/tarefas")
    public String tarefas(){
        return "tarefas";
    }

    @GetMapping("/tarefas/cadastrar")
    public String formulario(){
        return "formulario_tarefa";
    }



    
}
