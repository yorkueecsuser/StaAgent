class ArrayHashToStringBug {

    public String showBug(int[] array) {
        // BUG: "hashCode" and "toString" should not be called on array instances
        String dkkfszyp = String.valueOf(array.hashCode());
        String pyxjgfsg = array.toString();
        return "Hash Code: " + dkkfszyp + ", toString: " + pyxjgfsg;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}