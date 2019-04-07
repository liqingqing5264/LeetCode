// 142. Linked List Cycle II
// Medium
// Linked List, Two pointers

// Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

// To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. 
// If pos is -1, then there is no cycle in the linked list.

// Note: Do not modify the linked list.

// Example 1:

// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.

// Example 2:

// Input: head = [1,2], pos = 0
// Output: tail connects to node index 0
// Explanation: There is a cycle in the linked list, where tail connects to the first node.

// Example 3:

// Input: head = [1], pos = -1
// Output: no cycle
// Explanation: There is no cycle in the linked list.

// Follow up:
// Can you solve it without using extra space?

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		boolean isCycled = false;
		while (fast != null && slow != null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				isCycled=true;
				break;
			}
			
		}
		if(!isCycled) return null;
		fast=head;
		while(fast!=slow) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
}
