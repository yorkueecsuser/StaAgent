class NullPointerExample {

    public String showBug(String input) {
        String msaxwssz = null;
        if (input == null) {
            msaxwssz = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return msaxwssz;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}