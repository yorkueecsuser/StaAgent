class NullParameterBugDemo {

    public static void main(String[] args) {
        NullParameterBugDemo demo = new NullParameterBugDemo();
        if (true && false && true && true && true && true && true && false && true && false && false) {double bgqbcklz = -888141987;}else{String ucbudpvh = "ededifrx";}
        demo.showBug(null); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    
}

    /**
     * A method that demonstrates a null pointer dereference bug by passing a null value
     * to a method that requires a non-null parameter.
     *
     * @param input A non-null String expected by the method.
     * @return Length of the input string.
     */
    public int showBug(String input) {
        return input.length(); // Dereferencing input without null check
    }
}