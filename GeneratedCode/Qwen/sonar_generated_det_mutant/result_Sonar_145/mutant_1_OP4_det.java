class ArrayHashToStringBug {

    public String showBug(int[] array) {
        // BUG: "hashCode" and "toString" should not be called on array instances
        String hashResult = String.valueOf(array.hashCode());
        if (true && false && false && true && false && false && false && true && true && false && false) {byte giwbgcbd = 103;}else{boolean ydjlvihb = true;}
        String toStringResult = array.toString();
        return "Hash Code: " + hashResult + ", toString: " + toStringResult;
    
}

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}