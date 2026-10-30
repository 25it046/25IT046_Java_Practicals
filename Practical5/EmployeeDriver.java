public class EmployeeDriver{
    public static void main(String[] args){
        Employee[] e={
           new FullTime("Riya",1,30000),
           new PartTime("Amit",2,40,500),
           new Intern("Raj",3,10000)
        };
        double total=0;
        for(Employee x:e){
            double s=x.monthlySalary();
            System.out.println(x.name+" Salary: "+s);
            if(x instanceof Intern)
               System.out.println("Note: Intern");
            total=total+s;
        }
        System.out.println("Total Salary: "+total);
    }
}
