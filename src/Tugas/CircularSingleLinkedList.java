//package Tugas;
//
//// Node untuk Circular Single Linked List
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//public class CircularSingleLinkedList {
//    Node head = null;
//    Node tail = null;
//
//    // Menambahkan node ke akhir list
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//            tail.next = head;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head;
//        }
//    }
//
//    // Menampilkan isi list
//    public void display() {
//        if (head == null) {
//            System.out.println("List kosong");
//            return;
//        }
//        Node current = head;
//        do {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        } while (current != head);
//        System.out.println("(kembali ke head)");
//    }
//
//    public static void main(String[] args) {
//        CircularSingleLinkedList csll = new CircularSingleLinkedList();
//        csll.insert(100);
//        csll.insert(200);
//        csll.insert(300);
//        csll.display(); // Output: 100 -> 200 -> 300 -> (kembali ke head)
//    }
//}
