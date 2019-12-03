public interface ChatMediator {

    // interface créer les relations parmi les utilisateurs.

    void ajouterUtilisateur(Utilisateur utilisateur);

    void envoyerMessage(String msg, Utilisateur utilisateur);

    void envoyerMessagePrive(String msg, Utilisateur utilisateur, Utilisateur utilisateurDest);

}
