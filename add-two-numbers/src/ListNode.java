// ListNode is a class for storing a single node of a linked list storing
// integer values.  It has two public data fields for the data and the link to
// the next node in the list and has three constructors:
//   public ListNode()
//     creates node with data 0, null link
//   public ListNode(int data)
//     creates node with given data, null link
//   public ListNode(int data, ListNode next)
//     creates node with given data and given link

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(int ... list) {
        ListNode current = this;
        for (int data: list) {
            current.next = new ListNode(data);
            current = current.next;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(10);
        ListNode current = next;
        while(current != null) {
            stringBuilder.insert(0, current.data);
            current = current.next;
        }
        return stringBuilder.toString();
    }
}