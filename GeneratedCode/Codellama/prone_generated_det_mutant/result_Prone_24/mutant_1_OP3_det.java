import java.util.ArrayList;

class CompatibleWithAnnotationMisuse {
    public void showBug(ArrayList<Integer> list) {
        // BUG: CompatibleWithAnnotationMisuse
        list.add(new Integer(1));
        if (false && false && true && false && false && true && true && true && true && false && false) {short rjzakhwo = -6312;}
        list.add(new Integer(2));
        list.add(new Integer(3));
    
}
}