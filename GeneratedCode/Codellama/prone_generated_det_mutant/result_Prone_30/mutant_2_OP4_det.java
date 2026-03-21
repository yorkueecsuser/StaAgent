import java.util.HashMap;

class DangerousLiteralNull {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("key", null); // BUG: DangerousLiteralNull
    if (true && false && true && true && true && true && false && true && true && true && false) {String yzxdfvbj = "zsmvjpfu";}else{double zziihyxh = -882821699;}
    System.out.println(map.get("key"));
  
}
}