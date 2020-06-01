import java.util.*;
public class ljh060101{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("키(cm)를 입력하세요: ");
        double hei = input.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요: ");
        double wei = input.nextDouble();

        double tot =0;

        if(hei >= 160)
        {
            tot= (hei - 100)*0.9;
        }
        else
        {
            if(hei>=150)
            {
                tot=(hei - 150)/2 +50;
            }
            else
            {
                tot=(hei - 100);
            }
        }

        double heav = (wei - tot) * 100 / tot;

        if(heav > 20)
        {
            System.out.print("비만입니다.");
        }
        else
        {
            if(heav >= 10)
            {
                System.out.printf("과체중입니다.");
            }
            else
            {
                System.out.printf("정상입니다.");
            }
        }
    }
}