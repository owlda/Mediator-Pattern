import java.util.ArrayList;

class SystemeMessages implements ChatMediator {

    private ArrayList<Utilisateur> groupUtilisateurs;


    SystemeMessages() {
        this.groupUtilisateurs = new ArrayList<Utilisateur>();
    }

    @Override
    public void ajouterUtilisateur(Utilisateur utilisateur) {

        this.groupUtilisateurs.add(utilisateur);
    }

    @Override
    public void envoyerMessage(String msg, Utilisateur utilisateur) {

        for(Utilisateur u : this.groupUtilisateurs){

            if(u != utilisateur){

                u.recevoirMessage(msg);
            }
        }

    }

    @Override
    public void envoyerMessagePrive(String msg, Utilisateur utilisateur, Utilisateur utilisateurDest) {

        for(Utilisateur u : this.groupUtilisateurs){

            if(u != utilisateur && u == utilisateurDest){

                u.recevoirMessage(msg);
            }
        }

    }
}
