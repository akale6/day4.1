public class LogicOperator01 {
    public static void main(String[] args){
        int age = 50;
        if(age > 20 && age < 90);{
            System.out.println("ok");//&&案例演示(短路与）对于&&短路与而言，如果第一个条件为 false ,后面的条件不再判断
        }
        if(age > 20 & age < 90);{
            System.out.println("ok1");//&案例演示(逻辑与）对于&逻辑与而言，如果第一个条件为 false ,后面的条件仍然会判断
        }
    }
}
