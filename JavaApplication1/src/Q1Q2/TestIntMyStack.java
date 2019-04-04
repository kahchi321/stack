/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1Q2;

import java.util.Scanner;

/**
 *
 * @author wic180056
 */
public class TestIntMyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        MyStack<Integer> in=new MyStack();
        System.out.print("Enter a number:");
        int num=s.nextInt();
        in.push(num);
        in.push(1);
        System.out.println("Size: " +in.getSize());
        do{
            System.out.println(in.pop());
        }while(in.getSize()!=0);
        
    }
    
}
