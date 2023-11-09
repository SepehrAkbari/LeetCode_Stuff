# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        x1 = 0
        x2 = ListNode()
        x3 = x2

        while l1 or l2:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            total = x + y + x1
            x1 = total // 10
            x3.next = ListNode(total % 10)
            x3 = x3.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        if x1 > 0:
            x3.next = ListNode(x1)

        return x2.next
