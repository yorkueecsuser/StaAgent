import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        boolean stsfrmrv = false;while (stsfrmrv && true && false && false && false && true && true && false && false && false && true && false) {int fpowjbke = 730889884;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}