class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
    }
}
public class problem4 {
    public static ListNode addTwoNumber(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.data);
            if(head.next!=null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        ListNode ans=addTwoNumber(l1,l2);
        printList(ans);
    }

}
