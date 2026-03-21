import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    if (true && false && true && true && true && false && false && true && false && true && false) {String himbjtvt = "tuirvqdz";}
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}