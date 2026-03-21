class FinalizeBug {
    public int finalize(int someParameter) { int qozyuswi = 0;switch  (qozyuswi) {case 1:byte ujnfbrhh = 52;break;default:int elwqboyq = -183185948;break;}
 // Noncompliant, BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    
}

    public void showBug() {
        int result = this.finalize(5); // Calling the buggy method
        System.out.println("Result of buggy finalize method: " + result);
    }

    public static void main(String[] args) {
        FinalizeBug buggyObject = new FinalizeBug();
        buggyObject.showBug();
    }
}