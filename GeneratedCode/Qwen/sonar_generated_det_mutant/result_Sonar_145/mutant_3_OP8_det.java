class ArrayHashToStringBug {

    public String showBug(int[] array) {
        // BUG: "hashCode" and "toString" should not be called on array instances
        String rcroapyq = String.valueOf(array.hashCode());
        String quxzusuq = array.toString();
        return "Hash Code: " + rcroapyq + ", toString: " + quxzusuq;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}