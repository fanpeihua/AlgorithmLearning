package part_2_listproblem;

/**
 * Created by oneball on 2018/5/5.
 */
public class Problem_04_ReverseList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node reverseList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;

            pre = head;
            head = next; // 下一个节点作为判断节点
        }
        return pre;
    }

    public static void printLinkedList(Node head) {
        System.out.println("Linked List:");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        printLinkedList(head1);
        head1 = reverseList(head1);
        printLinkedList(head1);
    }

}
