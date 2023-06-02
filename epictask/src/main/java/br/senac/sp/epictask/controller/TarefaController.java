package br.senac.sp.epictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.senac.sp.epictask.data.TarefaRepository;
import br.senac.sp.epictask.model.Tarefa;

@Controller
public class TarefaController {

    @Autowired
    TarefaRepository repository;

   
    @PostMapping("/tarefas")
public String cadastrar(Tarefa tarefa, RedirectAttributes redirect) {
    int nota = tarefa.getNota();

    if (nota < 0 || nota > 10) {
        redirect.addFlashAttribute("mensagem", "Nota inválida");
    } else {
        if (nota >= 6) {
            tarefa.setSituacao("Aprovado");
        } else {
            tarefa.setSituacao("Reprovado");
        }
        repository.save(tarefa);
    }

    return "redirect:/tarefas";
}


    @GetMapping("/")
    public String home(){
        return "redirect:/tarefas";
    }

    @GetMapping("/tarefas")
    public String tarefas(Model model){
        var tarefas = repository.findAll();
        model.addAttribute("tarefas", tarefas);
        return "tarefas";
    }

    @GetMapping("/tarefas/cadastrar")
    public String formulario(){
        return "formulario_tarefa";
    }

    @DeleteMapping("/tarefas")
    public String apagar(Long id, RedirectAttributes redirect ){
        repository.deleteById(id);
        redirect.addFlashAttribute("mensagem", "Tarefa apagada com sucesso");
        return "redirect:/tarefas";
    }



    
}
