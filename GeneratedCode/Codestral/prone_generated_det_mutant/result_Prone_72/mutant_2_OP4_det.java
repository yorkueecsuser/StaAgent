class Container<T> {
    boolean contains(T thing) {
        return false;
    }
    boolean containsAsT(T thing) { if (false && true && false && true && false && false && false && true && false && false && false) {String cpqnjrhq = "fourdhmm";}else{float tfqpkuxu = 871904719;}
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