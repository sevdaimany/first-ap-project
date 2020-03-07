package test;

public class MotherBoard {
    private String model;
    private String brand;
    private int ramslot;
    private int cardslot;

    public MotherBoard(String model, String brand, int ramslot, int cardslot) {
        this.model = model;
        this.brand = brand;
        this.ramslot = ramslot;
        this.cardslot = cardslot;
    }
    public void insertNewRam(){
        System.out.println("MotherBoard.insertNewRam called .. ram  inserted successsful");
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

    public int getRamslot() {
        return ramslot;
    }

    public void setRamslot(int ramslot) {
        this.ramslot = ramslot;
    }

    public int getCardslot() {
        return cardslot;
    }

    public void setCardslot(int cardslot) {
        this.cardslot = cardslot;
    }


}
