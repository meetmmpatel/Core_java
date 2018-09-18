package dayOne.DataTypesandOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class Namer {
    final private String firstName,lastName;
    public Namer(String fn,String ln) { firstName=fn; lastName=ln;}
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName;  }
}
public class Sorter {
    public static void main(String[] args) {
        Consumer<Namer> printit = e -> System.out.println(e.getFirstName() + " " + e.getLastName()); 
        List<Namer> names = new ArrayList(Arrays.asList(
                            new Namer("Harry","Smith"),new Namer("Joe","Smith"),new Namer("Jane","Doe"),
                            new Namer("Mary","Jane"),new Namer("Harry","Homeowner")));

        
        Collections.sort(names,(Namer e1,Namer e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        names.removeIf(e -> e.getFirstName().equals("Mary"));
        names.forEach(s -> System.out.println(s.getFirstName()+ " " + s.getLastName()));
        
        
    }
}