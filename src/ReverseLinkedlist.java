/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 22-05-2022
 */

public class ReverseLinkedlist {

    static ListNode head;
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        push(20);
        push(12);
        push(45);
        push(53);
        push(9);

        System.out.println("Linked List");
        print();

        head = reverseList(head);
        System.out.println("Reversed Linked List");
        print();
    }

    static void print()
    {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void push(int data)
    {
        ListNode temp = new ListNode(data);
        temp.next = head;
        head = temp;
    }

    public static ListNode reverseList(ListNode head) {

      // Iterative Method
//        ListNode current = head;
//        ListNode previous = null;
//        while(current != null){
//            ListNode temp = current.next;
//            current.next = previous;
//            previous = current;
//            current = temp;
//        }
//        return previous;

        // Recursive Approach
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode second = head.next;
        head.next = null;
        ListNode result = reverseList(second);
        second.next = head;

        return result;

    }
}
