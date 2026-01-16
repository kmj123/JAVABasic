public class StringEx {
    public static void main(String[] args){
        String name = "Ja" + "va";
        String str = name + 21;

        System.out.println(name);       // Java
        System.out.println(str);        // Java21
        System.out.println(7+" ");      // 7
        System.out.println(" " + 7);    //  7
        System.out.println("" + 7);     // 7
        System.out.println(7 + 7 + ""); // 14
        System.out.println("" + 7 + 7); // 77

        String str1 = """
                    Hello""";
        String str2 = """
                    Hello
                    """;
        String str3 = """
                        Hello
                    """;
        String str4 = """
                    Hello
                    """.indent(2);
        String str5 = """
                    Hello\
                    """;
        System.out.println(str1+"\n"+str2+"\n"+str3+"\n"+str4+"\n"+str5);

        int age = 14;
        int year = 2026;

        System.out.printf("age: %d",age);
        System.out.printf("age: %d", 14);
        System.out.printf("age: 14\n");
        System.out.printf("age: %d %n year:%d",age,year);

    }
}
