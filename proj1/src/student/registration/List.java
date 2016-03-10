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
public class List {
    protected LstNode head, tail,holder;
    private int counter;
    
    public List(){
        head = tail = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addToHead(int el){
        head = new LstNode(el,head);
        if (tail == null){
            tail = head;
        }
    }
    
    public void addToTail(Object el){
        if (!isEmpty()){
            tail.next = new LstNode(el);
            tail = tail.next;
        }
        else{
            head = tail = new LstNode(el);
        }
    }
    public Object deleteFromHead(){//delete the head and return its info;
        Object el = head.info;
        if (head == tail)  //if only one node on the list;
            head = tail = null;
        return el;
    }
    public Object deleteFromTail(){ //delet the tail and return its info;
        Object el = tail.info;
        if (head==tail){
            head = tail = null;
        }
        else{
            LstNode tmp;
            for(tmp = head; tmp.next != tail; tmp =tmp.next){}
            tail = tmp;
            tail.next = null;
        }
        return el;
    }
    public void printAll(){
        for (LstNode tmp = head; tmp != null; tmp = tmp.next)
            System.out.print (tmp.info + " ");
    }
    public boolean isInList(Object el){
        LstNode tmp;
        for (tmp = head; tmp !=null && tmp.info != el; tmp = tmp.next){}
        return tmp !=null;
    }
    
}
