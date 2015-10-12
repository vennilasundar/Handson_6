/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author user
 */
public class Animal {
    String family = "Animal";
   }
class Fish extends Animal {
    String living = "water";
    String type = "aquatic";
}
class Shark extends Fish{
    String name = "Shark";
  public void display(){
System.out.println( name + "is an " + family + " which lives in " + living + " ,hence it is " + type + ".");
}
}

