public class Linked_List {
    Node head;

    public Linked_List addNode(Linked_List list, int data){

        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null){
            list.head = newNode;
        }
        else {
            Node lastNode = list.head;
            while (lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    }

    public void printAllNodes(Linked_List list){
        if (list.head==null){
            System.out.println("Empty List");
        }
        else {
            Node lastNode = list.head;
            while (lastNode!=null){
                System.out.println(lastNode.data);
                lastNode = lastNode.next;
            }
        }
    }

    public Linked_List deleteNodeWithKey(Linked_List list, int key){
        Node currNode = list.head, prev = null;
        if (list.head==null){
            System.out.println("Empty List");
        }
        if (list.head.data==key){
            list.head = list.head.next;
        }
        else{
            while (currNode != null && currNode.data != key) {
                prev = currNode;
                currNode = currNode.next;
            }

            if (currNode != null) {
                prev.next = currNode.next;
                System.out.println("This key = "+key + " found and deleted");
            }
        }
        return list;
    }
}
