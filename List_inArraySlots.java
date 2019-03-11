/**
  Implement a list of integer elements, including
  both data and operations.

  Version 0 code from solutionsHolmes.
  Version 1 code from Addenda file from skeletonsHolmes.
 */

public class List_inArraySlots {

    private int[] elements;     // container for the elements of the list
    private int filledElements; // the number of elements in this list

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        elements = new int[ INITIAL_CAPACITY];
        // filledElements has been initialized to the desired value, 0
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String result = "[";
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            result += elements[ elemIndex] + ",";
        return result + "]";
    }

    public int returnElement(int index) {
      return elements[index];
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         // expand if necessary
         if( filledElements == elements.length) expand();

         elements[ filledElements] = value;
         filledElements++;
         // idiomatic version: elements[ filledElements++] = value;
        return true;
}


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
        int[] bigger = new int[ elements.length * 2];
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            bigger[ elemIndex] = elements[ elemIndex];
        elements = bigger;
     }

     /**
       accessor
       @return element @index from this list
       precondition: @index is within the bounds of the array.
           (Having warned the user about this precondition,
            you should NOT complicate your code to check
            whether user violated the condition.)
      */
     public int get( int index ) {
       return elements[index];
     }


     /**
       Set value at @index to @newValue

       @return old value at @index
       @precondition: @index is within the bounds of this list.
      */
     public int set( int index, int newValue ) {
       elements[index] = newValue;
       return -1;
     }


     /**
       Insert @value at position @index in this list.

       Shift the element currently at that position (if any)
       and any subsequent elements to the right
       (that is, increase the index associated with each).
      */
      public void add( int index, int value) {
        int[] modified = new int[elements.length + 1];
        for(int elemIndex = 0; elemIndex - 1 <= filledElements ; elemIndex++) {
          //loop to fill in new ArrayList with new value at index given
          if (filledElements == elements.length) expand();
          if (elemIndex < index) //when the index is not reached yet
            modified[elemIndex] = elements[elemIndex];
          if (elemIndex == index) { //when index is reached
            modified[elemIndex] = value;
          }
          if (elemIndex > index)//after index reached
            modified[elemIndex] = elements[elemIndex-1];
            //shifts the index over.
        }
        //printlines are for debugging
        //System.out.println("Last element of original array is " + elements[filledElements -1]);
        //System.out.println("Last element of new array is " + modified[filledElements]);
        filledElements ++;
        elements = modified;
        //System.out.println("After elements = modified, last element is: " + elements[filledElements - 1]);

      }


     /**
       Remove the element at position @index in this list.

       Shift any subsequent elements to the left (that is,
       decrease the index associated with each).

       @return the value that was removed from the list
      */
      public int remove( int index) {
        //The idea is similar with the add(index, value) method
        //except we skip a number instead of add a number.
        int removed = elements[index];
        int[] modified = new int[elements.length - 1];
        for(int elemIndex = 0; elemIndex - 1 <= filledElements ; elemIndex++) {
          if (elemIndex < index)
            modified[elemIndex] = elements[elemIndex];
          if (elemIndex >= index)
            modified[elemIndex] = elements[elemIndex+1];

        }
        filledElements --;
        elements = modified;
        return removed;
      }
}
