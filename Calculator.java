
public class Calculator {
     public static void main(String[] args) {
        Operation sum=(a,b)->a+b;
        Operation sub=(a,b)->a-b;
        Operation mul=(a,b)->a*b;

        Calculator c=new Calculator();
        System.out.println(c.operate(4, 5, sum));
        System.out.println(c.operate(4, 5, sub));
        System.out.println(c.operate(4, 5, mul));
     }
     private int operate(int m,int n,Operation o){
       return o.operation(m, n);
     }
    }


