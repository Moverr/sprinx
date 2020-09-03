/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.mover.demo.dao;

import com.dev.mover.demo.entities.Team;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author muyin
 */
public interface TeamDao extends CrudRepository<Team, Long> {
 
    @Override
    public   List<Team> findAll(); 
    @Override
    public   long count();
    
    List<Team> findByName(String name);
}
