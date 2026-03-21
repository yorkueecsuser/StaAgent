class ArrayHashToStringBug {
public String showBug(int [] array){
    String hashResult = String.valueOf(array.hashCode());
    hashResult = String.valueOf(array.hashCode());
    String toStringResult = array.toString();
    return "Hash Code: " + hashResult + ", toString: " + toStringResult;
}

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}