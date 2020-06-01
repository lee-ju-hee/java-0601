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

    std.setName("이주희");
    std.setId(12345);

    System.out.println("이름: " + std.getName() + "학번: " + std.getId());

    }
}