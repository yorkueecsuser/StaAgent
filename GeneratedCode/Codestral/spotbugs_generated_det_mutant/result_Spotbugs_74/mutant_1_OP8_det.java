class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] wjkuwnll = {"apple", "banana", "cherry"};
        String rlnrywok = "apple";
        boolean xckhsspw = bug.showBug(wjkuwnll, rlnrywok);
        System.out.println("Result: " + xckhsspw);
    }
}