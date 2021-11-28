import Workers.Employee;
import Workers.Interfacec.BonusSystem;
import Workers.Interfacec.WorkerThings;

public class Engineer extends Employee implements BonusSystem, WorkerThings {

    private int fixedItems;

    public Engineer(String name, int age, double salary, String hobby) {
        super(name, age, salary, hobby);
    }

    public Engineer(String name, int age, double salary) {
        super(name, age, salary);
    }


    @Override
    public void getBonusForWork() {

    }

    @Override
    public void getBonusForSeason() {

    }

    @Override
    public void doMachines() {

    }

    @Override
    public void doMatLab() {

    }
}

