import java.util.List;

class UnrelatedClassAndInterfaceBug {

    public void showBug(List<String> list, String str) {
        boolean result = list.equals(str); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        System.out.println("Result of comparison: " + result);

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("This is also unreachable code.");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example");
    }
}