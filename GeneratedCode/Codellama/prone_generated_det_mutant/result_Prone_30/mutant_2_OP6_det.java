import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    for  (int jrkbzyjw = 0; jrkbzyjw < 0; jrkbzyjw++) {int xmqzlsqv = -134889381;}
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}