class CastBug {
    public Object displayBug(Object inputObj) {
        if (inputObj instanceof String) {
            return (Integer) inputObj; // Cast operations should not trigger a ClassCastException
        }
        return inputObj;
    }

    // Added a unique method for demonstration of the mutation
    public void uniqueMethod() {
        System.out.println("This is a unique method added to demonstrate the mutation.");
    }
}