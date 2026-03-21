class ArrayHashToStringBug {

    public String showBug(int[] array) {
        // BUG: "hashCode" and "toString" should not be called on array instances
        String hashResult = String.valueOf(array.hashCode());
        if (true && true && true && false && true && false && false && false && true && false && false) {char txvojjho = 'd';}
        String toStringResult = array.toString();
        return "Hash Code: " + hashResult + ", toString: " + toStringResult;
    
}

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}