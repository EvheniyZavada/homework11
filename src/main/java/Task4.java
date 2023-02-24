import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public Stream<Long> methodForTask4(Long a, Integer c, Double m, Long seed){

        Stream<Long> stream = Stream.iterate(seed, x-> ((a * x) + c) % m.longValue());
        return stream
                .limit(100);



    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.methodForTask4(25214903917L, 11, Math.pow(2, 48), 0L).collect(Collectors.toList()));
        System.out.println(2^48);
    }
}
