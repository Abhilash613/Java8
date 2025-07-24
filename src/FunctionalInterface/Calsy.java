//package FunctionalInterface;
//With out Using Functional Interface
//public interface Calsy {
//    int add(int a,int b);
//
//    default void m1(){
//        System.out.println("Hello");
//    }
//
//}
//
//class child implements Calsy
//For using the Functional Interface or upper Abstract method We hace to make a class and there object.
//{
//    @Override
//    public int add(int a, int b) {
//        int result=a+b;
//        System.out.println(result);
//        return result;
//    }
//}
//
//
//class Driver{
//    public static void main(String[] args) {
//        Calsy c=new child();
//        c.add(5,5);
//        c.m1();
//
//
//
//    }
//}

//With Using functional Interface

package FunctionalInterface;
@FunctionalInterface
public interface Calsy {
    int add(int a,int b);

    default void m1(){
        System.out.println("Hello");
    }

}

//class child implements Calsy
//{
//    @Override
//    public int add(int a, int b) {
//        int result=a+b;
//        System.out.println(result);
//        return result;
//    }
//}


class Driver{
    public static void main(String[] args) {
        Calsy oper=(a,b)->a+b;
        System.out.println(oper.add(5,5));
        oper.m1();


    }
}