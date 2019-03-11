import java.util.function.BiFunction;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {

        Function<String, String> func = x -> x;
        Function<String, String> func2 = x -> x + "!!!!!";
        System.out.println(func.apply("하이"));
        System.out.println(func.compose(func2).apply("하이"));

        BiFunction<String, String, String> stringPlus = (x, y) -> x + y;

        System.out.println(stringPlus.apply("하이", "?????"));
        System.out.println(stringPlus.andThen(func2).apply("하이", "?????"));
   }
}
