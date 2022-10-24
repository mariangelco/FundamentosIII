/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;
public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createDoublyLinkedList(int nodeValue) {
            head = new Node(); 
            Node node = new Node();
            node.prev = null;
            node.next = null;
            node.value = nodeValue;
            head = node;
            tail = node;
            size = 1;
            return head;
          }
    
    // Insert Method DoublyLinkedList
          public void insertInLinkedList(int nodeValue, int location) {
            Node node = new Node();
            node.value = nodeValue;
            if (head == null) {
              createDoublyLinkedList(nodeValue);
              return;
            } else if (location == 0) {
              node.prev= null;
              node.next = head;
              head = node;
              head.prev= node;
            } else if (location >= size) {
              node.next = null;
              node.prev = tail;
              tail.next = node;
              tail = node ;
            } else {
              Node tempNode = head;
              int index = 0;
              while (index < location - 1) {
                tempNode = tempNode.next;
                tempNode.prev = tempNode;
                index++;
              }
              Node nextNode = tempNode.next;
              Node prevNode = tempNode;
              tempNode.next = node;
              node.next = nextNode;
            }
            size++;
          }

          //DoublyLinkedList Traversal
          public void traverseDoublyLinkedList() {
            if (head == null) {
              System.out.println("DLL does not exist!");
            } else {
              Node tempNode = head;
              for (int i = 0; i<size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                  System.out.print(" -> ");
                }
                tempNode.prev = null;
                tempNode = tempNode.next;
              }
            }
            System.out.println("\n");
          }

          // Search for a node
          boolean searchNode(int nodeValue) {
            if (head != null) {
              Node tempNode = head;
              for (int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                  System.out.print("Found the node at location: " +i+"\n");
                  return true;
                }
                tempNode = tempNode.next;
              }
            }
            System.out.print("Node not found! ");
            return false;
          }

          //Deleting a node from DoublyLinkedList
          public void deletionOfNode(int location) {
            if (head == null) {
              System.out.println("The DLL does not exist");
              return;
            } else if (location == 0) {
              head.prev = null;
              head = head.next;
              size--;
              if (size == 0) {
                tail = null;
              }
            } else if (location >= size) {
              Node tempNode = head;
              for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
              }
              if (tempNode == head) {
                tail = head = null;
                size--;
                return;
              }
              tempNode.next = null;
              tail = tempNode;
              size--;
            } else {
              Node tempNode = head;
              for (int i = 0; i <location-1; i++) {
                tempNode = tempNode.next;
              }
              tempNode.next = tempNode.next.next;
              tail = tail.prev;
              size--;
            }
          }

        //  Delete Entire DoublyLinkedList
        public void deleteDLL() {
          head = null;
          tail = null;
          System.out.println("The DLL deleted successfully");

        }
    
}
