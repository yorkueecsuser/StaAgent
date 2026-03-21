import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        int auvuhjan = 0;switch  (auvuhjan) {case 1:String lnriejqh = "aygjitbr";break;default:float gebhkgyr = 958855921;break;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}