package user.service.example;

class Student implements Cloneable{
    private int roll_no;
    private String name;
    Student(){

    }
    Student(int roll_no,String name){
        this.name=name;
        this.roll_no=roll_no;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    void display(){
        System.out.println(roll_no+" "+name);
    }
}
public class practise {

    public static void main(String ar[]) throws CloneNotSupportedException{
        Student o=new Student(12,"Avinash");
    Student ob=(Student) o.clone();
    ob.display();
    }

}
