import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public List<String> method(){
        List<String> names = new ArrayList<>();
        names.add("Leonardo");
        names.add("Rafael");
        names.add("Mikelandjelo");
        names.add("Donatello");
        names.add("Krisa");


       return names.stream()
                .sorted(Comparator.reverseOrder())
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println("t.method() = " + task2.method());


    }
}
