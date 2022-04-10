package less3;

import java.util.*;

public class les3_09_04_22 {
    public static void main(String[] args) {
        nam1();
        nam2();
    }




    private static void nam1() {
        //   1
        HashSet<String> handiwork = new HashSet<>();
        handiwork.add("Knitting");
        handiwork.add("Embroidery");
        handiwork.add("Scrapbooking");
        handiwork.add("Decoupage");
        handiwork.add("Quilling");
        handiwork.add("Modeling");
        handiwork.add("Felting");
        handiwork.add("Scrapbooking");
        handiwork.add("Decoupage");
        handiwork.add("Topiary");
        handiwork.add("Iris-folting");
        handiwork.add("Mistaken");

        Iterator handiworkIterator = handiwork.iterator();
        int unic = 0;
        while (handiworkIterator.hasNext()) {
            unic++;
            System.out.println(handiworkIterator.next());
        }
        System.out.println(unic);

        //   2
    }

        private static void nam2() {
            Сontactlist contactlist = new Сontactlist();

            contactlist.add("Antonov", "8917853366");
            contactlist.add("Bestuzhev", "825155333");
            contactlist.add("Efremov", "8917187964");
            contactlist.add("Vlasov", "8917894672");
            contactlist.add("Dashkova", "899999999");
            contactlist.add("Efremov", "899111111");
            contactlist.add("Kazanovskiy", "89173232299");
            contactlist.add("Antonov", "8927123118");
            contactlist.add("Antonov", "8475635234");

            System.out.println(contactlist.get("Antonov"));
            System.out.println(contactlist.get("Vlasov"));
            System.out.println(contactlist.get("Efremov"));
            System.out.println(contactlist.get("Efremov"));
        }
    }

    class Сontactlist {
        private Map<String, List<String>> contactlist_un = new HashMap<>();
        private List<String> phone_number_list;

        public void add(String surname, String phone_number) {
            if (contactlist_un.containsKey(surname)) {
                phone_number_list = contactlist_un.get(surname);
                phone_number_list.add(phone_number);
                contactlist_un.put(surname, phone_number_list);
            } else {
                phone_number_list = new ArrayList<>();
                phone_number_list.add(phone_number);
                contactlist_un.put(surname, phone_number_list);
            }
        }

        public List<String> get(String surname) {
            return contactlist_un.get(surname);
        }
}




