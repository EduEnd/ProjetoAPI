/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.tarefas.dao;
import br.com.tarefas.model.Tarefas;
import java.util.Calendar;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perei
 */
@Repository
public interface IDaoTarefas  extends JpaRepository<Tarefas, Long> {

    public List<Tarefas> findByTituloTarefas(String titulo);
    
    public List <Tarefas> findByDataCriacao(Calendar dataCriacao);
    
    public List <Tarefas> findByDataVencimento(Calendar dataVencimento);
    
    public List <Tarefas> findByStatus(String status);
}
