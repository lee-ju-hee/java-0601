class Student{

    String name;
    int id;

    void setName(String str)
    {
        name = str;
    }
    void setId(int number)
    {
        id = number;
    }

    String getName()
    {
        return name;
    }
    int getId()
    {
        return id;
    }
}

public class ljh060110{

    public static void main(String[] args){

    Student std = new Student();

    std.setName("������");
    std.setId(12345);

    System.out.println("�̸�: " + std.getName() + "�й�: " + std.getId());

    }
}