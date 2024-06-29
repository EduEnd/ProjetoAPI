/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infrastructure.service;
import br.com.tarefas.model.Tarefas;
import br.com.tarefas.service.IServiceTarefas;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@CrossOrigin("*")
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
    public void deleteTarefas(@PathVariable Tarefas tarefas){
        serviceTarefas.deleteTarefas(tarefas);
    }      
    
    @Override
    public List<Tarefas> findByTituloTarefas(@RequestBody String titulo) {
       return  serviceTarefas.findByTituloTarefas(titulo);
    }


    @Override
    @GetMapping
    public List<Tarefas> getAllTarefas() {
        return serviceTarefas.getAllTarefas();
    }
    
    @Override
    @GetMapping
    public Tarefas findByIdTarefas(@RequestBody Long id){
        return serviceTarefas.findById(id);
    }    

    @Override
    public List<Tarefas> findByDataCriacao(@RequestBody Calendar dataCriacao) {
         return serviceTarefas.findByDataCriacao(dataCriacao);
    }

    @Override
    public List<Tarefas> findByDataVencimento(@RequestBody Calendar dataVencimento) {
         return serviceTarefas.findByDataVencimento(dataVencimento);
    }

    @Override
    public List<Tarefas> findByStatus(@RequestBody String status) {
         return serviceTarefas.findByStatus(status);
    }
}
