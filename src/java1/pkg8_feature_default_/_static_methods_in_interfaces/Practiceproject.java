/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.pkg8_feature_default_._static_methods_in_interfaces;

/**
 *
 * @author Vaibhav.Chugh
 */
public class Practiceproject implements Interface1, Interface2 {

//As we know interface cannot not have method body.From java 8,interface are enhance to have method 
//with implementation. we can use default and static keyword to create interfaces with method
//implemnetations
    
//we know that java doesnt have multiple inheritance in classes because it leads to Diamond Problem.
// so how it will be handle interfaces now.since interfaces are now similar to abstract clases    
    
    @Override
    public void log(String str) {
      //  Interface1.super.log(str); //To change body of generated methods, choose Tools | Templates.
      System.out.println("MyClass logging::"+str);
      Interface1.print("abc"); //  as we know we can call static method directly.
    }

  
}
