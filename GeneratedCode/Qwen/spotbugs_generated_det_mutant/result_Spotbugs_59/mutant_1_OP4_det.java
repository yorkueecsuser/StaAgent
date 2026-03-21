class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            if (false && true && false && false && false && false && true && false && false && true && false) {byte sqgslhyb = -128;}else{int konhjykh = -493436839;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}