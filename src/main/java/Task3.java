import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {


//    Comparator<String> comparator = new Comparator<String>() {
//        @Override
//        public int compare(String o1, String o2) {
//            Integer a1 = Integer.getInteger(o1);
//            Integer a2 = Integer.getInteger(o2);
//            return a1.compareTo(a2);
//        }
//    };
    public List<String> methodForTask3(List<String> array){
        return array.stream()
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
              //  .map(Integer::getInteger)
                .sorted()
                .collect(Collectors.toList());


    }



    public static void main(String[] args) {
        List <String> array =List.of("1, 2, 0","4, 5");
        Task3 task3 = new Task3();
        System.out.println("task3.methodForTask3() = " + task3.methodForTask3(array));
    }
}
