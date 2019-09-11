public class Main {
   public static void main(String[] args) {

      int[] arr = {76,43,21, -4, 789, -71, 49};

      int[] sortedArr = sort(arr);

      for(int i: sortedArr)
         System.out.print(i + " ");

   }

   private static int[] sort(int[] arr) {
      int minValue;
      int minIndex;
      int temp;

      for(int i=0; i<arr.length; i++) {
         minValue = arr[i];
         minIndex = i;

         for(int j=i; j<arr.length; j++) {
            if(arr[j] < minValue) {
               minValue = arr[j];
               minIndex = j;
            }
         }

         if(minValue < arr[i]) {
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
         }
      }

      return arr;
   }

}
