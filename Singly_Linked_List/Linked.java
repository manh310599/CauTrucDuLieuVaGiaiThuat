package Singly_Linked_List;

public class Linked {

    public static class Node {
        int value;
        Node next;


        Node(int value){
            this.value = value;
            this.next = null;
        }

        
        
    }

    public static void printfLinkList(Node head)
    {
        if (head == null)
        {
            System.out.println("Trống");
        }
        else{
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null)
                System.out.print("->");
                else
                System.out.println();
            }
        }
    }

    public static Node addToHead(Node headNode,int value) {
        Node Headnode = new Node(value);
        if (headNode.next != null)
        {
            Headnode.next = headNode;
        }

        return Headnode;
 
    }

    private static Node addToTail(Node heaNode, int value) {

        Node newNode = new Node(value);
        
        if (heaNode == null)
        {
            return newNode;
        }
        else{
            Node lastNode = heaNode;
            while (lastNode.next != null)
            {
                lastNode = lastNode.next; 
            }
            lastNode.next = newNode;
        }

        return heaNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printfLinkList(n1);
        Node newlist = addToHead(n1, 5);
        printfLinkList(newlist);

        Node newlist1 = addToTail(n1, 9);
        printfLinkList(newlist1);
    }

   
}
