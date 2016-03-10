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
public class BST {
    protected Node root;
    
    public BST(){
        root = null;
    }
    protected void visit(Node p){
        System.out.print(p.key + " ");
    }
    /*public Node search (Node p, int el){
        return search(p, root);
    }*/
    public Node search(Node p, int el){
        while(p != null)
            if(el == p.key)
                return p;
            else if(el < p.key)
                p = p.left;
            else p = p.right;
        return null;
    }
    
}
