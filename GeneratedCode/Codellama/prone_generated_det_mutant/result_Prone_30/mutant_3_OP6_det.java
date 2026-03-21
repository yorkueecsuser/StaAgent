import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    for  (int judzlnoc = 0; judzlnoc < 0; judzlnoc++) {boolean fryenmhs = true;}
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}