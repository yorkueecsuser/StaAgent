class NullPointerExample {

    public String showBug(String input) {
        String qcvodfbq = null;
        if (input == null) {
            qcvodfbq = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return qcvodfbq;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}