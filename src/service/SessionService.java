package service;

import database.SessionRepository;
import database.UtilisateurRepository;
import model.Utilisateur;

import java.util.Collection;
import java.util.UUID;


public class SessionService {
    public UtilisateurRepository userRepo = new UtilisateurRepository();
    public SessionRepository sessionRepo = new SessionRepository();


    public  SessionService() {
        userRepo.create(new Utilisateur("youssef", "0000", "4"));
        userRepo.create(new Utilisateur("root","root","34"));
    }

    public UUID login(String nom , String pass){

        Utilisateur user = userRepo.readByName(nom);
        if(user!=null && user.getPasswd().equals(pass)){
            UUID token = UUID.randomUUID();
            sessionRepo.create(token,nom);
            return token;
        }
       return null;
    }

    public void modifierA(UUID token, String nouvelleVal) {
        String nom = sessionRepo.readByToken(token);
        if (nom != null) {
            Utilisateur u = userRepo.readByName(nom);
            u.setA(nouvelleVal);
            userRepo.update(u);
        }
    }

        public Collection<Utilisateur> voirTout() {
            return userRepo.readAll();
        }

    public String getNomUser(UUID token) {
        return sessionRepo.readByToken(token);
    }

    }

