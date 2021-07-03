/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realdragonexercise;

/**
 *
 * @author R-418-PPC
 */
public class RealDragonExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] eaten = new int[7];
        eaten[0] = 3;
        eaten[1] = 5;
        eaten[2] = 3;
        eaten[3] = 8;
        eaten[4] = 1;
        eaten[5] = 4;
        eaten[6] = 0;
        RegisteredDragon smaug = new RegisteredDragon();
        smaug.name = "Smaug";
        smaug.nid = "3170133";
        smaug.noOfPeopleEaten = eaten;
        smaug.printDetails();
        System.out.println("Has eaten a total of " + smaug.totalNumberOfPeopleEaten() + " peoples in last five days.");
    }
    
}
