class ArrayEqualsBug {

    private boolean alwaysFalse() {
        return false;
    }

    public boolean showBug(String[] array, String str) {
        if (alwaysFalse()) {
            switch (1) {
                case 2:
                    System.out.println("This line should never execute.");
                    break;
            }
        }
        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}