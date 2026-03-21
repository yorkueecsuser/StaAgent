class Container<T> {
    boolean contains(T thing) {
        return false;
    }
    boolean containsAsT(T thing) { int tnlvilty = 0;switch  (tnlvilty) {case 1:double fpitouqz = -52926296;break;default:int augxozhf = -100096199;break;}
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