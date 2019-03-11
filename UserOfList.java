/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        /* Populate the list with elements, but with a small enough
           number that we expect no invocation of expand().
        */
        int elemIndex;
        for( elemIndex = 0; elemIndex < 5; elemIndex++ ) {
            list.add( -elemIndex); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Add enough elements that expansion is expected
        for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( -elemIndex);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Trust no one.
        for( ; elemIndex < 35; elemIndex++ )
            list.add( -elemIndex);
        System.out.println("after second expansion: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        //obtaining an element given an index
        System.out.println( "sample elements from list:");
        for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }

        //Local method and invocations of it to...

           // test adding at a specified position
           // add(int index, int value)
          System.lineSeparator();
           //System.out.println("Before adding");
           //System.out.println(list);
          list.add( 2, 29); // beginning of the list
           //println commands are for debugging
           //System.out.println("there are  " + list.size() + " elements in this list.");
           //System.out.println("The last element of the list should be "
            //                + list.returnElement(list.size() -1)
            //                + System.lineSeparator());
          System.out.println("after add:");
          System.out.println(list + System.lineSeparator());
           //System.out.println("a");



           // end of the list using the new add method
          list.add( list.size(), 17);
          System.out.println("End of the list: ");
          System.out.println(list + System.lineSeparator());

           // force an expansion
          list.add( 2, 23);
          list.add( 2, 23);
          list.add( 2, 23);
        System.out.println("Expansion forced");
        System.out.println(list + System.lineSeparator());

        System.out.println("List currently has " + list.size() + " elements.");
        System.out.println("removing value " + list.remove( 6)
                          + ", leaving " + list.size() + " elements:");
                          System.out.println( list);
                          System.out.println(
                              "expecting:" + System.lineSeparator()
                            + "[... 29,0,23,23,23,29, NO -2 HERE! -3,-4 ...]");
        //I inspected the earlier code and saw that the last println given by
        //the addenda does not match up with earlier code, so I edited it.
    }  // end of main()
}
