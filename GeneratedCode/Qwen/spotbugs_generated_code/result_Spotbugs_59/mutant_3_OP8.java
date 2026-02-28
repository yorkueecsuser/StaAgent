class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }

    // Mutated code starts here
    public String mutatedShowBug(String a) {
        String b = null;
        if (a == null) {
            b = a.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return b;
    }

    public static void mutatedMain(String[] c) {
        NullPointerExample d = new NullPointerExample();
        System.out.println(d.mutatedShowBug(null));
    }
}