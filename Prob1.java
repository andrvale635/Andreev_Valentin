import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prob1 {
    public static void main(String[] args) {
        List<Animals> animals = getAnimal();
        Map<Classification, List<Animals>> collect = animals.stream().sorted(Comparator.comparing(Animals::getAge))
                .collect(Collectors.groupingBy(Animals::getClassification));
        collect.forEach(((classification, animals1) -> {
            System.out.println(classification);
            animals1.forEach(System.out::println);
        }));
        int sum = animals.stream().filter(e -> e.getAge() > 10).mapToInt(Animals::getAge).sum();
        System.out.println(sum);

        int sum1 = animals.stream().filter(e -> e.getAge() > 20).mapToInt(e -> e.getName().length()).sum();
        System.out.println(sum1);
    }

    private static List<Animals> getAnimal() {
        return List.of(
                new Animals(32, "Лев", Classification.PREDATOR),
                new Animals(20, "Слон", Classification.HERBIVORE),
                new Animals(3, "Мышь", Classification.OMNIVOROUS),
                new Animals(9, "Кот", Classification.PREDATOR),
                new Animals(7, "Пес", Classification.PREDATOR),
                new Animals(200, "Динозавр", Classification.PREDATOR)
        );
    }

    /*    String a = "Aa";
        String b = "Bb";
        String c = "Cc";
        String d = "Aac";
        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        int sum = list.stream().mapToInt(String::length).sum();
        System.out.println(sum);
    }*/
}
/*
кол-во букв в листе
суммарное кол-во букв в имени животных старше 20
суммарный возраст всех животных старше 10 лет
 */
