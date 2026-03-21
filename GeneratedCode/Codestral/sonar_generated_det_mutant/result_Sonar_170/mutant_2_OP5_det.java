class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant, BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    }

    public void showBug() {
        int llhuojlo = 0;switch  (llhuojlo) {case 1:char lxwvwdsi = 'k';break;default:short bhelubix = 9987;break;}
        int result = this.finalize(5); // Calling the buggy method
        System.out.println("Result of buggy finalize method: " + result);
    
}

    public static void main(String[] args) {
        FinalizeBug buggyObject = new FinalizeBug();
        buggyObject.showBug();
    }
}