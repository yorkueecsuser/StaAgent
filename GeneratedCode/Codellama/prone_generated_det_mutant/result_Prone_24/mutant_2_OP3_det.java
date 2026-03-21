import java.util.ArrayList;

class CompatibleWithAnnotationMisuse {
    public void showBug(ArrayList<Integer> list) {
        // BUG: CompatibleWithAnnotationMisuse
        if (true && false && false && false && true && false && false && true && true && true && false) {short dfkybbpf = -8960;}
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
    
}
}