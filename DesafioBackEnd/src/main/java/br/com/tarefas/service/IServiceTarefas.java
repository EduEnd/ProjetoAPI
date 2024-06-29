/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.tarefas.service;

import br.com.tarefas.model.Tarefas;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author perei
 */
public interface IServiceTarefas {
    public Tarefas saveTarefas(Tarefas tarefas);
    
    public Tarefas updateTarefas(Tarefas tarefas);
    
    public void deleteTarefas(Tarefas tarefas);  
    
    public List <Tarefas> findByTituloTarefas(String titulo);
    
    public List<Tarefas> getAllTarefas();
    
    public Tarefas findById(Long id);
    
    public List <Tarefas> findByDataCriacao(Calendar dataCriacao);
    
    public List <Tarefas> findByDataVencimento(Calendar dataVencimento);
    
    public List <Tarefas> findByStatus(String status);
}
