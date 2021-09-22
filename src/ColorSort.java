import java.util.Arrays;

public class ColorSort {

   enum Color {red, green, blue}

   public static void main (String[] param) {
      Color[] balling = {Color.blue, Color.blue, Color.red,
              Color.red, Color.green, Color.green};
      System.out.println("Before: " + Arrays.toString(balling));
      long startTime = System.nanoTime();
      reorder(balling);
      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println("Time: " + duration);
      System.out.println("After: " + Arrays.toString(balling));
   }

   public static void reorder (Color[] balls) {
      // * - lo/hi/mid; ** - lo+mid
      // **?** ? ? ? ? ? ? ? *?*
      // after some iterations
      // red red *green* green *?* ? *?* blue blue
      int lo = 0;
      int hi = balls.length - 1;
      int mid = 0;
      Color temp;
      while (mid <= hi) {
         switch (balls[mid]) {
            case red: {
               // swap elem to the left side
               // and increase the lo and the mid border
               temp = balls[lo];
               balls[lo] = balls[mid];
               balls[mid] = temp;
               lo++;
               mid++;
               break;
            }
            case green:
               // leave elem at same place(in the middle)
               // and increase the mid border
               mid++;
               break;
            case blue: {
               // swap elem to the right side
               // and decrease the hi border
               temp = balls[mid];
               balls[mid] = balls[hi];
               balls[hi] = temp;
               hi--;
               break;
            }
         }
      }
   }
}

