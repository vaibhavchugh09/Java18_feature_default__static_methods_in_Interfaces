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
public interface Interface1 {
   // void method1(String str);

    default void log(String str){
    
    		System.out.println("I1 logging::"+str);

    } 

    static void print(String str){
    		System.out.println("Printing "+str);
    }
    
}
