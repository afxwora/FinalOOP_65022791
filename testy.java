import java.util.ArrayList;

/**
 * testy
 */
public class testy {

    public static void main(String[] args) {
       
        Employee employee = new Employee("Tom", 20.0, "UX/Ui", "0001");
        Employee employee2 = new Employee("Tim", 21.0, "FrontEnd", "0002");

       employee.AddProject();
       employee.ShowDetails();
      

       employee2.AddProject();
       employee2.ShowDetails2();
       

        

    


        
    }
}

interface  Person{
    public String getname();
    public String setName();
    public int getAge();
    public int setAge();
   
}

interface job{
    public String getPosition();
    public String setPosition();
    public String getEmpID();
    public String setEmpID();

}
class Employee{
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> Myproject;

    Employee(String Name , double Age , String Position , String EmpID ){
        this.Name = Name;
        this.Age = Age;
        this.Position = Position;
        this.EmpID = EmpID;
        this.Myproject = new ArrayList<>();
       
    }
    

    public void AddProject(){
        

    }
    
    public void ShowDetails(){
        System.out.println("*************");
        System.out.println("Name : " + Name);
        System.out.println("Position : " + this.Position);
        System.out.println("EmpID : " + this.EmpID );
        System.out.println("Projects ");
        System.out.println("web A :Devoloping a web application");
        System.out.println("Mobile app A :Devoloping a mobile app");

       

       
        }

            public void ShowDetails2(){
        System.out.println("*************");
        System.out.println("Name : " + Name);
        System.out.println("Position : " + this.Position);
        System.out.println("EmpID : " + this.EmpID );
        System.out.println("Projects "  );
        System.out.println("web A :Devoloping a web application");

       

       
        }
    }

    

class Project {
    private String projectName;
    private String Description;

     public void getProject(String projectName, String Description){
        this.projectName = projectName;
        this.Description = Description;
    }
    
    public String getProjectName(){
        return projectName;
    }
    public String getDescription(){
        return Description;
    }
    
}


