abstract class Utilisateur {

    // abstract class de Utilisateur ou l'interface
    // attributes
    protected ChatMediator mediator;
    protected String nickname;

    //constructeur
    Utilisateur(ChatMediator mediator, String nickname) {
        this.mediator = mediator;
        this.nickname = nickname;
    }

    // methodes
    public abstract void envoyerMessage(String msg);

    public abstract void recevoirMessage(String msg);

    public abstract void envoyerMessagePrive(String msg, Utilisateur utilisateur);


}
