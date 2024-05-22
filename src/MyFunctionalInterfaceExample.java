public class MyFunctionalInterfaceExample {
    public static void main(String[] args){


        MyFunctionalInterface example;
        MyFunctionalInterface example2;
        MyFunctionalInterface example3;
        MyFunctionalInterface example4;

        example = (x, y) -> x * y;
        example2 = (x, y) -> x + y;
        example3 = (x, y) -> x / y;
        example4 = (x, y) -> x - y;

        int numberMutiply = example.accept(2, 3);
        System.out.println(numberMutiply );
        int numberAdd = example2.accept(2, 3);
        System.out.println(numberAdd);
        int numberDevide = example3.accept(2,3);
        System.out.println(numberDevide);
        int numberSub = example4.accept(2,3);
        System.out.println(numberSub);




    }
}
