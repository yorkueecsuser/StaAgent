import java.util.Random;

class BugExample {
    public void doSomething(String str) {
        if (Math.abs(str.hashCode()) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            //...
        }
    }
public void showBug() {
    int hashCode = new Random().nextInt();
    int absHashCode = Math.abs(hashCode);
    absHashCode = Math.abs(hashCode);
    if(absHashCode > 0){ }
}
}