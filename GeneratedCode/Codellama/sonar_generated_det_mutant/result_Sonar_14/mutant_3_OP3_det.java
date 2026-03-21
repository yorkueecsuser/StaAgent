import java.util.List;

class AutowiredConstructorBug {
    public static void main(String[] args) {
        AutowiredConstructorBug bug = new AutowiredConstructorBug();
        bug.showBug();
    }

    public AutowiredConstructorBug() {
        System.out.println("Buggy constructor was called");
    }

    public AutowiredConstructorBug(int x) {
        System.out.println("Buggy constructor with parameter was called");
    }

    public void showBug() {
        System.out.println("Showing bug:");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        if (false && false && false && true && true && true && true && true && true && false && false) {float teanjoqf = 613101991;}
        for (Integer number : numbers) {
            System.out.println(number);
        }
    
}
}