// Mutated Java code demonstrating the same bug with a renamed variable

class BuggyCodeMutant {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Storing a Double into a Number array
        numberArray[1] = new Integer(5); // ArrayIndexOutOfBoundsException will be thrown at runtime

        // Added mutant code
        Integer[] integerArray = new Integer[1];
        integerArray[0] = new Double(3.14); // Renamed variable and still storing a Double into an Integer array
    }
}