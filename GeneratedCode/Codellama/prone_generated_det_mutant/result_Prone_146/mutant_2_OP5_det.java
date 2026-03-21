import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        int hkrbtzgi = 0;switch  (hkrbtzgi) {case 1:double zyzhafsw = -617196020;break;default:char vemgxctb = 'a';break;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}