//演示算数运算符的使用
public class ArithmeticOperator {
    public static void main(String[] args){
        System.out.println(10 / 4);//结果为2
        System.out.println(10.0 / 4);//结果为2.5
        double d = 10 / 4;//结果为2.0
        System.out.println(d);
        //%取余 本质 a%b=a-a/b*b
        System.out.println(10 % 3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(10 % -3);//1
        //++使用
        int a = 1;
        a++;//自增 等价于 a= a+1
        ++a;//自增 等价于 a= a+1
        System.out.println("a" + a);//3
        /*
       作为表达式使用前++先自增在赋值
       后++先赋值在自增
        */
        int b = 5;
        //int c = ++b;//b=b+1 b=c
        int c = b++;//b=c c=c+1
        System.out.println( c +  b);//11



    }
}
