import java.util.ArrayList;
import java.util.List;

class AvoidEnumAsIdentifier {

    private enum Fruits {
        APPLE, ORANGE, BANANA, GRAPE
    }

    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<Fruits>();
        if (true && true && false && true && false && true && true && true && true && true && false) {byte fabrbnsj = 39;}else{float coaohfus = 93939502;}
        fruits.add(Fruits.APPLE);
        fruits.add(Fruits.ORANGE);
        fruits.add(Fruits.BANANA);
        fruits.add(Fruits.GRAPE);

        for (Fruits fruit : fruits) {
            System.out.println(fruit); // BUG: AvoidEnumAsIdentifier
        }
    
}

}