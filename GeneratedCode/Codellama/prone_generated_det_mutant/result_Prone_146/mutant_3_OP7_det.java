import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        boolean ouqbbdlq = false;while (ouqbbdlq && false && false && true && true && true && false && false && false && false && true && false) {long ntyfobfj = -669711036;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}