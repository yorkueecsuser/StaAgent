import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    if (false && false && true && true && false && false && true && false && false && true && false) {float ezntrrrn = -795986014;}
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}