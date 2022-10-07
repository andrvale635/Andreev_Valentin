package Prob2;

public class People {
    private int id;
    private int age;
    private String name;
    private Profeshion profeshion;

    public People(int id, int age, String name, Profeshion profeshion) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.profeshion = profeshion;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", profeshion=" + profeshion +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Profeshion getProfeshion() {
        return profeshion;
    }
}
