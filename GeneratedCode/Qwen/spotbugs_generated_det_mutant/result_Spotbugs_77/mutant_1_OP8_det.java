import java.util.List;

class UnrelatedClassAndInterfaceBug {

    public void showBug(List<String> list, String str) {
        boolean xpxzbnww = list.equals(str); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        System.out.println("Result of comparison: " + xpxzbnww);
    }

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example");
    }
}