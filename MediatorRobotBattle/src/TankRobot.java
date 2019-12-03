class TankRobot extends Robot {

    private Mediator mediator;

    public TankRobot(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    void attack(){

        if(mediator.canAttack()){

            System.out.println("TankRobot: J'attaque ... bum-bum...");
            mediator.setStatus(false);
        }
        else {

            System.out.println("TankRobot: Je ne peux pas attaquer. L'autre robot attaque...");
        }
    }

    @Override
    void stopAttack(){

        System.out.println("TankRobot: J'arrete d'attaquer... ");
        mediator.setStatus(false);

    }
}
