import java.util.ArrayList;

class CompatibleWithAnnotationMisuse {
    public void showBug(ArrayList<Integer> list) {
        // BUG: CompatibleWithAnnotationMisuse
        list.add(new Integer(1));
        list.add(new Integer(2));
        short umhurzzo = -4347;
        list.add(new Integer(3));
    
}
}