import Workers.Employee;
import Workers.Interfacec.BonusSystem;



public class Salesman extends Employee implements BonusSystem {

    private int sales;

    public Salesman(String name, int age, double salary, String position, String hobby) {
        super(name, age, salary, position, hobby);
    }

    public Salesman(String name, int age, double salary, String position) {
        super(name, age, salary, position);
    }


    @Override
    public void getBonusForWork() {

    }

    @Override
    public void getBonusForSeason() {

    }
}

