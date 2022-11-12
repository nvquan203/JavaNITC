import java.util.Scanner;

public class Student {
    final int test;
    String name;
    int age;
    String _class;
    double math, physics, chemistry;

    public Student() {
        this.test = 9;
    }

    public Student(String name, int age, String _class, double math, double physics, double chemistry) {
        this.name = name;
        this.age = age;
        this._class = _class;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.test = 10;
    }

    public int getTest() {
        return test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double avarageScore(){
        return (this.math + this.physics + this.chemistry) / 3;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sv: ");
//        String svName = scanner.nextLine();
//        setName(svName);
        setName(scanner.nextLine());
        System.out.println("Nhap tuoi sv: ");
        setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap lop sv: ");
        set_class(scanner.nextLine());
        System.out.println("Nhap diem toan: ");
        setMath(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap diem ly: ");
        setPhysics(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap diem hoa: ");
        setChemistry(Double.parseDouble(scanner.nextLine()));
    }

    public  void output(){
        System.out.println("Ten" + this.getName() + "\n" + "Tuoi" + this.getAge() + "\n" + "Toan" + this.getMath() + "\n" + "Ly" + this.getPhysics() + "\n" + "Hoa" +  this.getChemistry());
    }
}