import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    int uawwgrmy = 0;switch  (uawwgrmy) {case 1:float ulhfnbhp = -201789305;break;default:long yystoktr = 813730549;break;}
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    System.out.println(map.get("key"));
  
}
}