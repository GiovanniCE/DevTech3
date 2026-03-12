import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    // Tests for get

    /**
     * @author grayson_replace_this
     * @see GetAtOutOfBoundsThrowsException
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new GetAtOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    /**
     * @author
     * @see
     */
    @Test
    public void testGetAtIndex() {
        fail("Not yet implemented");
    }

    // Tests for getFirst

    // Tests for getLast

    // Tests for isEmpty (2)

    /**
     * @author Giovanni Coronado-Esbona
     * @see IsEmptyAlwaysFalse
     */
    @Test
    public void testIsEmptyWhenCreated() {
        if (SHOULD_FAIL) list = new IsEmptyAlwaysFalse<>();
        
        assertTrue(list.isEmpty(), "A newly created list should be empty.");
    }

    /**
     * @author Giovanni Coronado-Esbona
     * @see IsEmptyAlwaysTrue
     */
    @Test
    public void testIsNotEmptyAfterAdd() {
        if (SHOULD_FAIL) list = new IsEmptyAlwaysTrue<>();
        
        list.addLast(1);
        assertFalse(list.isEmpty(), "List should not be empty after adding an element.");
    }

    // Tests for add

    /**
     * @author
     * @see
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {
        fail("Not yet implemented");
    }

    // Tests for addFirst

    /**
     * @author
     * @see
     */
    @Test
    public void testAddFirstAddsElement() {
        fail("Not yet implemented");
    }

    // Tests for addLast

    /**
     * @author
     * @see
     */
    @Test
    public void testAddLastAddsElement() {
        fail("Not yet implemented");
    }

    // Tests for remove

    /**
     * @author
     * @see
     */
    @Test
    public void testRemoveAtIndex() {
        fail("Not yet implemented");
    }

    // Tests for removeFirst

    // Tests for removeLast

    // Tests for size
    /**
     * @author Giovanni Coronado-Esbona
     * @see SizeReturnsNonZeroWhenEmpty
     */
    @Test
    public void testSizeWhenCreatedIsZero() {
        if (SHOULD_FAIL) list = new SizeReturnsNonZeroWhenEmpty<>();
        
        assertEquals(0, list.size(), "A newly created list should have size 0.");
    }

    /**
     * @author Giovanni Coronado-Esbona
     * @see SizeFailsToIncrement
     */
    @Test
    public void testSizeIncrementsOnAdd() {
        if (SHOULD_FAIL) list = new SizeFailsToIncrement<>();
        
        list.addLast(10);
        assertEquals(1, list.size(), "Size should be 1 after adding one element.");
        
        list.addLast(20);
        assertEquals(2, list.size(), "Size should be 2 after adding two elements.");
    }


    // Tests for set
    /**
     * @author Giovanni Coronado-Esbona
     * @see SetDoesNotUpdateElement
     */
    @Test
    public void testSetAtIndexValid() {
        if (SHOULD_FAIL) list = new SetDoesNotUpdateElement<>();
        
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        Integer oldValue = list.set(1, 25);
        assertEquals(20, oldValue, "set() should return the old value.");
        
        // The list should now contain the new element at the specified index
        assertEquals(25, list.get(1), "The element at the specified index should be updated to the new value.");
    }

    /**
     * @author Giovanni Coronado-Esbona
     * @see SetAtOutOfBoundsDoesNotThrow
     */
    @Test
    public void testSetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new SetAtOutOfBoundsDoesNotThrow<>();
        
        list.addLast(100);
        
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, 99), 
                "Setting an element at a negative index should throw IndexOutOfBoundsException.");
        
        // Test index equal to size (out of bounds for 0-indexed list)
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(1, 99), 
                "Setting an element at an index equal to size should throw IndexOutOfBoundsException.");
    }
}