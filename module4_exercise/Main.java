public class Main {
    public static void main(String[] args) {
        SmartPhone motorola;
        motorola = new SmartPhone(1000, "Motorola 1000", 
        "An instance of a Motorola 1000", 1000.99, "Motorola",
        "1000", 16);

        Book rexManningDay;
        rexManningDay = new Book(3939, "Rex Manning's Day", 
        "Rex Manning Visits Empire Records", 99.99, "Rex Manning's Day", 
        "Manning, Rex", "Biographies", 23, 1999);


        System.out.println(motorola);
        System.out.println("");
        System.out.println(rexManningDay);
    }
}
