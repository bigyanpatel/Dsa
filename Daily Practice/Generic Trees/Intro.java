import java.util.*;

public class Intro{
    public static class Node{
        int data; // for storing the data of a node
        ArrayList <Node> children = new ArrayList<>(); // to store the child nodes
    } 

    public static void display(Node node){
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static int size(Node node){
        int s = 0;
        
        for(Node child : node.children){
            int cs = size(child);
            s += cs;
        }
        s += 1;

        return s;
    }

    public static int maxNode(Node node){
        int max = Integer.MIN_VALUE;

        for(Node child : node.children){
            int cm = maxNode(child);
            max = Math.max(cm, max);
        }
        max = Math.max(node.data, max);

        return max;
    }

    public static int height(Node node){
        int ht = -1;

        for(Node child : node.children){
            int ch = height(child);
            ht = Math.max(ch, ht);
        }

        ht += 1;

        return ht;
    }

    public static void traversals(Node node){
        // node pre area
        System.out.println("Node pre " + node.data);

        for(Node child : node.children){
            // edge pre area
            System.out.println("Edge pre " node.data + "--" + child.data);
            traversals(child);
            // edge post area
            System.out.println("Edge post " node.data + "--" + child.data);
        }
        // node post area
        System.out.println("Node post " + node.data);
    }

    public static void levelOrderTraversals(Node node){
        Queue <Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() > 0){
            node = q.remove();
            System.out.println(node.data);
            for(Node child : node.children){
                q.add(child);
            }
            System.out.println(".");
        }

    }

    public static void linearize(Node node){
        
    }

    public static Node construct(int[] arr){
        Node root = null;

        Stack <Node> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1){
                st.pop();
            } else{
                Node t = new Node();
                t.data = arr[i];

                if(st.size() > 0){
                    st.peek().children.add(t);
                } else{
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }
    
    public static void main(String[] args) {

        
    }
}