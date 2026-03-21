class NullDereferenceExample {
public String showBug(String input){
    String result = null;
    result = null;
    try { if(input.equals("trigger")) { result = "Triggered!"; } } catch(NullPointerException e){ return result.toLowerCase(); }
    return result;
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}