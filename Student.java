public class Student {
    private int id;
    private String name;
    private String department;
    private String email;
    //Constructor
    public Student(int id, String name,
             String department,
             String email){
      this.id = id;
      this.name = name;
      this.department = department;
      this.email = email;
    }
    public void display () {
      System.out.println("----------------");
      System.out.println("Student ID :" + id);
      System.out.println("Name : " + name );
      System.out.println("Department : " + department);
      System.out.println("Email   :" + email);
     }
}