public class Membre extends Utilisateur {

    Membre(ChatMediator mediator, String nickname) {
        super(mediator, nickname);
    }

    @Override
    public void envoyerMessage(String msg) {

        System.out.println(this.nickname+": -> "+msg);
        mediator.envoyerMessage(msg, this);

    }

    @Override
    public void recevoirMessage(String msg) {

        System.out.println(this.nickname+": <- "+msg);
    }

    @Override
    public void envoyerMessagePrive(String msg, Utilisateur utilisateur) {

        System.out.println(this.nickname+": -> "+msg);
        mediator.envoyerMessagePrive(msg, this,utilisateur);

    }


}
