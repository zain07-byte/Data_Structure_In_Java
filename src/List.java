import java.util.LinkedList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();

        list = list.addNode(list,1);
        list = list.addNode(list,2);
        list = list.addNode(list,3);
        list = list.addNode(list,4);
        list = list.addNode(list,5);

        list.printAllNodes(list);
        System.out.print("Enter Nuber you want to delete :");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();

        list = list.deleteNodeWithKey(list,key);

        list.printAllNodes(list);
    }
}
