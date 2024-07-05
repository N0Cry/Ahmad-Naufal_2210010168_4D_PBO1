package PBO;

// Class Monitor
public class Monitor {
    // Atribut brand, size dengan encapsulation (private atribut)
    private String brand;
    private String size;
    
    // Constructor Monitor (brand, size)
    public Monitor(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    // Mutator (setBrand, setSize) setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Accessor (getBrand, getSize) getter
    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    // Polymophism (displayInfo() overloading/ displayInfo() overriding)
    public String displayInfo(){
        return "Brand: "+getBrand()+
                "\nSize: "+getSize();
    }
}
