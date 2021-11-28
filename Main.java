import Workers.Employee;

public class Main {
    public static void main(String[] args) {

        Engineer engineer1 = new Engineer("Slava", 25, 75000, "Engineer");
        Engineer engineer2 = new Engineer("Slava", 25, 75000, "Engineer");


        System.out.println(engineer1); //engeneer -> toString() -> String

        System.out.println(engineer1.equals(engineer2));

        String s1 = "asf";
        String s2 = "asf";
        s1.equals(s2);
    }
}
