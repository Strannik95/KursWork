public class Employee {
    private String fullName;
    private int depart;
    private int salary ;
    private Integer id = 0;
    static int counter = 0;

    public Employee(String fullName, int depart, int salary){
        this.fullName = fullName;
        this.depart = depart;
        this.salary = salary;
        this.id = counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepart() {
        return depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return counter;
    }



    @Override
    public String toString() {
        return "" + fullName  +  " " + depart +  " " + salary ;
    }
}
