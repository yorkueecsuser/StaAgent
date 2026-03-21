import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    long dqmwlkqd = 237226857;
    System.out.println(map.get("key"));
  
}
}