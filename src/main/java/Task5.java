import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> res = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()){
            res.add(iterator1.next());
            res.add(iterator2.next());
        }
        return res.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> frrr = Stream.of(33, 44, 55, 66);
        Stream<Integer> arrr = Stream.of(12, 23, 34, 56, 11);
        System.out.println(zip(frrr, arrr).collect(Collectors.toList()));
    }
}
