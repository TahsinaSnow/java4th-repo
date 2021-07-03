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
public class Dragon {
    String name;
    int[] noOfPeopleEaten;
    
    void printDetails()
    {
        System.out.println("The dragon's name is: " + name);
    }

    public Dragon(String name, int[] noOfPeopleEaten) {
        this.name = name;
        this.noOfPeopleEaten = noOfPeopleEaten;
    }
    
    public Dragon()
    {
        name="";
        noOfPeopleEaten = new int[5];
    }
    
    int totalNumberOfPeopleEaten()
    {
        int total = 0 ;
        for (int o : noOfPeopleEaten) {
            total = total + o;
        }
        return total;
    }
}
