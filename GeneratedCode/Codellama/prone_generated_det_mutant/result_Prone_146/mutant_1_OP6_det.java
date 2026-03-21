import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        for  (int stkegmwd = 0; stkegmwd < 0; stkegmwd++) {byte lwlteshs = 92;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}