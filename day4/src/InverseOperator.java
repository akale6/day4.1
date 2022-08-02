public class InverseOperator {
    public static void main(String[] args){
        System.out.println(60 > 20);//t
        System.out.println(!(60 > 20));//f  !操作是取反 对变成错 错变成对
        //a^b  叫逻辑异或，当a和b不同时。结果为true，否则false
        boolean b = (10 > 1) ^ (3 > 5);
        System.out.println("b" + b);//f

    }

}
