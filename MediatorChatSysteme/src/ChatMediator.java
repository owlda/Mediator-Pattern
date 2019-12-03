public interface ChatMediator {

    // interface créer les relations parmi les utilisateurs.
    // Ce mediateur va etre utiliser pour contacter les differents utilisateurs.

    void ajouterUtilisateur(Utilisateur utilisateur);

    void envoyerMessage(String msg, Utilisateur utilisateur);

    void envoyerMessagePrive(String msg, Utilisateur utilisateur, Utilisateur utilisateurDest);

}
