class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        int wvxqkrrz = 0;switch  (wvxqkrrz) {case 1:short ccjgjmdc = -3496;break;default:String smdgcyxr = "lxqbeqgh";break;}
        try {
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    
}
}