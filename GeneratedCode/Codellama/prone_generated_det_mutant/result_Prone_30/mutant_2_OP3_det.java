import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    if (true && true && false && true && false && false && true && true && true && false && false) {double eyxvqkjz = -984943792;}
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}