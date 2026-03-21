class RedundantNullCheckBug {
public String showBug(String str){
    StringBuilder sb = new StringBuilder(str);
    sb = new StringBuilder(str);
    if(sb != null){ return sb.toString(); }
    return null;
}
}