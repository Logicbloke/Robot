/*
 * This source file was generated by the Gradle 'init' task
 */
package robot;

import java.util.Scanner;

import robot.Robot.heading;

public class App {

    public static void main(String[] args) throws Exception {
        int inGridX, inGridY, inX, inY;
        heading h;
        Robot r = null;
        Scanner s = new Scanner(System.in);
 
        do {
            try {
                String inputGrid = s.nextLine();
                inGridX = Integer.parseInt(inputGrid.split(" ")[0]);
                inGridY = Integer.parseInt(inputGrid.split(" ")[1]);

                String inputPosition = s.nextLine();
                inX = Integer.parseInt(inputPosition.split(" ")[0]);
                inY = Integer.parseInt(inputPosition.split(" ")[1]);
                h  = heading.valueOf(inputPosition.split(" ")[2].toUpperCase());

                r = new Robot(inGridX, inGridY, inX, inY, h);
            } catch (Exception e) {
                System.out.println("Invalid input. Please input grid size followed by initial position, as shown:");
                System.out.println("5 5");
                System.out.println("1 2 N");   
            }
        } while (r == null);

        try {
            r.processCommands(s.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Printing the exception message
            System.exit(-1);                    // Exiting with error code -1
        }
        System.out.println(r.report());
    }
}
