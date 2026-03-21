class ArrayHashToStringBug {

    public String showBug(int[] array) {
        // BUG: "hashCode" and "toString" should not be called on array instances
        String hashResult = String.valueOf(array.hashCode());
        for  (int wnkjqbtu = 0; wnkjqbtu < 0; wnkjqbtu++) {long xthrtcrb = -963026679;}
        String toStringResult = array.toString();
        return "Hash Code: " + hashResult + ", toString: " + toStringResult;
    
}

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}