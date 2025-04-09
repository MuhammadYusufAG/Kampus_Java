//package Tugas;
//
//class Node {
//    int data;
//    Node prev;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.prev = null;
//        this.next = null;
//    }
//}
//
//public class DoubleLinkedList {
//    Node head;
//    Node tail;
//
//    // pushDepan: Tambah data di depan
//    public void pushDepan(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = tail = newNode;
//        } else {
//            newNode.next = head;
//            head.prev = newNode;
//            head = newNode;
//        }
//    }
//
//    // pushBelakang: Tambah data di belakang
//    public void pushBelakang(int data) {
//        Node newNode = new Node(data);
//        if (tail == null) {
//            head = tail = newNode;
//        } else {
//            tail.next = newNode;
//            newNode.prev = tail;
//            tail = newNode;
//        }
//    }
//
//    // popDepan: Hapus data dari depan
//    public void popDepan() {
//        if (head == null) {
//            System.out.println("List kosong");
//            return;
//        }
//        if (head == tail) {
//            head = tail = null;
//        } else {
//            head = head.next;
//            head.prev = null;
//        }
//    }
//
//    // popBelakang: Hapus data dari belakang
//    public void popBelakang() {
//        if (tail == null) {
//            System.out.println("List kosong");
//            return;
//        }
//        if (head == tail) {
//            head = tail = null;
//        } else {
//            tail = tail.prev;
//            tail.next = null;
//        }
//    }
//
//    // Menampilkan isi list
//    public void tampilList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " <-> ");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//    // Program utama
//    public static void main(String[] args) {
//        DoubleLinkedList dll = new DoubleLinkedList();
//
//        System.out.println("Push Depan 1, 2, 3, 4, 5:");
//        dll.pushDepan(1);
//        dll.pushDepan(2);
//        dll.pushDepan(3);
//        dll.pushDepan(4);
//        dll.pushDepan(5);
//        dll.tampilList(); // Output: 5 <-> 4 <-> 3 <-> 2 <-> 1 <-> NULL
//
//        System.out.println("Pop Depan:");
//        dll.popDepan();
//        dll.tampilList(); // Output: 4 <-> 3 <-> 2 <-> 1 <-> NULL
//
//        System.out.println("Push Belakang 0:");
//        dll.pushBelakang(0);
//        dll.tampilList(); // Output: 4 <-> 3 <-> 2 <-> 1 <-> 0 <-> NULL
//
//        System.out.println("Pop Belakang:");
//        dll.popBelakang();
//        dll.tampilList(); // Output: 4 <-> 3 <-> 2 <-> 1 <-> NULL
//    }
//}