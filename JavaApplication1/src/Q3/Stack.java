/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author wic180056
 */
public class Stack<E> {
    ArrayList<E> stack=new ArrayList();
    
    
    public Stack(){
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
 
 public int sum(Stack<Integer> i){
     if(i.isEmpty())
        throw new EmptyStackException();
     else if(i.getSize()==1)
         return i.peek();
     else{
         int sum=i.pop();
         while(i.getSize()!=0){
             sum=sum+i.pop();
         }
         return sum;    
     }
 }
}
