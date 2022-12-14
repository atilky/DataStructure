package ch3;

public class Ch3 {

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode reverseListNode(ListNode head){
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            next = curr.next;//next=2//next=3//next=4
            curr.next = prev;//curr.next=null//2.next=1//3.next=2
            prev = curr;     //prev=1//1=2
            curr = next;     //curr=2//2=3
        }
        return prev;
    }


    public static ListNode reverseListNode2(ListNode head){

        ListNode prev = null;
        ListNode next = null; //先記錄下一個
        ListNode cur = head; //先記錄當前

        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static ListNode reverseListNode3(ListNode head){

        if (head == null || head.next == null){
            return head;
        }

        //1.讓5指向4
        //2.4指向null
        //3.3可以找到4
        ListNode new_node = reverseListNode3(head.next);
        head.next.next = head;
        head.next = null;
        return new_node;
    }




    public static void main(String[] args) {

        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println(node1);

        ListNode node = reverseListNode3(node1);
        System.out.println(node);

        int a = 5;
        int b = 6;
        System.out.println(a += b);
        System.out.println(a + b);
        System.out.println(a + b);

    }


}
