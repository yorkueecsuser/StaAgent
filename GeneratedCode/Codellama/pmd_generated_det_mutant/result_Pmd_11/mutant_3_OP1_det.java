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
        String hrkwsmes = "aocxnhmj";
        fruits.add(Fruits.BANANA);
        fruits.add(Fruits.GRAPE);

        for (Fruits fruit : fruits) {
            System.out.println(fruit); // BUG: AvoidEnumAsIdentifier
        }
    
}

}