import java.util.Arrays;

public class ColorSort {

   enum Color {red, green, blue}

   public static void main (String[] param) {
      Color[] balling = {Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red,
              Color.blue,Color.green, Color.red, Color.red, Color.blue, Color.red};
      System.out.println("Before: " + Arrays.toString(balling));
      long startTime = System.nanoTime();
      reorder(balling);
      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println("Time: " + duration);
      System.out.println("After: " + Arrays.toString(balling));
   }

   public static void reorder (Color[] balls) {
      // Bubble sort
      // boolean needToSwap;
      for (int i = 0; i < balls.length - 1; i++) {
         // needToSwap = false;
         for (int j = 0; j < balls.length - i - 1; j++) {
            // comparing strings
            if (balls[j].compareTo(balls[j + 1]) > 0) {
               Color temp = balls[j];
               balls[j] = balls[j + 1];
               balls[j + 1] = temp;
               // needToSwap = true;
            }
         }
         // if (!needToSwap) {
         //    break;
         // }
      }
   }
   //After: [red, red, green, blue, blue, red]
   //        for (i = 0; i < balls.length - 1; i++) {
   //            swapped = false;
   //            for (j = 0; j < balls.length - i - 1; j++) {
   //                if (arr[j] > arr[j + 1]) {
   //                    temp = arr[j];
   //                    arr[j] = arr[j + 1];
   //                    arr[j + 1] = temp;
   //                    swapped = true;
   //                }
   //            }
   //            if (swapped == false)
   //                break;
   //        }
}
