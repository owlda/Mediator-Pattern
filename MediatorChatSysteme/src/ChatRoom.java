import java.awt.*;

public class ChatRoom {

    public static void main(String[] args) {

        ChatMediator mediator = new SystemeMessages();

        Utilisateur user0945 = new Membre(mediator, "JohnDoe");
        Utilisateur user5687 = new Membre(mediator, "Valkyria");
        Utilisateur user9812 = new Membre(mediator, "Superman01");
        Utilisateur user8762 = new Membre(mediator, "OnlyMe");


        mediator.ajouterUtilisateur(user0945);
        mediator.ajouterUtilisateur(user5687);
        mediator.ajouterUtilisateur(user8762);
        mediator.ajouterUtilisateur(user9812);



        user8762.envoyerMessage("Bonjour tout le monde.");
        user9812.envoyerMessage("Salut!");
        user0945.recevoirMessage("Oups");
        user5687.envoyerMessagePrive("Salut mon ami", user9812);









    }
}
