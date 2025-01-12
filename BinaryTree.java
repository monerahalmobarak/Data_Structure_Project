
package owrproject;


public class BinaryTree<E> {


    public TreeNode<E> Root; 
    public int size;

    public BinaryTree() {
        Root = null;
        size = 0;
    }

    public boolean hasLeft(TreeNode<E> node) {
        return node.left != null;
    }

    public boolean hasRight(TreeNode<E> node) {
        return node.right != null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public TreeNode<E> addRoot(E e) {
        if (!isEmpty()) {
            System.out.println("Three is not empty!");
        } else {
            Root = new TreeNode<>(e);
            size = 1;
        }
        return Root;
    }

    public TreeNode<E> search(TreeNode<E> root, E e, TreeNode<E> result) {

        if (root == null) {
            return null;
        }
        if (e == root.element) {
            return root;
        } else {
            if (root.left != null) {
                result = search(root.left, e, result);
            }
            if (root.right != null) {
                result = search(root.right, e, result);
            }

            return result;
        }
    }


    public void addLeft(E e, E p) {
        TreeNode n = search(Root, p, null);
        if (n != null) {
            if (n.left != null) {
                System.out.println("parent already has a left child ");
            } else {
                TreeNode child = new TreeNode(e);
                n.left = child;
                child.parent = n;
                size++;
            }
        } else {
            System.out.println("parent does not exist");
        }
    }

    public void addRight(E e, E p) {
        TreeNode n = search(Root, p, null);
        if (n != null) {
            if (n.right != null) {
                System.out.println("parent already has a right child ");
            } else {
                TreeNode child = new TreeNode(e);
                n.right = child;
                child.parent = n;
                size++;
            }
        } else {
            System.out.println("parent does not exist");
        }
    }
 private void inOrder(TreeNode<E> node) {
        
        /*In this method we will :
          need to print the tree in order ( Left child - parent - right child )
         1-stop when the node is null ( to go through all the nodes in the tree )
         2- recursive call to go the left node
         3- print the element in the node 
         4- recursive call to go to the right node
        */
        
/* 1 */ if (node != null) {
/* 2 */ inOrder(node.left);
/* 3 */ System.out.print(node.element + "       ");
/* 4 */ inOrder(node.right);
        }

    }
    // easier to call in main class
 public void inOrder(){
 
     inOrder( Root ) ;
 }}