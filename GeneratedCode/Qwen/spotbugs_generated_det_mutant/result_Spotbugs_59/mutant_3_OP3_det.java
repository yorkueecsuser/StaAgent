class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            if (true && true && true && false && true && true && false && true && false && false && false) {int pqjxbagm = 317071901;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}