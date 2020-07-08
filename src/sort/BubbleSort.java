package sort;

import java.util.Arrays;

/**
 * A class whose purpose is to take an array of numbers and sort them from smallest to largest
 */

public class BubbleSort {

    public BubbleSort() {

    }
    
    //implement the bubbleSorting algorithm in this method
    public int[] bubbleSort(int[] array) {
    
    int[] bubbleArray = new int[array.length];
    for(int i=0; i<(bubbleArray.length); i++){
            int bubble1 = array[i];
            bubbleArray[i]= bubble1;      
    }
  
    boolean stillGoing = true;
    int times = 0;
    
    while(stillGoing){
        int going = 0;
        
        for(int i=0; i<(bubbleArray.length-1); i++){
            int bubble1 = bubbleArray[i];
            int bubble2 = bubbleArray[i+1];
          
            if(bubble1> bubble2){
                
                bubbleArray[i]=bubble2;
                bubbleArray[i+1]= bubble1;
                
                going++;
                times++;
            }  
        }
        
        if(going==0){
            stillGoing = false;
        }
    }
    
    //if the array was already in order, let the user know
    if(times == 0){
            System.out.println("Your array was already in order.");
        }
    
    return bubbleArray;
    }
}
