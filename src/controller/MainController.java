package controller;

import model.Utilisateur;
import service.SessionService;

import java.util.UUID;

public class MainController {

    private SessionService service = new SessionService();

    public UUID authentifier(String n, String p) {
        return service.login(n, p);
    }

    public String changerA(UUID token, String val) {
        if (token == null) return "Erreur : Non connecté";
        service.modifierA(token, val);
        return "Valeur modifiée avec succès.";
    }

    public void afficherTout() {
        for(Utilisateur u : service.voirTout()) {
            System.out.println(u.getName() + " -> a: " + u.getA());
        }
    }

    public String quiEstConnecte(UUID token) {
        String nom = service.getNomUser(token);
        return (nom != null) ? nom : "Guest";
    }


}
