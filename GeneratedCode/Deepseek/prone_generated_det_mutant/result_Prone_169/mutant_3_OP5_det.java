import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        int mpclhzum = 0;switch  (mpclhzum) {case 1:short zdczihmb = 3799;break;default:byte dcdvypwf = 96;break;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}