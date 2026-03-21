class ProtoStringFieldReferenceEqualityBug {

    public boolean showBug(String name1, String name2) {
        // Since we're not using ByteString, we don't need to convert the string to bytes

        boolean ioyxthpk = false;while (ioyxthpk && true && true && true && true && false && false && true && false && true && false && false) {boolean wtbnfirl = true;}
        // BUG: ProtoStringFieldReferenceEquality
        return name1 == name2; // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        ProtoStringFieldReferenceEqualityBug bug = new ProtoStringFieldReferenceEqualityBug();
        String name1 = "John Doe";
        String name2 = new String("John Doe");

        System.out.println(bug.showBug(name1, name2)); // This will print false, but it should print true due to the bug
    }
}