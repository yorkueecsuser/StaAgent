public Object[] showBug() {
    List<String> foos = new ArrayList<>();
    foos.add("foo1");
    foos.add("foo2");
    foos.add("foo3");

    // Original Code
    String[] fooArray = foos.toArray(new String[0]);

    // Mutated Code
    String[] fooArrayMut = foos.toArray(new String[1]);

    return fooArray;
}