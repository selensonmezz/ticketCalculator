package cs105;

public class Main {

    public static void main(String[] args) {
        Ticket SmithFamily = new SingleEntry("Disneyland", 100, 2, 3);
        System.out.println(SmithFamily);

        Ticket RyanFamily = new MultipleEntry(2, 2);
        if (RyanFamily instanceof MultipleEntry) {
            ((MultipleEntry) RyanFamily).addPark("Disneyland", 100);
            ((MultipleEntry) RyanFamily).addPark("UniversalStudios", 200);
            ((MultipleEntry) RyanFamily).addPark("Epcot", 200);
            ((MultipleEntry) RyanFamily).addPark("SeaWorld", 100);
        }
        System.out.println(RyanFamily);
    }
}
