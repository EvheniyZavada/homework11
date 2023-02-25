import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {


    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };
    public List<Integer> methodForTask3(List<String> array){
        return array.stream()
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
                .map(Integer::parseInt)
                .sorted(comparator)
                .collect(Collectors.toList());


    }



    public static void main(String[] args) {
        List <String> array = List.of("1, 2, 0","4, 5");
        Task3 task3 = new Task3();
        System.out.println("task3.methodForTask3() = " + task3.methodForTask3(array));
    }
}
