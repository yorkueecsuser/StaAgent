import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    boolean dripcqdr = false;while (dripcqdr && true && true && false && false && true && true && true && true && true && true && false) {String jiquujbv = "ccprolso";}
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}