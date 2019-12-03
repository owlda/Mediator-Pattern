public class Zone implements Mediator {

    // Class concrete qui implement le mediator - interface
    private Robot soldierRobot, tankRobot;
    private boolean attackStatus = true;


    @Override
    public boolean canAttack() {

        return attackStatus;
    }

    @Override
    public void registerRobot(Robot soldierRobot, Robot tankRobot) {

        this.soldierRobot = soldierRobot;
        this. tankRobot = tankRobot;
    }

    @Override
    public void setStatus(boolean status) {

        this.attackStatus = status;

    }

    @Override
    public void startAttack(Robot robot) {

        robot.attack();

    }

    @Override
    public void stopAttack(Robot robot) {

        robot.stopAttack();

    }
}
