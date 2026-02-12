interface MathUtil {

    static int add(int a, int b) {
        return a + b;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

public class Question1 {
    public static void main(String[] args) {

     
        Add add = MathUtil::add;
        Max max = MathUtil::max;
        Even even = MathUtil::isEven;

        System.out.println("Addition: " + add.calculate(5, 3));
        System.out.println("Max: " + max.find(10, 20));
        System.out.println("Is Even: " + even.check(6));
    }
}


interface Add {
    int calculate(int a, int b);
}

interface Max {
    int find(int a, int b);
}

interface Even {
    boolean check(int n);
}
