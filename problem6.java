class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class problem6 {
    static Node remove(Node head,int idx){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==idx){
            head=head.next;
            return head;
        }
        size=size-idx;
        Node prev=head;
        for(int i=1;i<size;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    static void printlist(Node head){
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
        printlist(head);
        remove(head,2);
        printlist(head);

    }
}
