//UMI ZUNNURAIN 13020210097

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0097 implements A, B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central0097 obj = new Central0097();
        obj.aaa();
    }
}