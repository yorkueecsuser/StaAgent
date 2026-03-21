import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        int predhiio = 0;switch  (predhiio) {case 1:long hnyliazf = -898959068;break;default:long ghjhadyz = -969534324;break;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}