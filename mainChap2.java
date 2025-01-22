
import java.util.ArrayList;
import java.util.Date;

public class mainChap2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new loan(500));
        list.add(new Date());
        list.add("ABC");
        list.add(new circle(14));

        for(Object a : list){
            System.out.println(a);
        }
    }
}
