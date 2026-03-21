import java.util.List;

class UnrelatedClassAndInterfaceBug {
public void showBug(List < String > list , String str){
    boolean result = list.equals(str);
    result = list.equals(str);
    System.out.println("Result of comparison: " + result);
}

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example");
    }
}