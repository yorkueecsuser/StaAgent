class InefficientStringBuffering {
    public static void main(String[] args) {
        String nazfuiwt = "Hello, ";
        String ilydpuay = "World";
        StringBuffer sb = new StringBuffer(nazfuiwt + ilydpuay); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    }
}