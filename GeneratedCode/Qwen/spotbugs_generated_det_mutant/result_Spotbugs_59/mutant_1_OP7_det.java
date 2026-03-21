class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            boolean luvucksf = false;while (luvucksf && true && false && true && true && false && true && false && true && false && false && false) {boolean ksrhtfel = false;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}