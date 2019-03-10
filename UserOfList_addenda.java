/*
Test methods newly-added to List_inArraySlots.

Start by marking the end the code that has been tested.
I am reluctant to delete working code (since working
code is rare in my life, and I might have further use
for these tests. But I'd like make it easy to find new tests,
for myself and other readers. I'd use a comment like...
*/

//Addenda file taken from skeletonsHolmes.

        // --------- end of "code that worked in v0" ---------

        // test accessor
        System.out.println( "sample elements from list:");
        for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }

//-------------------------------------------
     //Local method and invocations of it to...
        // test set
        setTest(  8);
        setTest( 16);
        System.out.println();

    /**
      Test the set() method, reporting and
      changing the value at index @modifyAt.
     */
    private static void setTest( int modifyAt
                              ) {
        System.out.println(
            "changed element " + modifyAt + " from "
          + list.set( modifyAt, modifyAt + 1000) + " to "
          + list.get( modifyAt)
          );
     }


//-------------------------------------------
     //Local method and invocations of it to...

        // test adding at a specified position
        addAtTest( 0, 29); // beginning of the list

        // end of the list using the new add method
        addAtTest( list.size(), 17);

        addAtTest( 2, 19); // middle of a small list

        // force an expansion
        addAtTest( 2, 23);
        addAtTest( 2, 23);
        addAtTest( 2, 23);


    /**
      Test the 2-argument add( index, value) method.
     */
    private static void addAtTest( int addAt
                                 , int value
                                 ) {
        list.add( addAt, value);
        System.out.println(
            "insert " + value
          + " at position " + addAt
          + ", resulting in "  + list.size() + " elements:"
          + System.lineSeparator()
          + list
          + System.lineSeparator()
        );
    }



//-------------------------------------------
        // test removing an element
        System.out.println("removing value " + list.remove( 6)
                          + ", leaving " + list.size() + " elements:");
        System.out.println( list);
        System.out.println(
            "expecting:" + System.lineSeparator()
          + "[29,0,23,23,23,19, NO -1 HERE! -2,-3...]");
