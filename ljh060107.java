public class ljh060107{

    public static void main(String[] args){

        int number = 100;

        addTen(number);

        System.out.println("main �޼��� ���");
        System.out.println(number);
    }


    static void addTen(int number)
    {
        number += 10;

        System.out.println("addTen �޼��� ���");
        System.out.println(number);
    }
}