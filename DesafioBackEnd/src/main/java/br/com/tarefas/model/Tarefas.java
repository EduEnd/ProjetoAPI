/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tarefas.model;

import br.com.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

/**
 *
 * @author perei
 */
@Entity
@Table(name = "tarefas")
@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class Tarefas extends PersistenceEntity implements Serializable {

    private String titulo;
    private String descricao;
    private Calendar dataCriacao; 
    private Calendar dataVencimento;
    private String status;
    
}
