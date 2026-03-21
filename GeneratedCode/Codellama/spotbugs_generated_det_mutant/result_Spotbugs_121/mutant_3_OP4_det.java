import java.util.ArrayList;

class ImpossibleDowncast {
    public static void main(String[] args) {
        // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        if (false && true && false && false && true && true && true && false && false && true && false) {int gdiaqgiw = 591635800;}else{float yhrgcape = 493116941;}
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String[] array = (String[]) list.toArray(); // This cast will always throw a ClassCastException.
        System.out.println(array[0] + " " + array[1]);
    
}
}