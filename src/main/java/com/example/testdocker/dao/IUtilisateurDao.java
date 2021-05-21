package com.example.testdocker.dao;

import com.example.testdocker.domain.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface IUtilisateurDao extends CrudRepository<Utilisateur, Integer> {
    @Override
    ArrayList<Utilisateur> findAll();
}
