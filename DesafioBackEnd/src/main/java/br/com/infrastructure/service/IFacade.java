/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.infrastructure.service;

import br.com.tarefas.model.Tarefas;
import java.util.List;

/**
 *
 * @author perei
 */
public interface IFacade {
    public Tarefas saveTarefas(Tarefas tarefas);  
    public Tarefas updateTarefas(Tarefas tarefas);
    public void deleteTarefas(Tarefas Tarefas);
    public List <Tarefas> findByTituloTarefasLike(String titulo);
    public List <Tarefas> findByTituloTarefas(String titulo);
    public List<Tarefas> getAllTarefas();
    public Tarefas findByIdTarefas(Long id);
}
