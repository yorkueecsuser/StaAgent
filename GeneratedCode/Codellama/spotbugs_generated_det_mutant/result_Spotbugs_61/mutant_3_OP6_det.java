import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        for  (int uugnggme = 0; uugnggme < 0; uugnggme++) {short tikmyvkz = 8622;}
        }
    
}
}