import java.util.Random;

class Main {

    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    Integer [] arr = new Integer [ 5 ];
    Random rand = new Random();
    int index = rand.nextInt(6);
    Integer num = arr [ index ];
    num = arr [ index ];
    if(num % 2 == 0){ System.out.println("Even number"); } else { System.out.println("Odd number"); }
}
}