/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.tarefas.dao;
import br.com.tarefas.model.Tarefas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perei
 */
@Repository
public interface IDaoTarefas  extends JpaRepository<Tarefas, Long> {
    @Query("SELECT p FROM Paciente p WHERE p.nome LIKE %:titulo%")
    public List<Tarefas> findByNomeLike(String titulo);

    public List<Tarefas> findByNome(String titulo);
}
