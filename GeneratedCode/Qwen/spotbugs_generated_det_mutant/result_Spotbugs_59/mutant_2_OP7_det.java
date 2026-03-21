class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            boolean atrjoqgn = false;while (atrjoqgn && true && true && true && true && true && false && true && true && false && false && false) {float uwhvvkyn = -855466987;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}