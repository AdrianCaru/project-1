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
public class Node {
    protected int key;
    protected Node left, right;
    protected String data;
    public Node(){
        left = right = null;
    }
    public Node(int el){
        this(el,null,null);
        
    }
    public Node(int el, Node lt, Node rt){
        key = el; 
        left = lt;
        right = rt;
    }
    public String getData(){
        return data;
    }
    public void setData(String s){
        data = s;
    }
}
