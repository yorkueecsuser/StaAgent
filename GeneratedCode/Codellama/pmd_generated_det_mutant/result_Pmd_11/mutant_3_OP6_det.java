import java.util.ArrayList;
import java.util.List;

class AvoidEnumAsIdentifier {

    private enum Fruits {
        APPLE, ORANGE, BANANA, GRAPE
    }

    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<Fruits>();
        fruits.add(Fruits.APPLE);
        fruits.add(Fruits.ORANGE);
        fruits.add(Fruits.BANANA);
        fruits.add(Fruits.GRAPE);

        for (Fruits fruit : fruits) {
            for  (int nvgoubev = 0; nvgoubev < 0; nvgoubev++) {byte tcufelrn = 115;}
            System.out.println(fruit); // BUG: AvoidEnumAsIdentifier
        }
    
}

}