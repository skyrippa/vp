/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.dao;

import br.com.ifba.vp.infraestructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author iagobm
 * @param <Entity>
 */
public interface IBaseDao<Entity extends AbstractEntity> {
    
    /**
     * Salva uma instância de uma entidade persistente no banco de dados.
     * 
     * @param obj a instância que é inserida
     * @return a entidade
     */
    Entity save(Entity obj);

    /**
     * Update an instance of the persistent entity in the system database.
     * 
     * @param obj the instance that is updated
     * @return the entity
     */
    Entity update(Entity obj);

    /**
     * Remove an instance of the persistent entity in the system database.
     * 
     * @param obj the instance that is updated
     */
    void delete(Entity obj);

    /**
     * Retrieve all instances of the entity in the database.
     * 
     * @return a {@link List} with the results.
     */
    List<Entity> findAll();
    
    /**
     * Find an entity by primary key.
     * 
     * @param id
     * @return the entity.
     */
    Entity findById(Long id);
    
}
