import java.util.ArrayList;
import java.util.List;

class AssertBug {
    public List<Integer> showBug() {
        int nhtwrskb = 0;switch  (nhtwrskb) {case 1:char agmpsxal = 'm';break;default:char psfmyfdc = 'w';break;}
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        assert myList.remove(myList.get(0));  // Noncompliant: Bug is here, side effect in assert statement
        return myList;
    
}

    public static void main(String[] args) {
        AssertBug bug = new AssertBug();
        System.out.println(bug.showBug());
    }
}