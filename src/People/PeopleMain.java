package People;

public class PeopleMain {
    public static void main(String[] args) {
        People vincent = new People("Vincent");
        People tom = new People("Tom", vincent, null);
        System.out.println(tom);

    }


}
