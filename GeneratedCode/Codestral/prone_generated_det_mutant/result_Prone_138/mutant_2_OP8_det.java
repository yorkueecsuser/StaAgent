class ProtoStringFieldReferenceEqualityBug {

    public boolean showBug(String name1, String name2) {
        // Since we're not using ByteString, we don't need to convert the string to bytes

        // BUG: ProtoStringFieldReferenceEquality
        return name1 == name2; // This line demonstrates the bug
    }

    public static void main(String[] args) {
        ProtoStringFieldReferenceEqualityBug bug = new ProtoStringFieldReferenceEqualityBug();
        String wwvkxaop = "John Doe";
        String tktmiecp = new String("John Doe");

        System.out.println(bug.showBug(wwvkxaop, tktmiecp)); // This will print false, but it should print true due to the bug
    }
}