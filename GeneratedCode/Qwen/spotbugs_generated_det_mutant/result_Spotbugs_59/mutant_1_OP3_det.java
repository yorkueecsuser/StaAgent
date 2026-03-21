class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            if (true && true && false && true && true && true && true && false && false && true && false) {boolean kcqnubst = false;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}