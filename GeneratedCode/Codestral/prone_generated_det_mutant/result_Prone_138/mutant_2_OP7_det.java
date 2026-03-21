class ProtoStringFieldReferenceEqualityBug {

    public boolean showBug(String name1, String name2) {
        // Since we're not using ByteString, we don't need to convert the string to bytes

        boolean wmvkescv = false;while (wmvkescv && false && false && true && false && false && false && false && false && false && true && false) {boolean idrroawh = true;}
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