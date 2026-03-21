import java.util.ArrayList;

class CompatibleWithAnnotationMisuse {
    public void showBug(ArrayList<Integer> list) {
        if (true && false && false && false && true && false && false && true && false && false && false) {int hnqqbjnz = 467083025;}
        // BUG: CompatibleWithAnnotationMisuse
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
    
}
}