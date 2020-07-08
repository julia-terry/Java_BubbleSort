package sort;

/**
 * Testing BubbleSort.java
 */
public class BubbleSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define and initialize an integer array named testArray
        int[] testArray = {1, 2, 6, 4, 10, 9};

        //create a bubble sort object
        BubbleSort myBubbleSort = new BubbleSort();

        //use this object to sort array and overwrite it
        int[] bubbleSortedArray = myBubbleSort.bubbleSort(testArray);

        //print out sorted array
        for(int i=0; i<(bubbleSortedArray.length); i++){
            System.out.print(bubbleSortedArray[i] + ", ");
    }
        
    }

}
