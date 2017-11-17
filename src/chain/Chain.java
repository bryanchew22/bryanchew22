
package chain;


public class Chain {
    
    
    public Chain(){
        Node<Integer> firstNode = new Node<>(10);
        Node<Integer> first = firstNode;
        
        for (int i=2;i<=5;i++){
            first = first.next =  new Node<>(10*i);
        }
        
        displayData(firstNode);    
    }
    
    public static void displayData( Node fnode){
        if (fnode != null){
            System.out.println(fnode.data);
            displayData(fnode.next);
        }
    }
    
    private class Node<T>{
        private T data;
        private Node next;
        
        private Node(T data){
            this.data = data;
            next = null;
        }
        
        private Node(T data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    
    public static void main(String[] args) {
        new Chain();
    }
    
}