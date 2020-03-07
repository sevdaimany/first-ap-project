package test;


public class Case {
    private String model;
    private String brand;
    private int power;
    private Dimentions dimentions;

    public Case(String model, String brand, int power, Dimentions dimentions) {
        this.model = model;
        this.brand = brand;
        this.power = power;
        this.dimentions = dimentions;
    }
    public void powerPress(){
        System.out.println("Case.powerPress called .. power pressed... ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Dimentions getDimentions() {
        return dimentions;
    }

    public void setDimentions(Dimentions dimentions) {
        this.dimentions = dimentions;
    }
}
