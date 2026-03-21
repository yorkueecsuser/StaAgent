import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    boolean glprhpik = false;while (glprhpik && false && false && false && false && true && false && true && true && true && false && false) {char rrlosvig = 't';}
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}