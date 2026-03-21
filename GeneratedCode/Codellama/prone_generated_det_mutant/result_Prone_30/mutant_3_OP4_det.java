import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    if (true && false && false && false && true && false && false && true && true && false && false) {float vlnvgurg = -72098560;}else{double kmnfvcpc = -758636950;}
    System.out.println(map.get("key"));
  
}
}