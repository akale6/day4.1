public class StringtoBasic {
    public static void main(String[] args){
        //基本数据类型->string
        int n1 = 100;
        float n2 = 1.1f;
        double n3 = 3.4;
        boolean b1 = true;
        String str1 = n1 +"";
        String str2 = n2 +"";
        String str3 = n3 +"";
        String str4 = b1 +"";
        System.out.println(str1 + "\n" + str2 + "\n"  + str3 + "\n"  + str4 + "\n");
        //string->对应的基本数据类型
        //使用基本数据类型对应的包装类的相应方法，得到基本数据类型
        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123


    }
}
