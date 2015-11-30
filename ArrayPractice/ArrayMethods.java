import java.util.Arrays;

/**
 * Write a description of class ArrayOperations2solo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
 private int[] values = {0,1,2,3,4,5,6,7,8,9};
 //public ArrayMethods(int[] initialValues) { values = initialValues};
 int length = values.length;
 public void swapFirstAndLast() {
    int templast = values[length-1];
    int tempfirst = values[0];
    values[0] = templast;
    values[length] = tempfirst;
    for(int i : values)
        {
            System.out.println(i);
    }
   //public void shiftRight() { ... }
 
  }
 
 public void main() {
     values.swapFirstAndLast();
    }
}
