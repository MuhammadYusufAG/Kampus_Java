package Tugas;

// Node untuk Circular Double Linked List
class DNode {
    int data;
    DNode next, prev;

    DNode(int data) {
        this.data = data;
    }
}

public class CircularDoubleLinkedList {
    DNode head = null;

    // Menambahkan node ke akhir list
    public void insert(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            DNode tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Menampilkan isi list maju
    public void displayForward() {
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        DNode current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(kembali ke head)");
    }

    // Menampilkan isi list mundur
    public void displayBackward() {
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        DNode current = head.prev; // mulai dari tail
        do {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        } while (current != head.prev);
        System.out.println("(kembali ke tail)");
    }

    public static void main(String[] args) {
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
        cdll.insert(100);
        cdll.insert(200);
        cdll.insert(300);

        System.out.println("Tampilan Maju:");
        cdll.displayForward();  // Output: 100 <-> 200 <-> 300 <-> (kembali ke head)

        System.out.println("Tampilan Mundur:");
        cdll.displayBackward(); // Output: 300 <-> 200 <-> 100 <-> (kembali ke tail)
    }
}
