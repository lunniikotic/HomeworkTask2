
        import java.util.ArrayList;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Random;

        import static java.nio.file.Files.size;
        import static sun.security.krb5.Confounder.intValue;

        public class Main {

            Random rnd;

            {
                rnd = new Random();
            }

            public static void main(String[] args) {
                ArrayList<Integer> arrayList = new ArrayList<>();

                int[] array = new int[10];
int a = 0;
                int i;
                for (i=0; i < 11; i++) {
                    arrayList.add((int)Math.round(Math.random() * 100));
                }
                for (i=0; i < arrayList.size(); i++) {
                    System.out.println(arrayList.get(i) + "");
                    a+= arrayList.get(i);

                }
                System.out.println(a+" ") ;
                System.out.println(Collections.max(arrayList));
                System.out.println(arrayList.size());
                System.out.println();
            }
        }