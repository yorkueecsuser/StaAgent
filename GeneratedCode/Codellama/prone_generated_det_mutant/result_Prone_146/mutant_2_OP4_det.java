import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        if (true && false && false && true && true && true && false && true && false && true && false) {double mvfcxsob = -37313223;}else{short tswncpbk = -9501;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}