import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
DATA STRUCTURES: way of organizing data in memory so that it can be used efficiently

for more info visit "C:\Users\Dylan\Documents\Sheridan 2024 Y2T2\C_Prog\7B\Test3Review.docx"
*/
/*
1. Array: collection of elements of same data type, stored in contiguous memory locations

    - Characteristics:
        a. Homogenous: same data type
        b. Fixed Size: size is declared at creation
        c. Zero-based indexing: array starts at index 0
    
    -Operations:
        a. Insertion/Deletion: slow for large arrays (need shifting)
        b. Direct Access: Fast, O(1)
*/
class Array {
    int[] numbers = {10,20,30,40};
}

/*
2. Linked List: collection of nodes where each node contains data and a reference (pointer to next/prev node)

    - Type of Linked Lists:
        a. Singly Linked List: each node points to the next node
        b. Doubly Linked List: nodes have reference to next/prev node
        c. Circular Linked list: the last node point back to the first node
    
    - Characteristics:
        a. Dynamic Size: grow/shrinks dynamically
        b. Non-contiguous memory: nodes are scattered in memory
        c. Efficient Insert/Delete: Operations at head/tail are fast, O(1)
*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/*
3. Stack (LIFO): linear data structure, elements added/removed from one end (**the top)  

    - Characteristics: 
        a. LIFO: Last In First Out Principle
        b. Single Pointer: Tracks the top of the stack

    - Operations:
        a. Push: add element to stack top
        b. Pop: remove element from stack top
        c. Peek: View the top element without removing
    
    - Use Cases:
        a. Function calls (maintain call stack)
        b. Undo/redo in applications
        c. Balanced parenthesis checking
*/

class StackExample {
    StackExample() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element: " + stack.peek());
        stack.pop();
        System.out.println("Stack after pop: " + stack);
    }
}

/*
4. Queue (FIFO): linear data structure, elements are added at the rear (tail) and removed from the front (head)

    - Characteristics: 
        a. FIFO: First In First Out
        b. 2 pointers: track front and rear

    - Operations:
        a. Enqueue: Add element to the rear
        b. Dequeue: Add element to the front
    
    - Use Cases:
        a. Task Scheduling
        b. Printing jobs in printer queue
        c. Breadth-First Search in graphs
*/
class QueueExample {
    QueueExample() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front Element: " + queue.peek());
        queue.remove();
        System.out.println("Queue after dequeue: " + queue);
    }
}

/*
5. Tree: heirarchial data structure with nodes connected by edges. Topmost node is the root, and nodes have children

    - Type of Trees:
        a. Binary Tree: each node has atleast 2 children
        b. Binary Search Tree (BST): a binary search tree where the left child has smaller values, right child has larger values
        c. AVL Tree: self balancing BST where height difference of left/right subtrees is at most 1  

    - Operations:
        a. Traversal's:
            - Inorder (passes under): left, root, right
            - Preorder (passes left): root, left, right
            - Postorder (passes right): left, right, root  

5a. Binary Search Tree (BST)
    - Types:
        a. Full: all nodes have 0 or 2 children
        b. Complete: all levels filled except last (node left-aligned)
        c. Perfect: full & complete
        d. Balanced: height difference between subtrees <= 1

    - Performance:
        a. Complexity: O(log n)
        b. Height: O(h) == O(log n)
        c. Operation complexity: h ~ O(log n)
    
    - Operations:
        a. Search: compare with root, traverse left if less than, right is more than
            k = key[x]  -> return node
            k < key[x]  -> search left
            k > key[x]  -> search right
            k != key[x] -> return NULL     
        b. Insertion: maintain BST properties
            Key: keep two pointer (current, parent)
            current < parent    -> left
            current > parent    -> right
            current = NULL      -> insert
        c. Deletion: look at images/BST Deletion by Merging.png for an example
            Case 1: No children     -> remove directly
            Case 2: One child       -> replace with child
            Case 3: Two children    -> replace with in-order successor/predecessor
                a. left successor: find largest key in left subtree, make parent of right subtree
                b. right successor: find smallest key in right subtree, make parent of left subtree    
                
5b. AVL Tree
    - Rotations:
        a. Right Rotation
            new_root = root.left
            root.left = new_root.right
            new_root.right = root
            root = new_root
        b. Left Rotation
            new_root = root.right
            root.right = new_root.left
            new_root.left = root
            root = new_root
    
    - Tree Values:
        a. - value indicate left-heavy tree
        b. + value indicate right-heavy tree
        c. zero value means tree is balanced

    - Self Balancing: view images/AVL Tree Balancing.png for an example
        a. Left-Left (parent balance -2, left child -1)
            Rotate right around parent
        b. Left-Right (parent balance -2, left child +1)
            Rotate left around child
            Rotate right around parent
        c. Right-Right (parent balance +2, right child +1)
            Rotate left around parent
        d. Right-Left (parent balance +2, right child -1)
            Rotate right around child
            Rotate left around parent
    
    - Performance:
        a. Data structure       O(n) space
        b. Restructuring        O(1) time
        c. Searching            O(log n) time
        d. Insertion            O(log n) time
        e. Removal              O(log n) time
*/
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class TreeExample {
    TreeExample() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        System.out.println("Root: " + root.data);
        System.out.println("Left Child: " + root.left.data);
        System.out.println("Right Child: " + root.right.data);
    }
}

/*
6. Heap: special tree based data structure where the parent node is either greater than (Max-heap) or smaller than (Min-heap) its children

    - Characteristics:
        a. used in priority queues
        b. efficient for accessing the maximum or minimum element

7. Graph: a collection of nodes (vertices connected by edges)

    - Charcteristics:
        a. directed/undirected
        b. weighted/unweighted
*/

/*
SUMMARY

Data Structure	    Key Features	                    Time Complexity Example
Array	            Fixed size, contiguous memory	    O(1) access
Linked List         Dynamic size, scattered memory      O(n) search
Stack               LIFO                                O(1) push/pop
Queue               FIFO                                O(1) enqeue/dequeue
Tree                Heirarchial                         O(log n) for BST ops
Heap                Complete Binary tree                O(log n) for insert
Graph               Nodes and Edges                     Depends   

*/



public class h_data_structures {
    
    public static void main(String[] args) {
        
    
    }

}
