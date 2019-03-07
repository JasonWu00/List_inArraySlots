/**
  Implement a list of integer elements, including
  both data and operations.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_inArraySlots {

    // declare fields here
    List<Integer> arrayList;
    int occupiedSpace = 0;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        arrayList = new ArrayList<Integer>(1);
    }

    public static void test() {
        List<Integer> test1 = new ArrayList<Integer>(2);
        test1.add(1);
        test1.add(2);
        System.out.println(test1);
        System.out.println("Expecting the number 1");
    }

    /**
      @return the number of elements in this list
     */
    public int size() {
        occupiedSpace = 0;
        for(int ticker = 0; ticker < arrayList.size(); ticker++) {
            if (arrayList.get(ticker) != null)
                occupiedSpace += 1;
        }
        return occupiedSpace;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */

    public String toString() {
        String output = "[";
          for(int ticker = 0; ticker < arrayList.size(); ticker++) {
              if (arrayList.size() == 0)
                  output = "This list is empty.";
              output += arrayList.get(ticker) + ",";
        }
        return output + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( int value) {
        arrayList.add(value);
        return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
    private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
    }
}
