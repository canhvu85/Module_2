public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();

        listInteger.add(1);
        listInteger.add(3);

        listInteger.get(1);
        System.out.println(listInteger.get(1));

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));

        listInteger.get(1);
        System.out.println(listInteger.get(1));
    }
}
