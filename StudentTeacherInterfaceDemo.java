package abstractandintrefacepack;

interface Person 
{
 void speak();
}

class Student implements Person
{
 
 @Override
 public void speak() 
 {
     System.out.println("Student Says: Good Morning mam");
 }
}


class Teacher implements Person
{
 
 @Override
 public void speak() 
 {
     System.out.println("Teacher Says: Good Morning Class!");	
 }
}

public class StudentTeacherInterfaceDemo 
{
 public static void main(String[] args) 
 {
     Student st = new Student();
     st.speak();
     
     
     Teacher ta = new Teacher();
     ta.speak();
 }
}