public class RUN {

    public static void main(String[] args) {


        //TEST
        Mediator mediator = new Zone();

        Robot R2D2 = new SoldierRobot(mediator);
        Robot zPO = new TankRobot(mediator);

        // Register pour la bataille
        mediator.registerRobot(R2D2, zPO);

        mediator.startAttack(zPO);
        mediator.startAttack(R2D2);
        mediator.stopAttack(zPO);
        mediator.setStatus(true);
        mediator.startAttack(zPO);



    }
}
