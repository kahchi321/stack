/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import Q1Q2.MyStack;

/**
 *
 * @author wic180056
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> i=new Stack();
        i.push(3);
        i.push(5);
        i.push(4);
        System.out.println(i.sum(i));
    }
    
}
