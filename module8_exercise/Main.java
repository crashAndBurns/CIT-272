public class Main{
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Luke");
        names.add("Leia");
        names.add("Han Solo");
        names.add("Spock");
        names.add("Obeewon");
        names.add("Seven of Nine");

        // FC - 4/5/25 - Get and Set Data Passed
        names.set(4, "Obi-Wan");
        if (names.get(4).equals("Obi-Wan")){
            System.out.println("Set and Get Passed");
        }

        // FC - 4/5/25 - Remove Object Passed
        names.remove("Spock");
        if (names.get(3).equals("Obi-Wan")){
            System.out.println("remove(Object) Passed");
        }

        // FC - 4/5/25 - index of object passed
        if (names.indexOf("Obi-Wan") == 3){
            System.out.println("indexOf() Passed");
        }

        //  FC - 4/5/25 - Remove Object by Index Passed
        names.remove(4);
        // FC - 4/5/25 - Added test conditions below to test removed "Seven of Nine";
        if (names.contains("Seven of Nine")) {
            System.out.println("remove() by index failed");
        } else {
            System.out.println("remove() by index passed");
        }

        // FC - 4/5/25 - Contains Object Passed on both accounts
        if (names.contains("Luke")){
            System.out.println("contains() with existing element Passed");
        }
        if (!names.contains("Yoda")){
            System.out.println("contains() with non-existing element Passed");
        }

        // FC - 4/5/25 - added to test size of list before removing.
        System.out.println(names.size());

        // FC - 4/5/25 - Added to test toString() method
        System.out.println(names.toString());

        // FC - 4/5/25 - Clear  method passed;
        names.clear();
        if (names.isEmpty()){
            System.out.println("clear() and isEmpty() Passed");
        }

    }
}