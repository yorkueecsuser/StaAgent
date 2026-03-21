class NP_NullInstanceOfBug {
public Object showBug() {
    Object obj = null;
    obj = null;
    if(obj instanceof String){ return "obj is an instance of String"; } else { return "obj is not an instance of String"; }
}
}