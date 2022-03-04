package Task2;

import java.util.ListIterator;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(head1, head2));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + ""
                    + next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode l3 = head;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int valueL1 = (l1 != null) ? l1.val : 0; //
            int valueL2 = (l2 != null) ? l2.val : 0; // 5

            int summ = valueL1 + valueL2 + carry; // 2 + 5 + 0
            carry = summ / 10; // 7 / 10 = 0
            int remainder = summ % 10; // 7 % 10 = 0

            l3.next = new ListNode(remainder);//0 null
            l3 = l3.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            l3.next = new ListNode(carry);
        }
        return head.next;
    }
}
