import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        if (true && true && true && true && true && false && false && false && false && false && false) {short zzogidnf = -2036;}else{int ljvbwwmv = -217186693;}
        }
    
}
}