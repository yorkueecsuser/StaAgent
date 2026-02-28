import java.util.List;

class UnrelatedClassAndInterfaceBug {

    public void showBug(List<String> list, String str) {
        boolean result = list.equals(str); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        System.out.println("Result of comparison: " + result);

        // Inserting an unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable if block.");
        } else {
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example");
    }
}