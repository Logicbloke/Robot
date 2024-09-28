/*
 * This source file was generated by the Gradle 'init' task
 */
package robot;

import robot.Robot.heading;

public class App {

    public static void main(String[] args) {
        Robot r = new Robot(5, 5, 3, 3, heading.W);
        try {
            r.processCommands("F");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Printing the exception message
            System.exit(-1);                    // Exiting with error code -1
        }
        System.out.println(r.report());
    }
}
