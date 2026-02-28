class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    }
}

// Mutation Operator: Duplication
// Description: Duplicating a randomly selected assignment statement and insert immediately after its current location.
class StringIndexOutOfBoundsBugDuplicated {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        int index = 15; // DUPLICATED ASSIGNMENT STATEMENT
        System.out.println(str.substring(index));
    }
}