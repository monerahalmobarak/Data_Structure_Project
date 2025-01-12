package owrproject;

//to import the scanner 
import java.util.*;

public class Data_structure_project {

// scanner for all the class 
static Scanner input = new Scanner(System.in);

// the main class by monerah almobarak 442002988
public static void main(String[] args) { 
    
    /* 
     SECTION : 31S
     GROUP number : 7
     monerah almobarak / 442002988 / 442002988@pnu.edu.sa
     sarah altaweel    / 442000786 / 442000786@pnu.edu.sa
     Norah Aleyadah    / 442003193 / 442003193@pnu.edu.sa
  Nada Hamad Al-otaibi / 442003374 / 442003374@pnu.edu.sa

    */
        // the print statements :
        System.out.println("**Welcome to the Data structure Merging Assienment**");
        System.out.println("Please select one of the following options:");
        System.out.println("1: Mergin two Arrays data structure type");
        System.out.println("2: Mergin two Single Linked Lists data structure type");
        System.out.println("3: Mergin two Stacks data structure type");
        System.out.println("4: Mergin two Queues data structure type");
        System.out.println("5: Mergin two Trees data structure type");
        System.out.println("Your selection is:");

  //the variable from the user to decide which method to output
   int options = input.nextInt();
  //  the switch loop to take the variable user choice and output the method requested 
      switch (options) {//
          // the first choice to show the Arrays merge 
          case 1: 
               theArraysmerge();  // the Arrays merge method
           break;
          // the second choice to show  the list merge 
            case 2:
                 mergeSinglyLinkedList(); // the list merge
            break;
            // the third choice to show  the Stacks merge
            case 3:
               MergeStacks(); // the Stacks merge method
            break;
            // the fourth choice to show  the Queues merge
            case 4:
               MergeQueues(); //  the Queues merge method
            break;
            // the Fifth choice to show  the BinrayTrees merge
            case 5:
               BinrayTrees();  // the merge BinrayTrees 
                break;
            default:
                System.out.println("Invalid Option!!"); // if the user choice Invalid Option
        }
    }
    // The Array Merge method :
    public static void theArraysmerge() {
        // monerah almobarak 442002988
        // the size of the first array from the user
        System.out.print("Please enter The first Data set's size: ");
        int firstSize = input.nextInt();
        int[] firstArray = new int[firstSize];
         // Creating The First Array
        System.out.println("Please enter The First Data set elements: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = input.nextInt(); }
        //the size of the Second array from the user
        System.out.print("Please enter The Second Data set's size: ");
        int secondSize = input.nextInt();
        int[] secondArray = new int[secondSize]; 
        //Creating The Second Array
        System.out.println("Please enter The Second Data set elements: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = input.nextInt();}
        // Creating The Merge
        int[] mergedArray = new int[firstSize + secondSize];
        int i = 0;
        for (int j = 0; j < firstArray.length; j++) {
            mergedArray[i++] = firstArray[j];}
        for (int j = 0; j < secondArray.length; j++) {
            mergedArray[i++] = secondArray[j]; }
        //Print of The First Array
        System.out.print("The First given Array: ");
        System.out.print("[");
        for (int f = 0; f < firstArray.length; f++) {
            System.out.print(firstArray[f]);
            if (f != firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Print of The Second Array
        System.out.print("The Second given Array: ");
        System.out.print("[");
        for (int s = 0; s < secondArray.length; s++) {
            System.out.print(secondArray[s]);
            if (s != secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Print of The Merged Array
        System.out.print("The Resultant Mergined Arrays: ");
        System.out.print("[");
        for (int m = 0; m < mergedArray.length; m++) {
            System.out.print(mergedArray[m]);
            if (m != mergedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }// end of theArraysmerge method
    
    // The SinglyLinkedList Merge method :
     public static void mergeSinglyLinkedList() { 
        // sarah altaweel 442000786
        SinglyLinkedList<Integer> firstList = new SinglyLinkedList<>();//creating the first list
        SinglyLinkedList<Integer> secondList = new SinglyLinkedList<>();//creating the second list
        System.out.print("Please enter The first Data set's size: ");
        int size1 = input.nextInt();//asking the user to enter the size of the first list and save it in (size1)
        System.out.println("Please enter The First Data set elements: ");
        for (int i = 0; i < size1; i++) {// using the size the user entered for the first list
            firstList.addLast(input.nextInt()); //Inserting the first list's elements
        }
        System.out.print("Please enter The Second Data set's size: ");
        int size2 = input.nextInt();//asking the user to enter the size of the second list and save it in (size2)
        System.out.println("Please enter The Second Data set elements: ");
        for (int i = 0; i < size2; i++) {// using the size the user entered for the second list
            secondList.addLast(input.nextInt()); //Inserting the second list's elements
        }
        //merge the two lists 
        SinglyLinkedList<Integer> mergedList = new SinglyLinkedList<>();//creating a list to merge the first list and the second list
        for (int i = 0; i < size1; i++) {// using the size1 to go through all the elements in the first list
            int ele = firstList.removeFirst();// remove the first element and save it in ele
            mergedList.addLast(ele);//add ele to the merged list 
            firstList.addLast(ele);// add ele back to the first list so the first list will not be empty
        }
        for (int i = 0; i < size2; i++) {// using the size2 to go through all the elements in the second list
            int ele = secondList.removeFirst();// remove the first element and save it in ele
            mergedList.addLast(ele);//add ele to the merged list
            secondList.addLast(ele);// add ele back to the second list so the second list will not be empty
        }
        //printing the lists
        System.out.println("The First given Linked List:");
        firstList.printList();// calling a method to print the first list

        System.out.println("The Second given Linked List:");
        secondList.printList();// calling a method to print the second list
            
        System.out.println("The Resultant Mergined Linked List: ");
        mergedList.printList();// calling a method to print the merged list
    }

     //// The Stacks Merge method :
    public static void MergeStacks() {
        //Norah Aleyadah...442003193
                
        //creating the first stack 
        LLstack<Integer> Stack1 = new LLstack<>();
        //Asking the user to enter a size for the first stack
        System.out.print("Please enter The first Data set size: ");
        int sizeStack1 = input.nextInt();
        //Asking the user to enter the elements of the first set
        System.out.println("Please enter The first Data set elements: ");
        for (int i = 0; i < sizeStack1; i++) {
            int ele = input.nextInt();
            Stack1.push(ele);
        }

        //Crating the seconed Stack
        LLstack<Integer> Stack2 = new LLstack<>();
        //Asking the user to enter a size for the seconed stack
        System.out.print("Please enter The seconed Data set size: ");
        int sizeStack2 = input.nextInt();
        //Asking the user to enter the elements of the seconed set
        System.out.println("Please enter The seconed Data set elements: ");
        for (int i = 0; i < sizeStack2; i++) {
            int ele = input.nextInt();
            Stack2.push(ele);
        }

        //creating two temproray stacks and mergined stack 
        LLstack<Integer> temp1 = new LLstack<>();
        LLstack<Integer> temp2 = new LLstack<>();
        LLstack<Integer> Mergined = new LLstack<>();
        
        //Copy the first stack to the temproray stack
        while (!Stack1.isEmpty()) {
            int ele = Stack1.pop();
            temp1.push(ele);
        }
        
        //Transfer the elements to the mergined stack and return it to the original stack
        while (!temp1.isEmpty()) {
            int ele = temp1.pop();
            Mergined.push(ele);
            Stack1.push(ele);
        }
        
        //Copy the Secoend stack to the temproray stack
        while (!Stack2.isEmpty()) {
            int ele = Stack2.pop();
            temp2.push(ele);
        }
        
        //Transfer the elements to the mergined stack and return it to the original stack
        while (!temp2.isEmpty()) {
            int ele = temp2.pop();
            Mergined.push(ele);
            Stack2.push(ele);
        }

        //Display the original Stacks
        System.out.println("The First givin Stack:");
        Stack1.print();

        System.out.println("The Seconed givin Stack:");
        Stack2.print();

        //print the mergind stack
        System.out.println("The Resultant Mergined Stacks:");
        Mergined.print();
    }//end MergeStacks method

    
    
    // The Queues Merge method :
    public static void MergeQueues() {
        //Norah Aleyadah...442003193

        //Creating the first Queue
        LLQueue<Integer> Queue1 = new LLQueue<>();
        //Asking the user to enter a size for the first stack
        System.out.print("Please enter The first Data set size: ");
        int sizeQueue1 = input.nextInt();
        //Asking the user to enter the elements of the first set
        System.out.println("Please enter The first Data set elements:");
        for (int i = 0; i < sizeQueue1; i++) {
            int ele = input.nextInt();
            Queue1.Enqueue(ele);
        }
        //creating the Secound Queue
        LLQueue<Integer> Queue2 = new LLQueue<>();
        //Asking the user to enter a size for the Seconed Queue
        System.out.print("Please enter The Secoend Data set size: ");
        int sizeQueue2 = input.nextInt();
        //Asking the user to enter the elements of the Secoend set
        System.out.println("Please enter The Second Data set elements:");
        for (int i = 0; i < sizeQueue2; i++) {
            int ele = input.nextInt();
            Queue2.Enqueue(ele);
        }
        //Creating a Mergiend Queue
        LLQueue<Integer> Mergined = new LLQueue<>();
        //Transfar the elements from the first Queue to the Mergined Queue and return them to the origanl Queue
        for (int i = 0; i < sizeQueue1; i++) {
            int ele = Queue1.Dequeue();
            Mergined.Enqueue(ele);
            Queue1.Enqueue(ele);
        }
        //Transfar the elements from the Second Queue to the Mergined Queue and return them to the orignal Queue
        for (int i = 0; i < sizeQueue2; i++) {
            int ele = Queue2.Dequeue();
            Mergined.Enqueue(ele);
            Queue2.Enqueue(ele);
        }
        //Print original Queues
        System.out.println("The First givin Queue:");
        Queue1.print();

        System.out.println("The Seconed givin Queue:");
        Queue2.print();

        //Print the Mergiend Queue
        System.out.println("The Resultant Mergined Queue:");
        Mergined.print();
    }//end MergeQueues method

    
  public static void BinrayTrees() {
       // Nada Hamad Al-otaibi - 44220074
       
        /*In this method we will :
        1- creat tow BinrayTrees
        2- starting to build our trees (First_Tree and Second_Tree)
           by calling the( Build_Tree ) methods
        3- ptinting in order traversal for the(First_Tree and Second_Tree)
           ,("in order" method it's in ADT class) 
        4- asking the user which parent is required to be merged
        5- searching for the parent to check if it's has a child or not
        6- printing the merge tree and Resultant tree size
         */
 
/* 1 */ BinaryTree<Integer> First_Tree = new BinaryTree<>();
        BinaryTree<Integer> Second_Tree = new BinaryTree<>();
 
/* 2 */ Buildt_Tree(First_Tree);
        Buildt_Tree(Second_Tree);
 
/* 3 */ System.out.println("The First given Tree in in order Traversal");
        First_Tree.inOrder();
        System.out.println(" ");
        System.out.println("The Second given Tree in in order Traversal");
        Second_Tree.inOrder();
 
/* 4 */ System.out.println(" ");
        System.out.println("Enter the parent at which the merge is required: ");
        int parent = input.nextInt();
 
/* 5 */ TreeNode n = First_Tree.search(First_Tree.Root, parent, null);
        if (n != null) {
            if (n.left != null) {
                System.out.println("parent already has a left child ");
            } else {
                TreeNode child = Second_Tree.Root;
                n.left = child;
                child.parent = n;
                First_Tree.size += Second_Tree.size;
            }
        } else {
            System.out.println("parent does not exist");
        }
       
        
/* 6 */ System.out.println(" ");
        System.out.println("The Mergined Tree: ");
        First_Tree.inOrder();
        System.out.println(" ");
        System.out.println("The Resultant Mergined Tree's size: " + First_Tree.size);
    }
 
    public static void Buildt_Tree(BinaryTree<Integer> BTree) {
 
        /*In this method we will :
        1- asking the user to enter size and element for the binary tree
        2- insert the element in the array by using for loop
        3- set the tree root to zero ( As required in the project file )
        4- In a for loop :
          - we'll define values for (parent - left and right child indexes)
          - The counter(i) will be incremented every time by two
        5- Using if statement to store the correct position for each variable
        6- Using if statement to check whether the right child index < Array size
           to avoid any run time exceptions
         */ 
/* 1 */ System.out.print("Please enter The first Data set's size: ");
        int Size = input.nextInt();
        int[] TreeArray = new int[Size];
        System.out.println("Please enter The First Data set elements: ");
 
/* 2 */ for (int i = 0; i < Size; i++) {
            int ele = input.nextInt();
            TreeArray[i] = ele;
        }
 
/* 3 */ BTree.addRoot(TreeArray[0]);
 
/* 4 */ for (int i = 1; i < TreeArray.length; i = i+2) {
            int parent_Index = (i - 1) / 2;
            int left_Index = (parent_Index * 2) + 1;
            int right_Index = (parent_Index * 2) + 2;
 
 
/* 5 */ if (TreeArray[left_Index] != 0) {
 
            BTree.addLeft(TreeArray[left_Index], TreeArray[parent_Index]);
                }
 
/* 6 */ if (right_Index < TreeArray.length) {
          
/* 5 */ if (TreeArray[right_Index] != 0){
             
           BTree.addRight(TreeArray[right_Index], TreeArray[parent_Index]);  
                }
             }
        }
    }
}// end of Data_structure_project class
