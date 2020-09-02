/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.mover.demo.controllers;

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
        return "Hello WOndera ea Mpa e";
    }
}
