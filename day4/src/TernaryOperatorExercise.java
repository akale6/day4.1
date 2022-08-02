//实现三个数的最大值
public class TernaryOperatorExercise {
    public static void main(String[] args){
        int n1 = 55;
        int n2 = 33;
        int n3 = 123;
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("最大数为" + max2);
        //使用一条语句实现
        //int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        // System.out.println(max);

    }

}
