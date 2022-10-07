public class Animals {
    private int age;
    private String name;
    private Classification classification;

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", classification=" + classification +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Classification getClassification() {
        return classification;
    }

    public Animals(int age, String name, Classification classification) {
        this.age = age;
        this.name = name;
        this.classification = classification;
    }
}
