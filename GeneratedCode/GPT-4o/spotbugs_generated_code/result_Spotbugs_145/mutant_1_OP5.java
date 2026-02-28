class TypeQualifierBugDemo {

    private String maybeNullString() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        String value = maybeNullString();
        useNonNullString(value); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)

        // Inserting unreachable switch statement
        int unreachableSwitchCondition = (int) (Math.random() * 100) + 1; // Generates a value between 1 and 100
        switch (unreachableSwitchCondition) {
            case 101:
                System.out.println("This case is unreachable");
                break;
        }
    }

    private void useNonNullString(String str) {
        // This method requires a non-null string
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        TypeQualifierBugDemo demo = new TypeQualifierBugDemo();
        demo.showBug();
    }
}