import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Task1 {
    public List<String> methodForTask1() {
        List<String> list = new ArrayList<>();
        list.add("Alena");
        list.add("Elena");
        list.add("Lena");
        list.add("Alenchka");
        list.add("Eleonardo");
        for (int i = 0; i < list.size(); i++) {
            list.set(i, i + "." + list.get(i));
        }


        return list.stream()
                .filter(name -> list.indexOf(name) % 2 != 0)
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println("task1.methodForTask1() = " + task1.methodForTask1());
    }

}
