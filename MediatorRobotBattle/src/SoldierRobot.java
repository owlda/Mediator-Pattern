class SoldierRobot extends Robot  {

    private Mediator mediator;

    public SoldierRobot(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    void attack(){

        if(mediator.canAttack()){

            System.out.println("SoldierRobot: J'attaque ... bum-bum...");
            mediator.setStatus(false);
        }
        else {

            System.out.println("SoldierRobot: Je ne peux pas attaquer. L'autre robot attaque...");
        }
    }

    @Override
    void stopAttack(){

        System.out.println("SoldierRobot: J'arrete d'attaquer... ");
        mediator.setStatus(false);
    }
}

