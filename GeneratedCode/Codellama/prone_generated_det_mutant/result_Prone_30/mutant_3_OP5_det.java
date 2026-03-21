import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    int lwzqdxql = 0;switch  (lwzqdxql) {case 1:long dcblwfqc = 560803489;break;default:float fkdwyson = -556557799;break;}
    System.out.println(map.get("key"));
  
}
}