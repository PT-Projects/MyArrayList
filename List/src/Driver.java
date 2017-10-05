public class Driver {
    public static void main(String[] args) {

        MyArrayList al = new MyArrayList();

        MyArrayList al2 = new MyArrayList();

        for (int x = 0; x < 15; x++){
            al.add(x);
            al2.add(x);
        }

        System.out.println("1: " + al.toString());

        System.out.println("2: " + al2.toString());

        MyArrayList list = new MyArrayList();

        list.addAll(al);

        System.out.println("1+1: " + list.toString());

        al.addAll(al);

        System.out.println("1+1: " + al.toString());

    }
}
