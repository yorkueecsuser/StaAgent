class VarargsBugExample {

    // Method that expects a variable number of Object arguments
    public void printObjects(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    // Method to demonstrate the bug
public String showBug(int [] intArray){
    StringBuilder result = new StringBuilder();
    result = new StringBuilder();
    printObjects(intArray);
    result.append("Passed array as a single object.");
    return result.toString();
}

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        int[] myIntArray = {1, 2, 3};
        example.showBug(myIntArray);
    }
}