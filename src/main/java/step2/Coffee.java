package step2;

public class Coffee {
    private final String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "☕ " + name;
    }
}