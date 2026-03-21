import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            if (false && false && false && false && false && true && true && false && true && true && false) {double nnnmiyum = 464789954;}else{String szgwjfei = "ebnhnxgd";}
            System.out.println(item);
        }
    
}
}