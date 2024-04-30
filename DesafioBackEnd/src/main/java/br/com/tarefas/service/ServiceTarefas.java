/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tarefas.service;
import br.com.infrastructure.exception.BusinessException;
import br.com.tarefas.dao.IDaoTarefas;
import br.com.tarefas.model.Tarefas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author perei
 */
@Service
public class ServiceTarefas implements IServiceTarefas {
    // Mensagem de erro se a tarefa for null.
    public final static String TAREFAS_NULL = "Dados nao preenchidos";
    
    // Mensagem de erro se a tarefa ja existir no banco.
    public final static String TAREFAS_EXISTE = "Tarefa ja existente no Banco de dados";
   
    // Mensagem de erro se a tarefa não existir no banco.
    public final static String TAREFAS_NAO_EXISTE = "A tarefa nao existente no Banco de dados";
    
    // Mensagem de erro caso o titulo esteja vazio.
    private final static String TITULO_VAZIO = "O Campo titulo esta vazio";
    
    // Mensagem de erro caso o titulo seja null.
    private final static String TITULO_NULL = "Dados do titulo nao preenchidos";

  @Autowired
  private IDaoTarefas daoTarefas;

    @Override
    public Tarefas saveTarefas(Tarefas tarefas) {
        if(tarefas==null){
            throw new BusinessException(TAREFAS_NULL);
        } else if(daoTarefas.existsById(tarefas.getId()) == true){
            throw new BusinessException(TAREFAS_EXISTE);   
        } else{
            return daoTarefas.save(tarefas);
        }
    }

    @Override
    public Tarefas updateTarefas(Tarefas tarefas) {
        if(tarefas == null) {
            throw new BusinessException(TAREFAS_NULL);
        } else if(daoTarefas.existsById(tarefas.getId()) == false) {
            throw new BusinessException(TAREFAS_NAO_EXISTE);
        } else {
            return daoTarefas.save(tarefas);
        }    
    }

    @Override
    public void deleteTarefas(Tarefas tarefas) {
        if(tarefas == null) {
            throw new BusinessException(TAREFAS_NULL);
        } else if(daoTarefas.existsById(tarefas.getId()) == false) {
            throw new BusinessException(TAREFAS_NAO_EXISTE);
        } else {
            daoTarefas.delete(tarefas);
        }    
    }

    @Override
    public List<Tarefas> findByTituloTarefasLike(String titulo) {
        return daoTarefas.findByNomeLike(titulo);
    }

    @Override
    public List<Tarefas> findByTituloTarefas(String titulo) {
        if(titulo == null) {
            throw new BusinessException(TITULO_NULL);
        } if(titulo.isEmpty()) {
            throw new BusinessException(TITULO_VAZIO);
        } else{
            return daoTarefas.findByNome(titulo);
        }    }

    @Override
    public List<Tarefas> getAllTarefas() {
         return this.daoTarefas.findAll();    
    }
  
    @Override
    public Tarefas findById(Long id) {
        return daoTarefas.getReferenceById(id);
    }
}
