package Section07.Polymorphism;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
