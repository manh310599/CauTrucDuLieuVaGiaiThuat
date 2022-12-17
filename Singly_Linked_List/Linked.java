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

    
    public static Node RemoveTail(Node heaNode) {
    
        Node LastNode = heaNode;
        Node prevNode = null;

        while (LastNode.next != null)
        {
            prevNode = LastNode;
            LastNode = LastNode.next;
        }
        
        prevNode.next = LastNode.next;

        return heaNode;
    }

    private static Node addToIndex(Node heaNode, int value, int index) {
        Node newNode = new Node(value);
        if (index == 0)
        {
            return addToHead(heaNode, value);
        }
        else{
            Node CurrentNode = heaNode;
            int count = 0;
            while (CurrentNode != null)
            {
                count++;
                if (count == index)
                {
                    newNode.next =CurrentNode.next;
                    CurrentNode.next = newNode;
                    break;
                }
         //       CurrentNode = CurrentNode.next;
            }
        }
        
        return heaNode;
    }

    
    public static Node RemoveHead(Node heaNode) {
    
        if (heaNode != null)
        {
            return heaNode.next;
        }
        return null;
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

        Node newlist2 = addToIndex(n1, 9,1);
        printfLinkList(newlist2);

        Node newlist3 = RemoveHead(n1);
        printfLinkList(newlist3);

        Node newlist4 = RemoveTail(n1);
        printfLinkList(newlist4);

        Node newlist5 = reverseList(newlist4);
        printfLinkList(newlist5);
    }

    public static Node reverseList(Node head)
    {
        ////Sắp xếp đảo ngược trong con trỏ
        Node cur = head;

        while (cur.next != null && cur != null)
        {
            Node nextNode = cur.next;
            cur.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }

        return head;
    }
}
