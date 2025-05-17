//1. simple impl
/*
interface A{
    void show();
}
class Helper implements A{
    @Override
    public void show() {
        System.out.println("hello");
    }
}
public class fesco_lambada {
    public static void main(String[] args) {
        A obj=new Helper();
        obj.show();
    }
}
*/

//2. inner class
/*
interface A {
    void show();
}

public class fesco_lambada {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("Hello");
            }
        };
        obj.show();
    }
}
*/

//3. lambada exp
interface A {
    void show();
}

public class fesco_lambada {
    public static void main(String[] args) {
        A obj = () -> System.out.println("hello");
        obj.show();
    }
}