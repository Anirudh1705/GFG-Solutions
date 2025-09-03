class Solution {
    public Node reverse(Node head) {
        // code here
        Node prev = null;
        Node forw; Node curr = head;
        while(curr != null){
            forw = curr.next;
            curr.next = prev; 
            //Intentionally set prev to null
            if(prev != null)
                prev.prev = null;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}
