import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IndexBoundofException {

        public String[] prepareMyBag() {
            String[] schoolbag = { "Books", "Notebooks", "Pens" };
            System.out.println("I put in my bag: "+Arrays.toString(schoolbag));
            return (schoolbag);
        }
    public void printItems(String []items) {

        System.out.println("The last item I put in my bag was: " +items[items.length]);
        //return items[items.length]
    }

    public static void main(String args[]) {
        System.out.println("List item");
        String[] school= { "Books", "Notebooks", "Pens","Pencil" };

    }


}
