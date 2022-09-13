public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {


        employees[0] = new Employee("Иванов Иван Иванович", 1, 45000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 23000);
        employees[2] = new Employee("Смирнов Олег Олегович", 3, 25000);
        employees[3] = new Employee("Сидоров Михаил Сергеевич", 4, 12000);
        employees[4] = new Employee("Дадонов Павел Юрьевич", 5, 40000);
        employees[5] = new Employee("Михайлова Нина Ивановна", 6, 26000);
        employees[6] = new Employee("Гузеева Лариса Николаевна", 7, 14000);
        employees[7] = new Employee("Билан Дмитрий Николаевич", 8, 15000);
        employees[8] = new Employee("Арышев Денис Викторович", 9, 60000);
        employees[9] = new Employee("Цезарев Нерон Клавдиевич", 10, 55000);


        printEmployees();
        System.out.println();
        System.out.println("Сумма затрат за месяц: " + totalSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой " + findMaxSalary() + " рублей");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой " + findMinSalary() + " рублей");
        System.out.println();
        System.out.println("Среднее значение зарплат " + findAverageSalary() + " рублей ");
        System.out.println();
        printFullName();



    }


    public static void printEmployees()
    {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int totalSalary(){
        int allSalary = 0;
        for (Employee employee : employees) {
            allSalary += employee.getSalary();
        }
        return allSalary;
    }
    public static int findMaxSalary(){
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static int findMinSalary(){
        int minSalary = Integer.MAX_VALUE ;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }
    public static float findAverageSalary(){
        int counter = 0;
        int sum = 0;
        for (Employee employee : employees){
            if (employee != null){
                counter++;
                sum += employee.getSalary();
            }
        }
        return (float) sum / counter;
    }

        public static void printFullName(){
        for (Employee employee : employees){
            System.out.println(employee.getFullName());
        }
        }
    }
