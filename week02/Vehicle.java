package week02;

class Vehicle {

    private String licencePlateNumber;
    private String color;

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.setLicencePlateNumber("CAZ-7168");
        toyota.setColor("RED");
        toyota.setPassengers(4);

        Bus layland = new Bus();
        layland.setBusRoute("138");
        layland.setLicencePlateNumber("LB-8909");
        layland.setColor("WHITE");
        System.out.println(layland.getColor());
    }
}

class Car extends Vehicle{

    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    } 
}

class Bus extends Vehicle{
    private String busRoute;

    public String getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(String busRoute) {
        this.busRoute = busRoute;
    }

    @Override
    public void setColor(String color) {
        super.setColor("RED");
    }
}
