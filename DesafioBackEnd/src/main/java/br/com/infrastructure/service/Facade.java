/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infrastructure.service;
import br.com.tarefas.model.Tarefas;
import br.com.tarefas.service.IServiceTarefas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author perei
 */
@Controller
@RestController
@RequestMapping("/tarefas")
public class Facade implements IFacade {
    @Autowired
    private IServiceTarefas serviceTarefas;
    
    
     @Override
     @PostMapping
    public Tarefas saveTarefas(@RequestBody Tarefas tarefas) {
        return serviceTarefas.saveTarefas(tarefas);
    }
    
    @Override
    @PutMapping
    public Tarefas updateTarefas(@RequestBody Tarefas tarefas){
        return serviceTarefas.updateTarefas(tarefas);
    }
    
    @Override
    @DeleteMapping("/{id}")
    public void deleteTarefas(Tarefas tarefas){
        serviceTarefas.deleteTarefas(tarefas);
    }
        
    @Override
    public List<Tarefas> findByTituloTarefasLike(String titulo) {
       return  serviceTarefas.findByTituloTarefasLike(titulo);
    }
    
    @Override
    public List<Tarefas> findByTituloTarefas(String titulo) {
       return  serviceTarefas.findByTituloTarefas(titulo);
    }


    @Override
    @GetMapping
    public List<Tarefas> getAllTarefas() {
        return serviceTarefas.getAllTarefas();
    }
    
    @Override
    public Tarefas findByIdTarefas(Long id){
        return serviceTarefas.findById(id);
    }    
}
