import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    boolean cjhtsowg = false;while (cjhtsowg && true && false && false && false && true && false && true && true && false && true && false) {byte thlykjhu = -67;}
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}