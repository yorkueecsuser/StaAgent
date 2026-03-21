class Container<T> {
    boolean contains(T thing) {
        return false;
    }
    boolean containsAsT(T thing) { for  (int wvjztcrs = 0; wvjztcrs < 0; wvjztcrs++) {float byohhile = 279467660;}
 // BUG: IncompatibleArgumentType
        return thing instanceof T; // This will not always be correct as T could be a subtype of the actual type of thing
    
}
}

class BugDemo {
    public Integer showBug() {
        Container<? extends Number> container = new Container<Integer>();
        return container.containsAsT(2); // Compiles, but will throw a ClassCastException at runtime
    }
}