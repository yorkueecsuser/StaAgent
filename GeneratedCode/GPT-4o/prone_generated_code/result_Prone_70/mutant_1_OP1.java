class ProtoComparisonExample {

    // Dummy class to simulate protocol buffer behavior
    public static class MyProto {
        // Simulate a field with a default value
        public String getField() {
            return ""; // Default value, never null
        }

        // Simulate a repeated field list
        public java.util.List<String> getRepeatedFieldList() {
            return new java.util.ArrayList<>(); // Default list, never null
        }

        // Simulate a repeated field access
        public String getRepeatedField(int index) {
            return ""; // Default value, never null
        }
    }

    public void showBug(MyProto proto) {
        // Dead Store: Inserting an unused primitive type variable
        int abcdefgh = 12345678;

        if (proto.getField() == null) { // BUG: ImpossibleNullComparison
            System.out.println("Field is null");
        }

        if (proto.getRepeatedFieldList() != null) { // BUG: ImpossibleNullComparison
            System.out.println("RepeatedFieldList is not null");
        }

        if (proto.getRepeatedField(1) != null) { // BUG: ImpossibleNullComparison
            System.out.println("RepeatedField at index 1 is not null");
        }
    }

    public static void main(String[] args) {
        ProtoComparisonExample example = new ProtoComparisonExample();
        MyProto proto = new MyProto();
        example.showBug(proto);
    }
}