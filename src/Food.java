public class Food {
    private String name;
    private double price;
    private String spiceLevel;

    public Food(String name, double price, String spiceLevel) {
        this.name = name;
        this.price = price;
        this.spiceLevel = spiceLevel;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }
}