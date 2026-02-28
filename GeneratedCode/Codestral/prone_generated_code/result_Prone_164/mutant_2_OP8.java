static String buggyCode =
        "class BuggyClass {\n" +
        "    void buggyMethod() {\n" +
        "        Object renamedVar = this;\n" +
        "        System.out.println(renamedVar.toString()); // BUG: TreeToString\n" +
        "    }\n" +
        "}";