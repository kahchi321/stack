/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author wic180056
 */
public class MyStack<E> {
    ArrayList<E> stack=new ArrayList();
    
    
    public MyStack(){
    }
    
    public void push(E o){
        stack.add(o);

    }
    
 public E pop(){
     if(stack.size()==0)
         throw new EmptyStackException();
     else{
        E temp=stack.get(stack.size()-1);
     stack.remove(stack.size()-1);
     return temp;}
     
 }
 public E peek(){
     return stack.get(stack.size()-1);
 }
 
 public int getSize(){
     return stack.size();
 }
 
 public boolean isEmpty(){
 if(stack.size()==0)
 return true;
 else
 return false;
 }
 
 public String toString(){
     return stack.toString();
 }
 public boolean search(E o){
   return stack.contains(o);
 }
 
}
