import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        if (false && true && true && false && false && true && false && false && true && false && false) {long kirtgtfp = -299925853;}else{boolean uoupkptp = true;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}