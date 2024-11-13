public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Creer un robot Donner le comportement agressif au robot
        Robot robot = new Robot("robotCop",new AgressifBehaviour());
        // executer la methode move
        robot.move();
        // Changer le comportement pour defenssif pour le robot
        robot.setBehaviour(new DefensifBehaviour());
        // executer la méthode move
        robot.move();

        robot.setBehaviour(new NormalBehaviour());
        robot.move();

        Robot robot2 = robot;
        Robot robot3 = new Robot(robot);
        System.out.println("Merci :) ");
    }
}