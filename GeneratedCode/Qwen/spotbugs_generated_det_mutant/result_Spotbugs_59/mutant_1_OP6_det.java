class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            for  (int pjwjiqaa = 0; pjwjiqaa < 0; pjwjiqaa++) {boolean uradqrev = true;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}