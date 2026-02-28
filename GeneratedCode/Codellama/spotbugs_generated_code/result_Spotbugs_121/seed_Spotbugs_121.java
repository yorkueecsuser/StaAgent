import java.util.ArrayList;

class ImpossibleDowncast {
    public static void main(String[] args) {
        // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String[] array = (String[]) list.toArray(); // This cast will always throw a ClassCastException.
        System.out.println(array[0] + " " + array[1]);
    }
}