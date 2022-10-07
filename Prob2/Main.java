package Prob2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<People> people = getPeople();
        Map<Profeshion, List<People>> collect = people.stream().sorted(Comparator.comparing(People::getAge))
                .collect(Collectors.groupingBy(People::getProfeshion));
        collect.forEach((profeshion, people1) -> {
            System.out.println(profeshion);
            people1.forEach(System.out::println);
        });
        OptionalDouble average = people.stream().filter(e-> e.getProfeshion() == Profeshion.ZAVODCHANIN).mapToInt(People::getAge).average();
        System.out.println(average);
    }
    private static List<People> getPeople(){
        return List.of(
                new People(1,20,"Bob",Profeshion.GAMER),
                new People(2,22,"Valentin",Profeshion.PROGRAMMIST),
                new People(3,21,"Stepan",Profeshion.PROGRAMMIST),
                new People(4,40,"Oleg",Profeshion.ZAVODCHANIN),
                new People(5,30,"Boris",Profeshion.ZAVODCHANIN),
                new People(6,17,"Boris",Profeshion.GAMER)
        );
    }
}
