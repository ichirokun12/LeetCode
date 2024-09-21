class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0); // Dummy node to start the result
        ListNode ptr = answer;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Initialize sum with the carry from the previous iteration

            if (l1 != null) {
                sum += l1.val; // Add value from l1
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val; // Add value from l2
                l2 = l2.next;
            }

            carry = sum / 10;  // Calculate the carry
            sum = sum % 10;     // Current digit

            ptr.next = new ListNode(sum); // Create new node with the sum
            ptr = ptr.next;
        }

        return answer.next; // Return the next node since the first is a dummy node
    }
}
