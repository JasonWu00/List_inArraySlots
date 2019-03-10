# augment `List_inArraySlots` with remaining methods

Start with the code in solutionsHolmes/List_inArraySlots_v0

Incrementally add the methods whose headers are shown in this repo's 
List_inArraySlots_addenda.java:
* get
* set
* add in the middle of the list
* remove

UserOfList_addenda.java contains code snippets that test the
new methods:
* straightforward tests for `get` and `remove`
* Tests for `set` invoke a method called `setTest`.
Code for `setTest`is included in UserOfList_addenda.java. 
Copy it to your `UserOfList` class.
* Similarly, tests for the 2-argument `add`-in-the-middle method
invoke a `addAtTest` method. Copy the code for `addAtTest` 
from UserOfList_addenda.java to your `UserOfList` class.

This skeleton has benefited enormously from Amy Lei's
implementing the parts early, finding my errors, fixing them,
and reporting them.
My skeletons will always have bugs, but this one
has fewer bugs than it did before Amy crushed them.
