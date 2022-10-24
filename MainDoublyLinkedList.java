/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

class MainDoublyLinkedList {
    public static void main(String[] args) {
    DoublyLinkedList dLL = new DoublyLinkedList();
    dLL.createDoublyLinkedList(5);

    dLL.insertInLinkedList(6, 0);
    dLL.insertInLinkedList(7, 2);

    dLL.insertInLinkedList(8, 2);
    System.out.println(dLL.size);
    }
}
