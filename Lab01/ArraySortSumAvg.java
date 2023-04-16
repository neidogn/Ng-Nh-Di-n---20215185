import java.util.Arrays;

public class ArraySortSumAvg {
   public static void main(String[] args) {
      
      int[] numbers = {5, 3, 8, 2, 1};
      
      // Sort ascending
      Arrays.sort(numbers);
      //sum, avr
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      double average = (double) sum / numbers.length;
      
      System.out.println("Sorted array: " + Arrays.toString(numbers));
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
   }
}
