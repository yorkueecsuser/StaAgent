@Test
public void testContains() {
    HashSet<String> set = new HashSet<>();
    set.add("hello");
    set.add("world");
    assertTrue(set.contains("hello"));
    assertTrue(set.contains("world"));
    assertFalse(set.contains("random"));
}