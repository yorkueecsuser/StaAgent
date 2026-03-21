public void showBug() {
    // Added unreachable for loop
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
        System.out.println("This line should never execute");
    }

    Set<UnhashableClassExample> set = new HashSet<>();
    UnhashableClassExample obj1 = new UnhashableClassExample("Object1");
    UnhashableClassExample obj2 = new UnhashableClassExample("Object1");
    set.add(obj1);
    set.add(obj2);
    System.out.println("Size of the set: " + set.size());  // Expected size: 1, Actual size: 2
}