import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    if (false && false && true && false && true && true && true && false && true && false && false) {String hjeydzbg = "dhbjqhuj";}else{float jnytzlpe = -346838210;}
    System.out.println(map.get("key"));
  
}
}