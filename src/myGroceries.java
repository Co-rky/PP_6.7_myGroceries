import java.util.ArrayList;
public class myGroceries
{
    public static void main (String[] args)
    {
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("Milk");
        groceries.add("Eggs");
        groceries.add("Bread");
        groceries.add("Orange Juice");
        System.out.println("Unedited List");
        System.out.println("Number of items: " + groceries.size());
        for (String grocery : groceries) {
            System.out.println(grocery);
        }

        System.out.println("\nEdited List");
        groceries.remove(1);
        System.out.println("Number of items: " + groceries.size());
        for (String grocery : groceries) {
            System.out.println(grocery);
        }

        System.out.println("\nFirst Item in List");
        System.out.println(groceries.get(0));

    }
}
