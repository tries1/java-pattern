import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        //single abstract method

        //List<Integer> integers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        List integers = new ArrayList();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add("안녕하세요");

        integers.stream()
        //.map(Integer::parseInt)
        .map(o -> Integer.parseInt(o.toString()))
        .forEach(System.out::println);
    }
}
