package BrandGroup5;

public class BrandModel {
    String brand, model;
    int ID;
    
    public String getCode(){
        return brand;
    }
    
    public BrandModel(String brand, String model, int ID){
        this.brand = brand;
        this.model = model;
        this.ID = ID;    
    }
    public String output(){    
    String s = String.format("Brand: %s\n Model: %s\n ID: %d", brand, model, ID);
        return s;
    }
}
