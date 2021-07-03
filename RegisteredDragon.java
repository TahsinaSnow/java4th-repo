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
public class RegisteredDragon extends Dragon{
    String nid;

    @Override
    void printDetails() {
        System.out.println(name + "'s nid is: " + nid );
    }
    
    
}
