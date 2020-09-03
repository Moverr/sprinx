/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.mover.demo.controllers;

import com.dev.mover.demo.dao.TeamDao;
import com.dev.mover.demo.entities.Player;
import com.dev.mover.demo.entities.Team;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author muyin
 */
@RequestMapping("/")
@Controller
public class DefaultController {

    @GetMapping("/hi")
    public @ResponseBody
    String hello() {
        
        Set<Player> players = new HashSet();
        
        players.add(new Player("movers","12333") );
        Team t = new Team("seee","seare","seare",players);
        
        dao.save(t);
        return "Hello WOndera ea Mpa e";
    }
    
    @Autowired
    TeamDao dao;
}
