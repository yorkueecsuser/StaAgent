class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] mamajeit = {"apple", "banana", "cherry"};
        String gkhroxqk = "apple";
        boolean nmddorxc = bug.showBug(mamajeit, gkhroxqk);
        System.out.println("Result: " + nmddorxc);
    }
}