import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    int cezfcgci = 0;switch  (cezfcgci) {case 1:String xpkkypva = "duqkaoth";break;default:float oimumofv = 105368772;break;}
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}