import java.util.List;

class UnrelatedClassAndInterfaceBug {

    public void showBug(List<String> list, String str) {
        for  (int dckiwgct = 0; dckiwgct < 0; dckiwgct++) {long skuhifqq = -852140134;}
        boolean result = list.equals(str); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example");
    }
}