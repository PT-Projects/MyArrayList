public class Driver {
    public static void main(String[] args) {

        MyArrayList<Integer> al = new MyArrayList<>();

        MyArrayList<Integer> al2 = new MyArrayList<>();

        System.out.println(al.size());

        for (int x = 0; x < 10; x++){
            al.add(x);
        }

        System.out.println(al.size());

        System.out.println(al.toString());

        try {
            al.remove(11);
        }
        catch (IndexOutOfBoundsException exc){
            System.out.println(exc);
        }

        al.remove(2);

        System.out.println(al.remove(4));

        System.out.println(al.set(0,100));

        System.out.println(al.toString());

        System.out.println(al.size());

        al2.addAll(al);

        System.out.println(al2.toString());

        System.out.println(al2.size());

    }
}
