package java8Demo;

import java.awt.print.Book;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("Java", "HTML", "CSS", "SPring boot");
        Stream<String> stream = collection.stream();
        stream.forEach(System.out::println);

        collection.forEach(System.out::println);

        Set<String> set = new HashSet<String>();
        set.add("CSS");

        set.forEach(System.out::println);

        List<String> names = Arrays.asList("Jake", "Lisa", "Young", "Hamid");
        List<String> sortedNames = names.stream()
                .filter(n -> n.contains("a"))
                .sorted() //Intermediate Operation
                .toList(); // Terminal Operation

        System.out.println(sortedNames);


        Stream<Integer> randomStream = Stream.generate(() -> new Random().nextInt());


        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(12, "Book", 30.00));
        productList.add(new Product(14, "Pen", 50.00));
        productList.add(new Product(19, "Mouse", 20.00));
        productList.add(new Product(32, "Desk", 10.00));

        List<String> productNames = new ArrayList<>();

        for (Product product : productList) ;
        {

        }
        Collections.sort(productNames);
        System.out.println(productNames);




    }
}