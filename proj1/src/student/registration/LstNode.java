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
public class LstNode {
    
    public Object info;
    public LstNode next;
    
    public LstNode(Object i){
        this(i,null);
    }
    public LstNode(Object i, LstNode n){
        info = i;
        next = n;
    }
    
}
