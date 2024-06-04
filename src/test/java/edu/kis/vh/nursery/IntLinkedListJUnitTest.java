package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntLinkedListJUnitTest {

    private IntLinkedList list;

    @Before
    public void setUp() {
        list = new IntLinkedList();
    }

    @Test
    public void testPushAndTop() {
        assertTrue(list.isEmpty());
        list.push(5);
        assertFalse(list.isEmpty());
        assertEquals(5, list.top());
    }

    @Test
    public void testPushAndPop() {
        list.push(5);
        list.push(10);
        assertEquals(10, list.pop());
        assertEquals(5, list.pop());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.push(5);
        assertFalse(list.isEmpty());
        list.pop();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(list.isFull());
    }

    @Test
    public void testTopOnEmptyList() {
        assertEquals(-1, list.top());
    }

    @Test
    public void testPopOnEmptyList() {
        assertEquals(-1, list.pop());
    }

    @Test
    public void testMultiplePushAndPop() {
        list.push(1);
        list.push(2);
        list.push(3);
        assertEquals(3, list.pop());
        assertEquals(2, list.pop());
        assertEquals(1, list.pop());
        assertTrue(list.isEmpty());
    }
}
