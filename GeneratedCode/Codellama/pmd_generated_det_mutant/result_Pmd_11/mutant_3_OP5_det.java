import java.util.ArrayList;
import java.util.List;

class AvoidEnumAsIdentifier {

    private enum Fruits {
        APPLE, ORANGE, BANANA, GRAPE
    }

    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<Fruits>();
        int vzbcyxpj = 0;switch  (vzbcyxpj) {case 1:int ppixzplt = 899955222;break;default:char vctmdowy = 'e';break;}
        fruits.add(Fruits.APPLE);
        fruits.add(Fruits.ORANGE);
        fruits.add(Fruits.BANANA);
        fruits.add(Fruits.GRAPE);

        for (Fruits fruit : fruits) {
            System.out.println(fruit); // BUG: AvoidEnumAsIdentifier
        }
    
}

}