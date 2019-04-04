/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1Q2;

/**
 *
 * @author wic180056
 */
public class TestMyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack<Character> s=new MyStack();
        s.push('a');
        s.push('b');
        s.push('c');
        System.out.println(s.toString());
        System.out.println(s.search('b'));
        System.out.println(s.search('k'));
        System.out.println("");
        System.out.println("------Q1(c)------");
        System.out.println("");
        MyStack<Integer> i=new MyStack();
        i.push(1);
        i.push(2);
        i.push(3);
        System.out.println(i.toString());
        System.out.println(i.search(6));
        
    }
    
}
