import java.util.List;

class UnrelatedClassAndInterfaceBug {

    public void showBug(List<String> list, String str) {
        if (false && false && false && true && false && true && true && true && false && true && false) {byte oalznlfi = 119;}else{double ksuijxpm = 903738442;}
        boolean result = list.equals(str); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example");
    }
}