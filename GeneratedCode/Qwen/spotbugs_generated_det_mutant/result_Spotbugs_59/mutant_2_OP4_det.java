class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            if (true && false && false && false && false && true && true && true && false && false && false) {String vyextjyb = "gzxpxwkj";}else{int wtevysjk = -717806267;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}