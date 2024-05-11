import java.util.*;

 class Calculator {
    int a,b;

    Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    int add(){
        return a+b;
    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a*b;
    }

    int div(){
        return a/b;
    }
}

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.print("Enter number a : ");
    int a=sc.nextInt();
        System.out.print("Enter number b : ");
        int b=sc.nextInt();
        System.out.print("opareation (+,-,*,/) : ");
        String op=sc.next();
        int c=0;

        Calculator obj = new Calculator(a,b);
        switch (op){
            case "+":c=obj.add();
            break;
            case"-":c= obj.sub();
            break;
            case"*":c= obj.mul();
            break;
            case"/":c= obj.div();
            default:System.err.print("Invalid input ");
        }
       System.out.println(a+op+b+"="+c);

    }
}