package database;

import model.Utilisateur;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UtilisateurRepository {

    private Map<String, Utilisateur> ListeUtilisateur = new HashMap<>();


    public void create(Utilisateur u){ ListeUtilisateur.put(u.getName(), u);}
    public  Utilisateur readByName(String nom){return ListeUtilisateur.get(nom);}
    public Collection readAll(){return ListeUtilisateur.values();}
    public void update(Utilisateur u){ListeUtilisateur.put(u.getName(), u);}
    public void deleteByName(String nom){ListeUtilisateur.remove(nom);}
    public void deleteAll(){ListeUtilisateur.clear();}
}
