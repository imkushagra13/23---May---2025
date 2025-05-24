public class problem5 {
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static void reorder(Node head){
        if(head==null||head.next==null) return;

        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node revHalf=reverse(slow);
        slow.next=null;

        Node first=head,second=revHalf;
        while(second!=null){
            Node l1=first.next;
            Node l2=second.next;

            first.next=second;
            second.next=l1;
            first=l1;
            second=l2;
        }

    }
    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        printList(head);
        reorder(head);
        printList(head);
    }
}
