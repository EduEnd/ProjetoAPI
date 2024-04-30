/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infrastructure.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;


/**
 *
 * @author perei
 */
@MappedSuperclass
@Data
public class PersistenceEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
