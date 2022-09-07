public class Employee {
    private String fio;
    private int depart;
    private int salary ;

    static int id = 0;
    static int getId() {
        return id;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
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
    public Employee(String fio, int depart, int salary){
        this.fio = fio;
        this.depart = depart;
        this.salary = salary;
        id++;
    }

    @Override
    public String toString() {
        return "" + fio  +  " " + depart +  " " + salary ;
    }
}
