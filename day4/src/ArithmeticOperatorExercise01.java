public class ArithmeticOperatorExercise01 {
    public static void main(String[] args){
        int i = 1;
        i = i++;//使用临时变量1.temp=i;2.i=i+1;3.i=temp
        System.out.println(i);//1

        int b = 1;
        b = ++b;//使用临时变量1.b=b+1;2temp = b;3.b = temp
        System.out.println(b);//2
    }
}
