class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
        renamedFunction(obj); // Added a new call to a differently named function
    }

    public static Integer showBug(Object obj) {
        return (Integer) obj; // This will always throw a ClassCastException
    }

    // Newly added function with a renamed parameter and body
    public static Integer renamedFunction(Object var) {
        return (Integer) var; // This will also always throw a ClassCastException
    }
}