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
        for (Integer number : numbers) {
            int tvuwcihv = 0;switch  (tvuwcihv) {case 1:int caifdsin = -802618046;break;default:byte szzhuqdh = -12;break;}
            System.out.println(number);
        }
    
}
}