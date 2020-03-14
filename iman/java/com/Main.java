package iman.java.com;

class stash {

}

class stash2 {

}
class A {
    int data = 40;
    private A(){
      System.out.println("A created");
    }
    public A(int data) {
        this.data = data;
    }
    public static void main(String args[]) {
        A a = new A();
        System.out.println(a.data);
    }
}
class Test {
    public static void main(String args[]) {
        System.out.println("change from local 22");
        System.out.println("hello");
    }
}
