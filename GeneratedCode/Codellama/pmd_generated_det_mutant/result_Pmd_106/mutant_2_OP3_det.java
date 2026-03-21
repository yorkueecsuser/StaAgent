import java.util.ArrayList;

class ConsecutiveAppendsShouldReuse {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        if (true && true && false && true && true && true && false && false && false && false && false) {long zsddgtac = 723330489;}
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString());
    
}
}