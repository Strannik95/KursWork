public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {


        employees[0] = new Employee("Иванов Иван Иванович", Employee.getId(), 45000);
        employees[1] = new Employee("Петров Петр Петрович", Employee.getId(), 23000);
        employees[2] = new Employee("Смирнов Олег Олегович", Employee.getId(), 25000);
        employees[3] = new Employee("Сидоров Михаил Сергеевич", Employee.getId(), 12000);
        employees[4] = new Employee("Дадонов Павел Юрьевич", Employee.getId(), 40000);
        employees[5] = new Employee("Михайлова Нина Ивановна", Employee.getId(), 26000);
        employees[6] = new Employee("Гузеева Лариса Николаевна", Employee.getId(), 14000);
        employees[7] = new Employee("Билан Дмитрий Николаевич", Employee.getId(), 15000);
        employees[8] = new Employee("Арышев Денис Викторович", Employee.getId(), 60000);
        employees[9] = new Employee("Цезарев Нерон Клавдиевич", Employee.getId(), 55000);


            for (Employee employee : employees) {
                System.out.println(employee);
            }
        System.out.println();
        System.out.println("Сумма затрат за месяц: " + totalSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalary() + " рублей");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой " + minSalary() + " рублей");
        System.out.println();
        System.out.println("Среднее значение зарплат " + midSalary() + " рублей ");


    }


    public static int totalSalary(){
        int allSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary += employees[i].getSalary();
        }
        return allSalary;
    }
    public static int maxSalary(){
        int maxSalarySum = 0;
        for (int k = 0; k < employees.length; k++) {
            if (employees[k].getSalary() > maxSalarySum) {
                maxSalarySum = employees[k].getSalary();
            }
        }
        return maxSalarySum;
    }
    public static int minSalary(){
        int minSalarySum = maxSalary();
        for (int j = employees.length - 1; j >= 0; j--) {
            if (employees[j].getSalary() < minSalarySum) {
                minSalarySum = employees[j].getSalary();
            }
        }
        return minSalarySum;
    }
    public static int midSalary(){
        int midSalarySum = 0;
        for (int a = 0; a < employees.length; a++) {
            int allSalary = totalSalary();
            midSalarySum = allSalary / employees.length;
        }
        return midSalarySum;
    }
}