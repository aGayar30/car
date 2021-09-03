public class car {

    private String model;
    private int year;
    private String motor;

    public car(String model, int year, String motor) {
        this.model = model;
        this.year = year;
        this.motor = motor;
    }

    public car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public car(int year) {
        this.year = year;
    }

    public car(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType(){
            return null;
}

    public double km_left() {
        return 0;
    }
}
