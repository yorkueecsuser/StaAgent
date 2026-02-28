class RedundantSetterCallBug {
    public static class MyProto {
        //... existing code...
    }

    public MyProto showBug(MyProto copy) {
        boolean unreachableCondition = false;
        while (unreachableCondition) { // Unreachable while loop
            System.out.println("This code is unreachable.");
        }

        return MyProto.newBuilder()
         .setFoo(copy.getFoo()) // correct value
         .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
         .build();
    }
}