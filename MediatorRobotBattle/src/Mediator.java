public interface Mediator {

    boolean canAttack();

    void registerRobot(Robot soldierRobot, Robot tankRobot);

    void setStatus(boolean status);

    void startAttack(Robot robot);

    void stopAttack(Robot robot);


}
