import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        int orbqabrx = 0;switch  (orbqabrx) {case 1:long lkevaudw = 294102541;break;default:int zwyonmkt = 803022050;break;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}