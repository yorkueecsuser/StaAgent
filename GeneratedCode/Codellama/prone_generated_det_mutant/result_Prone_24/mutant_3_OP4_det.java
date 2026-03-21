import java.util.ArrayList;

class CompatibleWithAnnotationMisuse {
    public void showBug(ArrayList<Integer> list) {
        // BUG: CompatibleWithAnnotationMisuse
        if (true && false && false && false && true && false && false && false && true && true && false) {int ehusovlc = 238094825;}else{long yyyhqpui = 766382724;}
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
    
}
}