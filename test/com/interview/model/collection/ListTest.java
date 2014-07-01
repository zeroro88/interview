package com.interview.model.collection;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-7-1
 * Time: 下午10:16
 */
public class ListTest extends TestCase {
    List<String> list;

    @Override
    public void setUp() throws Exception {
        list = new ArrayList<>();//new LinkedList<>();
    }

    public void testAdd() throws Exception {
        assertEquals(0, list.size());
        list.add("a");
        assertEquals(1, list.size());
        list.add("b");
        assertEquals(2, list.size());
        list.add("a");
        assertEquals(3, list.size());
    }

    public void testGet() throws Exception {
        list.add("a");
        list.add("b");
        list.add("a");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("a", list.get(2));
    }

    public void testIndexOf() throws Exception {
        list.add("a");
        list.add("b");
        list.add("a");
        assertEquals(0, list.indexOf("a"));
        assertEquals(1, list.indexOf("b"));
        assertEquals(-1, list.indexOf("f"));
    }

    public void testAddByIndex() throws Exception {
        list.add("a");
        list.add("b");
        list.add("a");
        assertEquals("b", list.get(1));
        list.add(1, "e");
        assertEquals("e", list.get(1));
    }

    public void testContains() throws Exception {
        list.add("a");
        list.add("b");
        list.add("a");
        assertEquals(true, list.contains("b"));
        assertEquals(false, list.contains("f"));
    }

    public void testIsEmpty() throws Exception {
        assertEquals(true, list.isEmpty());
        list.add("a");
        assertEquals(false, list.isEmpty());
    }

    public void testRemove() throws Exception{
        list.add("a");
        list.add("b");
        list.add("a");
        assertEquals(3, list.size());
        assertEquals("b", list.remove(1));
        assertEquals(2, list.size());
        assertEquals("a", list.get(1));
        list.remove(0);
        list.remove(0);
        assertEquals(true, list.isEmpty());
    }

    public void testRemoveByElement() throws Exception{
        list.add("a");
        list.add("b");
        list.add("a");
        assertEquals(3, list.size());
        assertEquals("b", list.remove("b"));
        assertEquals(2, list.size());
        assertEquals("a", list.get(1));
        list.remove(0);
        list.remove(0);
        assertEquals(true, list.isEmpty());
    }
}
