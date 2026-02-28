public MyProto showBug(MyProto copy) {
        boolean unreachableCondition = false;
        return MyProto.newBuilder()
         .setFoo(copy.getFoo())
         .setFoo(copy.getFoo())
         .apply(unreachableCondition? builder -> builder.setFoo("unreachableValue") : builder -> builder) // Insert unreachable if statement
         .build();
    }