import java.util.*;
public class ljh060101{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Ű(cm)�� �Է��ϼ���: ");
        double hei = input.nextDouble();

        System.out.print("������(kg)�� �Է��ϼ���: ");
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
            System.out.print("���Դϴ�.");
        }
        else
        {
            if(heav >= 10)
            {
                System.out.printf("��ü���Դϴ�.");
            }
            else
            {
                System.out.printf("�����Դϴ�.");
            }
        }
    }
}