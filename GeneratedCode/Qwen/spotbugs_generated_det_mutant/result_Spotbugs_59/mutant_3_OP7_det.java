class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            boolean ctyyvntz = false;while (ctyyvntz && false && true && false && false && false && true && false && false && false && true && false) {double zcpnejjr = -631265759;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}