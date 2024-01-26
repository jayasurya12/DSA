import java.util.*;

class Employee {
    private int empno;
    private String ename;
    private int salary;

    Employee(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }
    public int getEmpno() {
        return empno;
    }
    public int getSalary() {
        return salary;
    }
    public int getEname() {
        return ename;
    }
    public String toString() {
        return empno + " " + ename + " " + salary;
    }
}

class CRUD_Demo {
    public static void main (String[] args) {

        Collection<Employee> C = new ArrayList<Employee>();
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("Enter your Choice : ");
            ch = inputInt.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Employee Number: ");
                    int eno = intput.nextInt();
                    System.out.print("Enter Employee Name: ");
                    String ename = inputString.nextLine();
                    System.out.print("Enter Salary: ");
                    int salary = inputInt.nextInt();
                    C.add(new Employee(eno, ename, salary));
                break;
                case 2:
                    System.out.println("--------------------------------------------------");

                    Iterator<Employee> i = C.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e);
                    }
                break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter Empno to Search : ");
                    empno = s.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = C.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == empno) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not found");
                    }
                    System.out.println("--------------------------------------------------");
                break;
            }
        } while (ch !=0);
    }
}

notepad C:\Users\Atatus Admin/.ssh/id_ed25519.pub
Get-Content ~/.ssh/id_ed25519.pub | Set-Clipboard

