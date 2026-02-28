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
        if (proto.getField() == null) { // BUG: ImpossibleNullComparison
            System.out.println("Field is null");
        }

        if (proto.getRepeatedFieldList() != null) { // BUG: ImpossibleNullComparison
            System.out.println("RepeatedFieldList is not null");
        }

        if (proto.getRepeatedField(1) != null) { // BUG: ImpossibleNullComparison
            System.out.println("RepeatedField at index 1 is not null");
        }

        // Mutation: Adding unreachable if-else branch
        boolean shouldRun = getCondition(); // A method to fetch a dynamic condition
        if (shouldRun) {
            System.out.println("This block is reachable based on runtime condition.");
        } else {
            // Unreachable branch due to the condition always being false
            System.out.println("This block is unreachable at runtime.");
        }
    }

    // Method to return false to ensure the else block is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ProtoComparisonExample example = new ProtoComparisonExample();
        MyProto proto = new MyProto();
        example.showBug(proto);
    }
}