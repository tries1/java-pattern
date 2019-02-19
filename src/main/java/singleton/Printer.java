package singleton;

import java.util.Objects;

public class Printer {
    private static Printer printer;

    private Printer() {
    }

    //double check locking
    //이방식은 사용하지 않는것을 권장한다.
    //코드의 내용과는 다르게 객체가 여러번 생성될수 있는 가능성이 있고(멀티 프로세싱 환경에서 메모리 관련으로...)
    //초기화가 덜된 객체를 얻을 가능성이 있다.
    //또한 코드가 장황해지고 보기 좋지 않다.
    //불확실한 성능 향상보다는 안정적인 코드가 더나은 선택이다.
    public static Printer getInstance() {
        if (Objects.isNull(printer)) {
            synchronized (Printer.class) {
                System.out.println("객체 생성!!");
                printer = new Printer();
            }
        }

        return printer;
    }

    //Early Initialzation
    //객체를 미리 생성해서 사용하는 방법
    //코드가 심플해지지만, 객체가 사용되지 않는다면 불필요한 자원 낭비가됨
    private static Printer printer2 = new Printer();

    public static Printer getInstance2() {
        return printer2;
    }

    //참고
    //https://stackoverflow.com/questions/19068468/what-is-meant-by-early-initialization-of-a-singleton-class-in-java
    //https://aroundck.tistory.com/2722
    //http://blog.naver.com/PostView.nhn?blogId=jjoommnn&logNo=130036635345&parentCategoryNo=4&viewDate&currentPage=1&listtype=0%20%EC%B6%9C%EC%B2%98:%20https://aroundck.tistory.com/2722%20[%EB%8F%BC%EC%A7%80%EC%99%95%20%EC%99%95%EB%8F%BC%EC%A7%80%20%EB%86%80%EC%9D%B4%ED%84%B0]%20%EC%B6%9C%EC%B2%98:%20https://aroundck.tistory.com/2722%20[%EB%8F%BC%EC%A7%80%EC%99%95%20%EC%99%95%EB%8F%BC%EC%A7%80%20%EB%86%80%EC%9D%B4%ED%84%B0]
}
