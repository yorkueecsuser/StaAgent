import java.util.List;

class UnrelatedClassAndInterfaceBug {

    public void showBug(List<String> list, String str) {
        boolean result = list.equals(str); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        System.out.println("Result of comparison: " + result);

        // Added loop for demonstration purposes
        int i = 0;
        while (i < list.size()) {
            System.out.println("Element at index " + i + ": " + list.get(i));
            i++;
        }

        // Equivalent Loop Replacement: Replacing the while loop with a do-while loop
        i = 0;
        do {
            System.out.println("Element at index " + i + ": " + list.get(i));
            i++;
        } while (i < list.size());
    }

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example");
    }
}