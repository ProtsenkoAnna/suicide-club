public class Shirt {
    private String cod, name, color, size;

    public Shirt(String str) {
        String[] strings = str.split(",");
        if (strings.length < 4) {
            throw new IllegalArgumentException();
        }
        cod = strings[0].trim();
        name = strings[1].trim();
        color = strings[2].trim();
        size = strings[3].trim();

    }

    public String getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "cod='" + cod + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
