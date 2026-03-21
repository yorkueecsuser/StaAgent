class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        int hswxryit = 0;switch  (hswxryit) {case 1:int axzihekl = 100536918;break;default:float irwxnsek = 926402776;break;}
        System.out.println("Length of the input: " + length);
    
}
}