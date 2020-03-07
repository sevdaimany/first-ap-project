package test;

public class Monitor {
    private String model;
    private String brand;
    private Resolution resolution;

    public Monitor(String model, String brand, Resolution resolution) {
        this.model = model;
        this.brand = brand;
        this.resolution = resolution;
    }
    public void DrawPixle(int x , int y , String color){
        System.out.println("Monitor.DrawPixle() called ... ");
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

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
