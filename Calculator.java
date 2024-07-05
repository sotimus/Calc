public class Calculator{

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int mul(int a, int b){
        return a * b;
    }

    public int div(int a, int b){
        return a / b;
    }

    public static void main(String[] args){
        Calculator c = new Calculator();
        int a = 15, b = 10;
        System.out.println("For input a: " + a + " and b: " + b);
        System.out.println("Sum -> " + c.add(a,b));
        System.out.println("Subtraction -> " + c.sub(a,b));
        System.out.println("Multiplication -> " + c.mul(a,b));
        System.out.println("Division -> " + c.div(a,b));

    }
}