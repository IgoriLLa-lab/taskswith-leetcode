package Task2;

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
        ListNode result = new ListNode(0);
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        ListNode currentNode = result;

        int tenBox = 0;

        while (pointer1 != null || pointer2 != null) {
            int pointer1Value = (pointer1 == null) ? 0 : pointer1.val;
            int pointer2Value = (pointer2 == null) ? 0 : pointer2.val;

            int sum = pointer1Value + pointer2Value + tenBox;
            tenBox = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (pointer1 != null) {
                pointer1 = pointer1.next;
            }

            if (pointer2 != null) {
                pointer2 = pointer2.next;
            }
        }

        if (tenBox > 0) {
            currentNode.next = new ListNode(tenBox);
        }
        return result.next;
    }
}
