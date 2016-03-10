/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.registration;

/**
 *
 * @author Adrian
 */
public class StudentStack {
    private java.util.LinkedList studentList = new java.util.LinkedList();
    public StudentStack(){
        
    }
    public void clear(){
        studentList.clear();
    }
    public boolean isEmpty(){
        return studentList.isEmpty();
    }
    public Object topEl(){
        if(isEmpty()){
            throw new java.util.EmptyStackException();
        }
        return studentList.getLast();
    }
    public Object pop(){
        if(isEmpty())
        {
            throw new java.util.EmptyStackException();
        }
        return studentList.removeLast();
    }
    public void push(Object el){
        studentList.addLast(el);
    }
    public String toString(){
        return studentList.toString();
    }
    
    
    
}
