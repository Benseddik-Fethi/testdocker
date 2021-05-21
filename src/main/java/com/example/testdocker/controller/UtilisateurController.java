package com.example.testdocker.controller;

import com.example.testdocker.dao.IUtilisateurDao;
import com.example.testdocker.domain.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UtilisateurController {

    @Autowired
    IUtilisateurDao iUtilisateurDao;

    @GetMapping("/all")
    public List<Utilisateur> getaAll(){
    return iUtilisateurDao.findAll();
    }
}