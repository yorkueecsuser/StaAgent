import java.lang.Math;

class Bug {
public double showBug(int value){
    double doubleValue =(double)value;
    doubleValue =(double)value;
    return Math.ceil(doubleValue);
}

    public static void main(String[] args) {
        Bug bug = new Bug();
        System.out.println(bug.showBug(5));  // Output: 5.0
        System.out.println(bug.showBug(55)); // Output: 55.0
    }
}