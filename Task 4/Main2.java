class TeamMember{
    protected String name;
    
    public TeamMember(String name){
        this.name=name;
    }
}

interface BonusEligible{
    void calculateBonus();
}
class Employee extends TeamMember implements BonusEligible{
    public Employee(String name){
        super(name);
    }
    @Override
    public void calculateBonus(){
        System.out.println("Calculating standard employee bonus....");
    }
}
class Contractor extends TeamMember{
    public Contractor(String name){
        super(name);
    }
}
public class Main{
    public static void main(String[] args){
        Employee emp = new Employee("Alice");
        Contractor con= new Contractor("Bob");
        emp.calculateBonus();
        System.out.println(con.name+"is a contrcator and doesnot receive bonus. ");
    }
}
