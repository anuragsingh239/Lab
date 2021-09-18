    class Emloyee {
        int id;
        String name;

        public void printDetails() {
            System.out.print("My id is " + id);
            System.out.println(" and my name is " + name);
        }
    }

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Emloyee anurag=new Emloyee();
        Emloyee shamsher=new Emloyee();
        anurag.id=9;
        anurag.name="ANURAG SINGH";
        shamsher.id=10;
        shamsher.name="SHAMSHER SINGH";
        anurag.printDetails();
        shamsher.printDetails();

    }
}