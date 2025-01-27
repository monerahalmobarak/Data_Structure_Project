
package owrproject;

 //Stack ADT
public class LLstack<E> {

    static class Node<E> {

        private E element; // reference to the element stored at this node
        private Node<E> next; // reference to the subsequent node in the list

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public void setelement(E element) {
            this.element = element;
        }
    }
    private Node<E> top;   // reference to the head node 
    private int size;   // number of elements in the LLstack 

    public LLstack() {   // constructs an empty LLstack
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return top.getElement();
    }

    public void push(E elem) {
        Node<E> v = new Node<E>(elem, top);   // create and link-in a new node 
        top = v;
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E temp = top.getElement();
        top = top.getNext();   // link-out the former top node 
        size--;
        return temp;
    }

    public void print() {
        LLstack temp = new LLstack();
        System.out.print("Top ");
        while (!isEmpty()) {
            E ele = pop();
            System.out.print(ele + " ");
            temp.push(ele);
        }
        System.out.print(" Bottom");
        System.out.println();

        while (!temp.isEmpty()) {
            push((E) temp.pop());
        }
    }
}


