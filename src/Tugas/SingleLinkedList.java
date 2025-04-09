//package Tugas;
//
////class Node{
////    int data;
////    Node next;
////
////    Node (int data){
////        this.data = data;
////        this.next = null;
////    }
////}
//
////Kelas Utama Single Linked List
//public class SingleLinkedList {
//    //awal linked list
//    Node head;
//
//    //menambah node diakhir list
//    void add(int data){
//        Node newNode = new Node(data);
//
//        if (head == null){
//            head = newNode;
//        }else{
//            Node current = head;
//            while(current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    //Menampilkan isi list
//    void pritn(){
//        Node current = head;
//        while(current != null){
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.print("null");
//    }
//
//    //untuk running
//    public static void main(String[] args) {
//        SingleLinkedList list = new SingleLinkedList();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list.pritn();
//    }
//}
//
