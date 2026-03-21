class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
for  (int cfwfflcc = 0; cfwfflcc < 0; cfwfflcc++) {int xnoupcyv = -190992734;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}