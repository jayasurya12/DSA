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
    public String getEname() {
        return ename;
    }
    public String toString() {
        return empno + " " + ename + " " + salary;
    }
}

class CRUD_Demo {
    public static void main (String[] args) {

        Collection<Employee> arrayList = new ArrayList<Employee>();
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
                    int empNo = inputInt.nextInt();
                    System.out.print("Enter Employee Name: ");
                    String ename = inputString.nextLine();
                    System.out.print("Enter Salary: ");
                    int salary = inputInt.nextInt();
                    arrayList.add(new Employee(empNo, ename, salary));
                break;
                case 2:
                    System.out.println("--------------------------------------------------");
                    Iterator<Employee> i = arrayList.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e);
                    }
                break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter Empno to Search : ");
                    int empno = inputInt.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = arrayList.iterator();
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
                case 4:
                    found = false;
                    System.out.println("Enter Empno to Delete : ");
                    empno = inputInt.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = arrayList.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == empno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not found");
                    } else {
                        System.out.println("Record is Deleted Successfully.....!");
                    }
                    System.out.println("--------------------------------------------------");
                break;
                case 5:
                    found = false;
                    System.out.println("Enter Empno to Update : ");
                    empno = inputInt.nextInt();
                    System.out.println("--------------------------------------------------");
                    ListIterator<Employee>li = arrayList.ListIterator();
                    while(li.hasNext()) {
                        Employee e = li.next();
                        if (e.getEmpno() == empno) {
                            System.out.println("Enter new Name: ");
                            ename = inputString.nextLine();
                            System.out.println("Enter new Salary: ");
                            salary = inputInt.nextInt();
                            li.set(new Employee(empno, ename, salary));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not found");
                    } else {
                        System.out.println("Record is Updated Successfully.....!");
                    }
                    System.out.println("--------------------------------------------------");
                break;
            }
        } while (ch !=0);
    }
}

