import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        if (false && false && true && false && true && false && true && true && false && false && false) {long lbejdnsj = 966486115;}else{long rfdorvdz = -505228053;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}