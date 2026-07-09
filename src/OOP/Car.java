package OOP;

public class Car {

    private String brand;
    private String model;

    Car(){

    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData(){
        System.out.println(this.getBrand()+" "+this.getModel());
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
