public class Car{
    //gather materials
    private final String brand;
    private final String engineType;
    private final String transmission;
    private final String color;
    private final Integer capacity;

    private Car (CarBuilder builder) {

    this.brand = builder.brand;
    this.engineType =builder.engineType;
    this.transmission =builder.transmission;
    this.color = builder.color;
    this.capacity = builder.capacity;
}

//constructs
public static class CarBuilder {
    private String brand;
    private String engineType;
    private String transmission;
    private String color;
    private Integer capacity;

    //Set the types 
    public CarBuilder (String brand) {
        this.brand = brand;
        
    }
    public CarBuilder engineType (String engineType) {
        this.engineType = engineType;
        return this;
    }
    public CarBuilder transmission (String transmission) {
        this.transmission = transmission;
        return this;
    }
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }
    public CarBuilder capacity (Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Car build() {
        return new Car(this);
    }

}

public String brand() {
    return brand;
   
}

public String engineType() {
    return engineType;
}

public String transmission() {
    return transmission;
   
}

public String color() {
    return color;
}

public Integer capacity() {
    return capacity;
}

}
