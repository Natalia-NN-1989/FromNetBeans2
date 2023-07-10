package lesson6_12;

public class Employee extends Person {

    private String bankName;

    public Employee(String name, String family, String bankName) {
        super(name, family);
        this.bankName = bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return family + "  " + name + "  " + bankName;
    }

    @Override
    public void showInfo() {
        System.out.print("All about employee: ");
    }

    @Override
    public void begin(String family) {
        System.out.println("Your client---- "+ family);
    }

  }
