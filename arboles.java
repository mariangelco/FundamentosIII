
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class arboles {
    
    public static void main(String[] args) {
        Node raiz = new Node(1);
        raiz.hijo.add(new Node(2));
        raiz.hijo.add(new Node(3));
        raiz.hijo.add(new Node(4));
        raiz.hijo.get(0).hijo.add(new Node(5));
        raiz.hijo.get(0).hijo.add(new Node(6));
        raiz.hijo.get(0).hijo.add(new Node(7));
        raiz.hijo.get(1).hijo.add(new Node(8));
        raiz.hijo.get(2).hijo.add(new Node(9));
        raiz.hijo.get(2).hijo.add(new Node(10));
        raiz.hijo.get(2).hijo.add(new Node(11));
        raiz.hijo.get(1).hijo.get(0).hijo.add(new Node(12));
        raiz.hijo.get(2).hijo.get(1).hijo.add(new Node(13));
        raiz.hijo.get(1).hijo.get(0).hijo.get(0).hijo.add(new Node(14));
        imprimir(raiz);
        eliminar(raiz);        
    }
    
    public static class Node{
        int value;
        List<Node> hijo = new LinkedList<>();

        Node(int num){
            value = num;
        }

        Node(int num,List<Node> h){
            value = num;
            hijo = h;
        }
    }

    private static void imprimir(Node raiz){
        if(raiz == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(raiz);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++) {
                Node node = queue.poll();
                assert node != null;
                System.out.print(node.value + " ");
                for (Node item : node.hijo) {
                    queue.offer(item);
                }
            }
            System.out.println();
        }
    }
    
    public static void eliminar(Node raiz){
    raiz.hijo.clear();
    raiz = null;
    System.out.println("El árbol se ha eliminado");
             }  
}

/*public class node {
   String data;
   Array list <node> hijos = new Array list();
}*/
/*
        node head;
        node back;
        String data;
        int id;

node back;
    String data;
    node front;
*/
