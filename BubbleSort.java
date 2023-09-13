/* Implementing Buble Sort */
import java.util.ArrayList;

class BubbleSort {

      public void BubbleSortMethod(ArrayList<Integer> inputArray)
      {
            System.out.println("Before Sorting");
            System.out.println(inputArray);

            int size = inputArray.size();
            for(int i =0; i<size; i++) { 
               for(int j = i; j<size; j++) { 
                     if( inputArray.get(i) > inputArray.get(j) )
                     {
                         int swap = inputArray.get(i);
                         inputArray.set(i,inputArray.get(j));
                         inputArray.set(j,swap);
                     }
                 }
            }
            System.out.println("After Sorting");
            System.out.println(inputArray);
      }

      public static void main(String[] args)
      {
             BubbleSort bs = new BubbleSort();
             ArrayList<Integer> inpArr = new ArrayList<Integer>(); 
             inpArr.add(10);
             inpArr.add(6);
             inpArr.add(8);
             inpArr.add(4);
             inpArr.add(3);
             inpArr.add(9);
             bs.BubbleSortMethod(inpArr);
      }
}
