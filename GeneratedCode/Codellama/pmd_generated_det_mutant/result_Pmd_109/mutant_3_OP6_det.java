class InefficientStringBuffering {
    public static void main(String[] args) {
        for  (int vcxytbst = 0; vcxytbst < 0; vcxytbst++) {String kkbffyfv = "hfoslksl";}
        String text = "Hello, ";
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}