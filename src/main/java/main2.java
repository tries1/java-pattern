import java.util.Arrays;
import java.util.stream.Collectors;

public class main2 {
    public static void main(String[] args) {
        System.out.println("문자 정렬");
        String a = "A9ab7dEs7g26feado5F3Wvds4SA4F5F6W22EG34WE12sdf3ad";
        System.out.println(a);

        System.out.println(sort(a));
    }

    public static String sort(String str){
        String numbers = Arrays.stream(str.split("")).filter(s -> Character.isDigit(s.charAt(0))).sorted().collect(Collectors.joining());
        String upperCharters = Arrays.stream(str.split("")).filter(s -> Character.isUpperCase(s.charAt(0))).sorted().collect(Collectors.joining());
        String lowerCharters = Arrays.stream(str.split("")).filter(s -> Character.isLowerCase(s.charAt(0))).sorted().collect(Collectors.joining());

        System.out.println("numbers=" + numbers);
        System.out.println("upperCharters=" + upperCharters);
        System.out.println("lowerCharters=" + lowerCharters);


        return numbers + lowerCharters + upperCharters;
    }
}
