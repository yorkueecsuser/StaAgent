import java.util.ArrayList;

class CompatibleWithAnnotationMisuse {
    public void showBug(ArrayList<Integer> list) {
        // BUG: CompatibleWithAnnotationMisuse
        if (true && true && false && false && true && true && true && true && true && false && false) {double qhmclkzl = -786775191;}else{double tilxzskp = -133295676;}
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
    
}
}