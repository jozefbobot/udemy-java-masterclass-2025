import javax.swing.tree.AbstractLayoutCache;
import java.awt.image.AreaAveragingScaleFilter;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Section 5: Expressions, Statements & More
        /*
        double prveCislo = 20.00d;
        double druheCislo = 80.00d;
        double tretieCislo = (prveCislo + druheCislo) * 100.00d;
        double zvysok = tretieCislo % 40.00d;
        boolean jeZvysok = (zvysok == 0) ? true : false;
        */
        /*
        String slovo = "AHOOJ";
        StringBuilder reverse = new StringBuilder(slovo).reverse();
        String obrateneSlovo = reverse.toString();
        System.out.println(obrateneSlovo);
        */
        /*
        double cislo1 = 0.0003d;
        double cislo2 = 0.0002d;
        System.out.println(cislo1/cislo2);
        */
        /*
        boolean jedna = true;
        boolean dva = false;
        if (jedna) {
            System.out.println("Jedna");
        } else if (dva) {
            System.out.println("Dva");
        }
        */
        /*
        System.out.println(divocina());
        */
        /*
        System.out.println(toMilesPerHour(75.114));
        printConversion(95.75);
         */
        //printMegaBytesAndKiloBytes(2500);
        //System.out.println(shouldWakeUp(false, 4));
        //System.out.println(isLeapYear(1));
        //System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        //System.out.println(hasEqualSum(1,1,2));
        //System.out.println(hasTeen(1,5,30));
        //System.out.println(area(5.2));
        //System.out.println(area(5.2,5.2));
        //printYearsAndDays(-561600);
        //printEqual(1,2,3);
        //System.out.println(isCatPlaying(false, 46));

        //Section 6: Control Flow
        //denVTyzdni(5);
        //printNumberInWord(1);
        //System.out.println(getDaysInMonth(2, 2024));
        //forSDvomaPodmienkami();
        /*
        int pom = 0;
        for (int i = 0; i < 10; i++) {
            pom += i;
        }
        */
        //System.out.println(sumOdd(5,10));
        //eMethod(10);
        //System.out.println(isPalindrome(-1221));
        //System.out.println(sumFirstAndLastDigit(123));
        //System.out.println(getEvenDigitSum(123456789));
        //System.out.println(hasSharedDigit(12, 43));
        //System.out.println(hasSameLastDigit(41, 22, 71));
        //printFactors(10);
        //System.out.println(isPerfectNumber(6));
        //vstupyOdUzivatela();
        //kotrolaVstupu();
        //minMaxChallenge();
        //inputThenPrintSumAndAverage();
        /*
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(3.4, 1.5);
        */

        //Section 7: OOP Part 1 - Inheritance
        //triedyZaciatok();
        //triedyUloha1();
        //triedyUloha2();
        //triedyUloha3();
        //triedyUloha4();
        //pojo();
        //triedyUloha5();
        //triedyUloha6();
        //triedyUloha7();
        //triedyUloha8();
        //dedicnost();
        //dedicnostUloha1();
        //dedicnostUloha2();
        //dedicnostUloha3();
        //textBlokAFormatovanie();
        //pracaSoStringom();
        //manipulaciaSoStringom();
        //stringBuilder();

        //Section 8: OOP Part 2 - Polymorphism
        //kompozicia();
        //kompoziviaUloha1();
        //kompoziciaUloha2();
        //zapuzdrenie();
        //zapuzdrenieUloha1();
        //zapuzdrenieUloha2();
        //polymorfizmus();
        //polymorfizmusUloha1();
        //polymorfizmusUloha2();
        //oopZaverecnaUloha();

        //Section 9: Arrays
        //poliaZaciatok();
        //poliaOperacie();
        //poliaUloha1();
        //variadicArguments();
        //poliaUloha2();
        //poliaUloha3();
        //poliaUloha4();
        //dvojrozmernePole();

        //Section 10: List, ArrayList, LinkedList, Iterator, Autoboxing
        //arrayListZaciatok();
        //arrayListOperacie();

        //Section 11: Abstraction in Java

        //Section 12: Generics

        //Section 13: Nested Classes and Types

        //Section 14: Lambda Expressions, Functional Interfaces, and Method References

        //Section 15: Java Collections

        //Section 16: Using Final, Immutable classes, Constructors, Initializers, Sealed classes

        //Section 17: Streams

        //Section 18: Back to a Few Nuts and Bolts

        //Section 19: Regular expressions

        //Section 20: Input & Output (I/O), Working with Files in Java

        //Section 21: Concurrency

        //Section 22: Working with Databases

        //Section 23: Java Networking with Channels, Reactive Programing, and Virtual Threads

        //Section 24: Debugging and Unit Testing
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 24 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 23 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 22 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 21 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 20 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 19 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 18 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 17 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 16 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 15 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 14 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 13 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 12 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 11 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 10 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public static void arrayListOperacie() {
        ArrayList<String> arrayListZvierat = new ArrayList<>();
        arrayListZvierat.add("pes");
        arrayListZvierat.add("macka");
        arrayListZvierat.add("ryba");
        arrayListZvierat.add("orol");
        arrayListZvierat.add("krava");
        arrayListZvierat.add("tava");
        arrayListZvierat.add("hroch");

        System.out.println(arrayListZvierat);
        System.out.println("Prve zviera je: " + arrayListZvierat.get(0));

        if (arrayListZvierat.contains("macka")) System.out.println("Zoznam obsahuje macku");

        arrayListZvierat.add("ryba");
        System.out.println("Lev = " + arrayListZvierat.indexOf("lev"));
        System.out.println("Prva ryba = " + arrayListZvierat.indexOf("ryba"));
        System.out.println("Posledna ryba = " + arrayListZvierat.lastIndexOf("ryba"));

        System.out.println(arrayListZvierat);
        arrayListZvierat.remove(1);
        System.out.println(arrayListZvierat);
        arrayListZvierat.remove("ryba");
        System.out.println(arrayListZvierat);

        arrayListZvierat.removeAll(List.of("krava", "ryba"));
        System.out.println(arrayListZvierat);

        arrayListZvierat.retainAll(List.of("pes", "tava")); //vymaže všetko okrem pes a tava
        System.out.println(arrayListZvierat);

        arrayListZvierat.clear();
        System.out.println(arrayListZvierat);
        System.out.println("Je array list prazdny? - " + arrayListZvierat.isEmpty());

        arrayListZvierat.addAll(List.of("pes", "macka", "ryba"));
        arrayListZvierat.addAll(Arrays.asList("orol", "tava", "krava"));
        System.out.println(arrayListZvierat);
        arrayListZvierat.sort(Comparator.naturalOrder());
        System.out.println(arrayListZvierat);
        arrayListZvierat.sort(Comparator.reverseOrder());
        System.out.println(arrayListZvierat);

        var zvierataArray = arrayListZvierat.toArray(new String[arrayListZvierat.size()]);
        System.out.println(Arrays.toString(zvierataArray));
    }

    public static void arrayListZaciatok() {
        ArrayList rawList = new ArrayList(); //bez špecifického typu tzv. raw typ
        rawList.add("Text");
        rawList.add(100);
        System.out.println("Raw ArrayList: " + rawList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        //stringList.add(1); //nefunguje lebo pridavam integer do string arrayListu
        stringArrayList.add("Ahoj");
        stringArrayList.add("Svet");
        stringArrayList.add("Volam");
        stringArrayList.add("Sa");
        stringArrayList.add("Jozo");
        System.out.println(stringArrayList); //[Ahoj, Svet, Volam, Sa, Jozo]

        stringArrayList.add(1, "Hello");
        System.out.println(stringArrayList); //[Ahoj, Hello, Svet, Volam, Sa, Jozo]

        stringArrayList.set(0, "Hola");
        System.out.println(stringArrayList); //[Hola, Hello, Svet, Volam, Sa, Jozo]

        stringArrayList.remove(1);
        System.out.println(stringArrayList); //[Hola, Svet, Volam, Sa, Jozo]

        String[] veci = {"jablka", "banany", "mlieko", "vajicka"};
        List<String> zoznam = List.of(veci);
        System.out.println(zoznam);
        System.out.println(zoznam.getClass().getName()); //nemenna list

        ArrayList<String> nakupnyZoznam = new ArrayList<>(zoznam);
        nakupnyZoznam.add("jogurt");
        System.out.println(nakupnyZoznam);

        ArrayList<String> dalsiNakupnyZoznam = new ArrayList<>(
                List.of("uhorky", "horcica", "syr")
        );
        System.out.println(dalsiNakupnyZoznam);

        nakupnyZoznam.addAll(dalsiNakupnyZoznam);
        System.out.println(nakupnyZoznam);

        /*
        ArrayList<Person> personList = new ArrayList<>(); //Array list objektov
        personList.add(new Person("Ján", 25));
        personList.add(new Person("Mária", 30));
        System.out.println("ArrayList s osobami: " + personList);
        */
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 9 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public static void dvojrozmernePole() {
        int[][] pole2d = new int[4][4];
        System.out.println(Arrays.toString(pole2d));
        System.out.println("Dlzka 2D pola: " + pole2d.length);

        for (int[] vonkajsie : pole2d) {
            System.out.println(Arrays.toString(vonkajsie));
        }

        for (int i = 0; i < pole2d.length; i++) {
            var vnutornePole = pole2d[i];
            for (int j = 0; j < vnutornePole.length; j++) {
                //System.out.print(pole2d[i][j] + " ");
                pole2d[i][j] = (i * 10) + (j + 1);
            }
            //System.out.println();
        }

        System.out.println();

        for (var vonkajsie : pole2d) {
            for (var element : vonkajsie) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(Arrays.deepToString(pole2d));

        //Viacrozmerne pole:
        pole2d[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(pole2d));

        Object[] viacrozmernePole = new Object[3];
        System.out.println(Arrays.deepToString(viacrozmernePole));

        viacrozmernePole[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(viacrozmernePole));

        viacrozmernePole[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(viacrozmernePole));

        viacrozmernePole[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(viacrozmernePole));

        for (Object element : viacrozmernePole) {
            System.out.println("Typ elementu = " + element.getClass().getSimpleName());
            System.out.println("Element toString = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }

    public static void poliaUloha4() {
        int[] pole = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(pole));
        System.out.println(Arrays.toString(otocPole(pole)));
    }

    private static int[] otocPole(int[] pole) {
        //System.out.println("Array = " + Arrays.toString(pole));
        for (int i = 0; i < pole.length/2; i++) {
            int pom = pole[pole.length - 1 - i];
            pole[pole.length - 1 - i] = pole[i];
            pole[i] = pom;
        }
        //System.out.println("Reversed array = " + Arrays.toString(pole));
        return pole;
    }

    public static void poliaUloha3() {
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int findMin(int[] polePrvkov) {
        int min = Integer.MAX_VALUE;
        for (int i : polePrvkov) {
            if (i < min) min = i;
        }
        return min;
    }

    private static int[] readElements(int pocetPrvkov) {
        Scanner sc = new Scanner(System.in);
        int[] polePrvkov = new int[pocetPrvkov];
        for (int i = 0; i < pocetPrvkov; i++) {
            int prvok = sc.nextInt();
            polePrvkov[i] = prvok;
        }
        return polePrvkov;
    }

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        int pocetPrvkov = sc.nextInt();
        return pocetPrvkov;
    }

    public static void poliaUloha2() {
        int[] vratenePole = citajCisla();
        System.out.println(Arrays.toString(vratenePole));

        int vrateneMinimum = najdiMinimum(vratenePole);
        System.out.println("Minimum je: " + vrateneMinimum);
    }

    public static int[] citajCisla() {
        System.out.println("Napis cisla oddelene ciarkami:");
        String vstup = sc.nextLine();

        String[] split = vstup.split(",");
        int[] hodnoty = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            hodnoty[i] = Integer.parseInt(split[i].trim());
        }
        return hodnoty;
    }

    public static int najdiMinimum(int[] pole) {
        int min = Integer.MAX_VALUE;
        for (int el : pole) {
            if (el < min) min = el;
        }
        return min;
    }

    public static void variadicArguments() {
        String[] splitPole = "Hello World again".split(" ");
        vypisArgumentov(splitPole);
        System.out.println("_".repeat(20));

        vypisArgumentov("Hello");
        System.out.println("_".repeat(20));

        vypisArgumentov("Hello", "World", "again");
        System.out.println("_".repeat(20));

        vypisArgumentov();
        System.out.println("_".repeat(20));
    }

    public static void vypisArgumentov(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }

    public static void poliaUloha1() {
        int[] nezoradenePole = getNahodnePole(10);
        System.out.println(Arrays.toString(nezoradenePole));

        int[] vzostupnePole = Arrays.copyOf(nezoradenePole, nezoradenePole.length);
        Arrays.sort(vzostupnePole);
        for (int i = 0; i < vzostupnePole.length / 2; i++) {
            int temp = vzostupnePole[i];
            vzostupnePole[i] = vzostupnePole[vzostupnePole.length - 1 - i];
            vzostupnePole[vzostupnePole.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(vzostupnePole));
    }

    public static void poliaOperacie() {
        int[] prvePole = getNahodnePole(10);
        System.out.println(Arrays.toString(prvePole));
        Arrays.sort(prvePole);
        System.out.println(Arrays.toString(prvePole));

        int[] druhePole = new int[10];
        System.out.println(Arrays.toString(druhePole));
        Arrays.fill(druhePole, 5);
        System.out.println(Arrays.toString(druhePole));

        int[] tretiePole = getNahodnePole(10);
        System.out.println(Arrays.toString(tretiePole));
        int[] stvrtePole = Arrays.copyOf(tretiePole, tretiePole.length);
        System.out.println(Arrays.toString(stvrtePole));
        Arrays.sort(stvrtePole);
        System.out.println(Arrays.toString(tretiePole));
        System.out.println(Arrays.toString(stvrtePole));

        int[] mensiePole = Arrays.copyOf(tretiePole, 5);
        System.out.println(Arrays.toString(mensiePole));
        int[] vacsiePole = Arrays.copyOf(tretiePole, 15);
        System.out.println(Arrays.toString(vacsiePole));

        String[] stringPole = {"Jozef", "Lucia", "Palo", "Stevo", "Dezo"};
        Arrays.sort(stringPole);
        System.out.println(Arrays.toString(stringPole));
        if (Arrays.binarySearch(stringPole, "Lucia") >= 0) {
            System.out.println("Najdena Lucia v poli");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(s1, s2)) System.out.println("Polia su rovnake");
        else System.out.println("Polia niesu rovnake");

        int[] s3 = {1, 2, 3, 4, 5};
        int[] s4 = {5, 2, 3, 4, 1};
        if (Arrays.equals(s3, s4)) System.out.println("Polia su rovnake");
        else System.out.println("Polia niesu rovnake");

        int[] s5 = {1, 2, 3, 4, 5};
        int[] s6 = {1, 2, 3, 4, 5, 0};
        if (Arrays.equals(s5, s6)) System.out.println("Polia su rovnake");
        else System.out.println("Polia niesu rovnake");

        String[] splitPole = "Hello World again".split(" ");
        System.out.println(Arrays.toString(splitPole));

        String[] sPole = {"Jozef", "Lucia", "Palo", "Stevo", "Dezo"};
        System.out.println(String.join(",", sPole));
    }

    public static  int[] getNahodnePole(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 9 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public static void poliaZaciatok() {
        int[] intPole = new int[10];
        intPole[0] = 45;
        intPole[1] = 1;
        intPole[5] = 50;

        double[] doublePole = new double[10];
        doublePole[2] = 3.5;
        System.out.println(doublePole[2]);
        int[] desat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Prve = " + desat[0]);
        int dlzka = desat.length;
        System.out.println("Dlzka pola = " + dlzka);
        System.out.println("Posledne = " + desat[dlzka - 1]);

        for (int i = 0; i < desat.length; i++) {
            System.out.print(desat[i] + " ");
        }

        System.out.println();

        int[] noveIntPole;
        noveIntPole = new int[5];

        for (int i = 0; i < noveIntPole.length; i++) {
            noveIntPole[i] = noveIntPole.length - i;
        }

        for (int i = 0; i < noveIntPole.length; i++) {
            System.out.print(noveIntPole[i] + " ");
        }
        System.out.println();

        for (int element : noveIntPole) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(noveIntPole);
        System.out.println(Arrays.toString(noveIntPole));

        Object objektPole = noveIntPole;
        if (objektPole instanceof int[]) {
            System.out.println("Objekt je pole intov");
        }

        Object[] novyObjekt = new Object[4];
        novyObjekt[0] = "Hello";
        novyObjekt[1] = new StringBuilder("World");
        novyObjekt[2] = 1;
        novyObjekt[3] = noveIntPole;
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 8 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public static void oopZaverecnaUloha() {
        /*
        Polozka kola = new Polozka("napoj", "kola", 1.50);
        kola.vypisPolozky();
        kola.setVelkost("VELKY");
        kola.vypisPolozky();
        */
        /*
        Burger burger = new Burger("bezny", 4.00);
        burger.pridajPrilohu("SLANINA", "SYR", "MAJONEZA");
        burger.vypisPolozky();
        */
        /*
        Objednavka beznaObjednavka = new Objednavka();
        beznaObjednavka.pridajPrilohuBurgru("SLANINA", "SYR", "MAJONEZA");
        beznaObjednavka.nastavVelkostNapoja("VELKY");
        beznaObjednavka.vypisPolozky();
        */
        /*
        Objednavka druhaObjednavka = new Objednavka("turky", "7-up", "chili");
        druhaObjednavka.pridajPrilohuBurgru("SALAT", "SYR", "MAJONEZA");
        druhaObjednavka.nastavVelkostNapoja("MALY");
        druhaObjednavka.vypisPolozky();
        */

        Objednavka deluxeObjednavka = new Objednavka("deluxe", "7-up", "chili");
        deluxeObjednavka.pridajPrilohuBurgru("AVOKADO", "SLANINA", "SALAT", "SYR", "MAJONEZA");
        deluxeObjednavka.nastavVelkostNapoja("MALY");
        deluxeObjednavka.vypisPolozky();
    }

    public static void polymorfizmusUloha2() {
        AutoUloha car = new AutoUloha(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

    public static void polymorfizmusUloha1() {
        Auto auto = new Auto("2022 Blue Ferrari 296 GTS");
        pretek(auto);

        Auto ferrari = new BenzinoveAuto("2022 Blue Ferrari 296 GTS", 15.4, 6);
        pretek(ferrari);

        Auto tesla = new ElektrickeAuto("2022 Red Tesla model 3", 568, 75);
        pretek(tesla);

        Auto ferrariHybrid = new HybridneAuto("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        pretek(ferrariHybrid);
    }

    public static void pretek(Auto auto) {
        auto.nastartovatMotor();
        auto.riadit();
    }

    public static void polymorfizmus() {
        //Film film = Film.getFilm("Scifi", "Star Wars");
        //film.pozerajFilm();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Napis typ: D - dobrodruzny, K - komedia, S - SciFi alebo K pre koniec");
            String typ = s.nextLine();
            if ("Qq".contains(typ)) break;

            System.out.println("Napis nazov filmu:");
            String nazov = s.nextLine();
            Film film = Film.getFilm(typ, nazov);
            film.pozerajFilm();
        }
    }

    public static void zapuzdrenieUloha2() {
        TlaciarenUloha printer = new TlaciarenUloha(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

    public static void zapuzdrenieUloha1() {
        Tlaciaren tlaciaren = new Tlaciaren(50, false);
        System.out.println("Pociatocny pocet stran = " + tlaciaren.getPocetVytlacenychStran());

        int pocetVytlacenychStran = tlaciaren.tlacStranok(5);
        System.out.printf("Aktualny pocet tlacenych stran: %d, Celkovo vytlacenych: %d %n", pocetVytlacenychStran, tlaciaren.getPocetVytlacenychStran());

        pocetVytlacenychStran = tlaciaren.tlacStranok(10);
        System.out.printf("Aktualny pocet tlacenych stran: %d, Celkovo vytlacenych: %d %n", pocetVytlacenychStran, tlaciaren.getPocetVytlacenychStran());
    }

    public static void zapuzdrenie() {
        Hrac hrac = new Hrac();
        hrac.meno = "Jozef";
        hrac.zdravie = 20;
        hrac.zbran = "mec";

        int demage = 10;
        hrac.strataZdravie(demage);
        System.out.println("Ostavajuce zdravie = " + hrac.ostavajuceZdravie());
        hrac.zdravie = 200; //nemalo by to byť umožnené
        hrac.strataZdravie(11);
        System.out.println("Ostavajuce zdravie = " + hrac.ostavajuceZdravie());

        HracVylepseny jozo = new HracVylepseny("Jozef", 200, "Mec");
        System.out.println("Ostavajuce zdravie = " + jozo.ostavajuceZdravie());

    }

    public static void kompoziciaUloha2() {
        Walll wall1 = new Walll("West");
        Walll wall2 = new Walll("East");
        Walll wall3 = new Walll("South");
        Walll wall4 = new Walll("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }

    public static void kompoziviaUloha1() {
        InteligentnaKuchyna kuchyna = new InteligentnaKuchyna();

        /*
        kuchyna.getUmyvacka().setMaCoRobit(true);
        kuchyna.getChladnicka().setMaCoRobit(true);
        kuchyna.getKavovar().setMaCoRobit(true);

        kuchyna.getUmyvacka().umyvatRiad();
        kuchyna.getChladnicka().objednatJedlo();
        kuchyna.getKavovar().uvarKavu();
        */

        kuchyna.nastavKuchynu(true, false, true);
        kuchyna.robKuchynskePrace();
    }

    public static void kompozicia() {
        Skrina novaSkrina = new Skrina("2208", "Dell", "240");
        Monitor novyMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        ZakladnaDoska novaZakladnaDoska = new ZakladnaDoska("BJ-200", "Asus", 4, 6, "v2.44");
        OsobnyPocitac novyOsobnyPocitac = new OsobnyPocitac("2208", "Dell", novaSkrina, novyMonitor, novaZakladnaDoska);
        //novyOsobnyPocitac.getMonitor().nakresliPixel(10, 10, "červená");
        //novyOsobnyPocitac.getZakladnadoska().nacitajProgram("Windows OS");
        //novyOsobnyPocitac.getSkrina().stlacTlacidloZapnutia();
        novyOsobnyPocitac.zapni();
    }

    public static void dedicnostUloha3() {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    public static void dedicnostUloha2() {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 7 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public static void stringBuilder() {
        StringBuilder stringbuilderRezatec = new StringBuilder("Hello" + " World");
        System.out.println("retazec: " + stringbuilderRezatec);
        System.out.println("dlzka retazca: " + stringbuilderRezatec.length());

        stringbuilderRezatec.append(" and Goodbye");
        System.out.println("retazec: " + stringbuilderRezatec);

        StringBuilder prazdnyRetazec = new StringBuilder();
        StringBuilder prazdnyRetazecSCislom = new StringBuilder(32);

        System.out.println("retazec: " + prazdnyRetazec);
        System.out.println("dlzka retazca: " + prazdnyRetazec.length());
        System.out.println("kapacita: " + prazdnyRetazec.capacity());
        System.out.println("retazec: " + prazdnyRetazecSCislom);
        System.out.println("dlzka retazca: " + prazdnyRetazecSCislom.length());
        System.out.println("kapacita: " + prazdnyRetazecSCislom.capacity());

        StringBuilder dalsiStringbuilderRezatec = new StringBuilder("Hello" + " World");
        dalsiStringbuilderRezatec.append(" and Goodbye");

        dalsiStringbuilderRezatec.deleteCharAt(16).insert(16, 'g');
        System.out.println(dalsiStringbuilderRezatec);

        dalsiStringbuilderRezatec.replace(16, 17, "G");
        System.out.println(dalsiStringbuilderRezatec);

        dalsiStringbuilderRezatec.reverse();
        System.out.println(dalsiStringbuilderRezatec);

        dalsiStringbuilderRezatec.setLength(7);
        System.out.println(dalsiStringbuilderRezatec);
    }

    public static void manipulaciaSoStringom() {
        String datumNarodenia = "31/07/2001";
        int startovaciIndex = datumNarodenia.indexOf("2001");
        System.out.println("startovaciIndex = " + startovaciIndex);
        System.out.println("rok narodenia = " + datumNarodenia.substring(startovaciIndex));

        System.out.println("mesiac narodenia = " + datumNarodenia.substring(3, 5));

        String dalsiDatum = String.join("/", "01", "01", "2025");
        System.out.println(dalsiDatum);

        System.out.println(dalsiDatum.replace('/', '.'));
        System.out.println(dalsiDatum.replace("0", ""));
        System.out.println(dalsiDatum.replaceFirst("0", ""));
        System.out.println(dalsiDatum.replaceAll("0", "*"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("_".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8)); //indent pridá medzeri na začiatok riadku
        System.out.println("_".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2)); //indent odstrani medzeri na začiatok riadku
        System.out.println("_".repeat(20));
    }

    public static void pracaSoStringom() {
        String retaze = "Kebab";
        System.out.printf("Dlžka = %d %n", retaze.length());
        System.out.printf("Prve pismeno = %c %n", retaze.charAt(0));
        System.out.printf("Posledne pismeno = %c %n", retaze.charAt(retaze.length()-1));

        String retazec2 = "Hello World";
        System.out.printf("index r = %d %n", retazec2.indexOf('r'));
        System.out.printf("index World = %d %n", retazec2.indexOf("World"));

        System.out.printf("prve l = %d %n", retazec2.indexOf('l'));
        System.out.printf("posledne l = %d %n", retazec2.lastIndexOf('l'));
        System.out.printf("druhe l = %d %n", retazec2.indexOf('l', 3));
        System.out.printf("predposledne l = %d %n", retazec2.lastIndexOf('l', 8));

        String retazec3 = retazec2.toLowerCase();

        if (retazec2.equals(retazec3)) System.out.println("rezazce su totožné");
        if (retazec2.equalsIgnoreCase(retazec3)) System.out.println("retazec je rovnaky s ignore case");

        if (retazec2.startsWith("Hello")) System.out.println("Retazec začína s Hello");
        if (retazec2.endsWith("World")) System.out.println("Retazec konci s World");
        if (retazec2.contains("World")) System.out.println("Retazec obsahuje World");
        if (retazec2.contentEquals("Hello World")) System.out.println("Presne sa zhoduju");


        String prazdnyRetazec = "";
        if (prazdnyRetazec.isEmpty()) System.out.println("Prazdny retazec");

        String blankRetazec = "\t    \n";
        if (blankRetazec.isBlank()) System.out.println("Blank retazec");

    }

    public static void textBlokAFormatovanie() {
        String zoznam = "Zoznam na nakup: \n" +
                "\t\u2022 Vajička\n" +
                "\t\t\u2022 Maslo";
        System.out.println(zoznam);

        String textBlock = """
                Zoznam na nakup:
                        \u2022 Vajička
                            \u2022 Maslo""";
        System.out.println(textBlock);

        int vek = 23;
        System.out.printf("Tvoj vej je %d%n", vek);
        System.out.printf("Tvoj vej je %.2f%n", (float) vek);

        int rokNarodenia = 2025 - vek;
        System.out.printf("Vek = %d, Rok narodenia %d%n", vek, rokNarodenia);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Vypis %6d %n", i);
        }

        String formatovanyString = String.format("Tvoj vek je %d", vek);
        System.out.println(formatovanyString);

        formatovanyString = "Tvoj vek je %d".formatted(vek);
        System.out.println(formatovanyString);
    }

    public static void dedicnostUloha1() {
        Zamestnanec tim = new Zamestnanec("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Vek = " + tim.vratVek());
        System.out.println("Plat = " + tim.plat());

        PlatenyZamestnanec joe = new PlatenyZamestnanec("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Plat Joa je = " + joe.plat());

        joe.dochodok();
        System.out.println("Dochodok Joa je = " + joe.plat());

        HodinovyZamestnanec mary = new HodinovyZamestnanec("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Plat Mary je " + mary.plat());
        System.out.println("Plat Mary pošas sviatku je " + mary.dvojityPlat());
    }

    public static void dedicnost() {
        Zviera zviera = new Zviera("Všeobecné zviera", "Obrovské", 400);
        vykonajPohybZviera(zviera, "pomaly");

        Pes pes = new Pes();
        vykonajPohybZviera(pes, "rýchlo");

        Pes yorkie = new Pes("Yorkšírsky teriér", 15);
        vykonajPohybZviera(yorkie, "rýchlo");
        Pes retriever = new Pes("Labradorský retríver", 65, "Ovisnuté", "Plavec");
        vykonajPohybZviera(retriever, "pomaly");

        Pes vlk = new Pes("Vlk", 40);
        vykonajPohybZviera(vlk, "pomaly");

        Ryba zlatka = new Ryba("Zlatá rybka", 0.25, 2, 3);
        vykonajPohybZviera(zlatka, "rýchlo");
    }

    public static void vykonajPohybZviera(Zviera zviera, String rychlost) {
        zviera.vydajZvuk();
        zviera.pohyb(rychlost);
        System.out.println(zviera);
        System.out.println("________");
    }

    public static void triedyUloha8() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

    public static void triedyUloha7() {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

    public static void triedyUloha6() {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public static void triedyUloha5() {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    public static void pojo() {
        //record
        for (int i = 1; i <= 5; i++) {
            LPAStudent a = new LPAStudent("S92300" + i, switch (i) {
                case 1 -> "Jožo";
                case 2 -> "Martin";
                case 3 -> "Palo";
                case 4 -> "Jano";
                case 5 -> "Stevo";
                default -> "Anonym";
            }, "31/07/2001", "Java Masterclass");
            System.out.println(a);
        }

        Student pojoStudent = new Student("S923006", "Peto", "30/07/2000", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Pavol", "30/07/2000", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829"); //record je nemenny

        System.out.println(pojoStudent.getName() + " chodi na hodiny " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " chodi na hodiny " + recordStudent.classList());

        /*
        //pojo
        for (int i = 1; i <= 5; i++) {
            Student b = new Student("S92300" + i, switch (i) {
                case 1 -> "Jožo";
                case 2 -> "Martin";
                case 3 -> "Palo";
                case 4 -> "Jano";
                case 5 -> "Stevo";
                default -> "Anonym";
            }, "31/07/2001", "Java Masterclass");
            System.out.println(b);
        }
        */
    }

    public static void triedyUloha4() {
        Customer uzivatel1 = new Customer("Stevo" , 100, "stevo@crevo.sk");
        System.out.println(uzivatel1.getName());
        System.out.println(uzivatel1.getCreditLimit());
        System.out.println(uzivatel1.getMail());

        Customer uzivatel2 = new Customer();
        System.out.println(uzivatel2.getName());
        System.out.println(uzivatel2.getCreditLimit());
        System.out.println(uzivatel2.getMail());

        Customer uzivatel3 = new Customer("Stevo", "stevo@crevo.sk");
        System.out.println(uzivatel3.getName());
        System.out.println(uzivatel3.getCreditLimit());
        System.out.println(uzivatel3.getMail());
    }

    public static void triedyUloha3() {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public static void triedyUloha2() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    public static void triedyUloha1() {
        //Ucet ucet1 = new Ucet(1, 0.0, "Palo Knedla", "paloknedla@gmail.com", "0987654321");
        Ucet ucet1 = new Ucet();
        /*
        Ucet ucet1 = new Ucet();
        ucet1.setCisloUctu(1);
        ucet1.setZostatok(0.0);
        ucet1.setMeno("Palo Ščerba");
        ucet1.setMail("paloscerba@nedostal.protein");
        ucet1.setCislo("0912345678");
        */

        ucet1.vklad(10);
        ucet1.vyber(5);

        Ucet ucet2 = new Ucet("Stevo", "stevo@gmail.com", "0901234567");
        System.out.println("Cislo uctu: "+ ucet2.getCisloUctu() +
                "; meno: " + ucet2.getMeno());
    }

    public static void triedyZaciatok() {
        Car auto = new Car();

        auto.setMake("Bugatti");
        auto.setModel("Revuelto");
        auto.setDoors(2);
        auto.setConvertible(false);
        auto.setColor("blue");

        auto.describeCar();
        System.out.println(auto.getMake());
        System.out.println(auto.getModel());
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 6 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) return -1;

        double plochaNaMalovanie = width * height;
        double potrebujemNamalovat = plochaNaMalovanie - (extraBuckets * areaPerBucket);
        int pocetKyblov = (int) Math.ceil(potrebujemNamalovat / areaPerBucket);

        return pocetKyblov > 0 ? pocetKyblov : 0;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) return -1;

        int pocetKyblov = (int) Math.ceil(width * height / areaPerBucket);

        return pocetKyblov;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) return -1;

        int pocetKyblov = (int) Math.ceil(area / areaPerBucket);

        return pocetKyblov;
    }

    public static void inputThenPrintSumAndAverage() {
        int sucet = 0, pocet = 0;
        long priemer = 0;

        while (true) {
            try {
                int vstupCislo = Integer.parseInt(sc.nextLine());
                pocet++;
                sucet += vstupCislo;
                priemer = Math.round((double) sucet/pocet);
            } catch (NumberFormatException e) {
                break;
            }
        }

        System.out.println("SUM = " + sucet + " AVG = " + priemer);
    }

    public static void minMaxChallenge(){
       double max = 0;
       double min = 0;
       int pocetOpakovani = 0;

       while (true) {
           System.out.println("Napiš čislo alebo charakter pre zrušenie");
           try {
               double cislo = Double.parseDouble(sc.nextLine());
               if (cislo > max) max = cislo;
               if (cislo < min) min = cislo;
               pocetOpakovani++;
           } catch (NumberFormatException e) {
               break;
           }
       }

       if (pocetOpakovani > 0) {
           System.out.println("min = " + min + " max = " + max);
       } else {
           System.out.println("Žiadne spravne data");
       }
    }

    public static void kotrolaVstupu() {
        Scanner sc = new Scanner(System.in);
        int pocet = 1;
        double sucet = 0;
        double cislo;

        do {
            System.out.println("Napíš #" + pocet + " číslo.");
            try {
                cislo = Double.parseDouble(sc.nextLine());
                pocet++;
                sucet += cislo;
            }catch (NumberFormatException e) {
                System.out.println("Toto neni číslo");
            }
        } while (pocet <= 5);

        System.out.println("Sucet: " + sucet);
    }

    public static void vstupyOdUzivatela(){
        Scanner sc = new Scanner(System.in);
        String vstup = sc.nextLine();
        System.out.println(vstup);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);

        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            printDigitWord(digit);
            reversedNumber /= 10;
        }

        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            printDigitWord(0);
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        int isNegative = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed * isNegative;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    private static void printDigitWord(int digit) {
        switch (digit) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;

        int sucet = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sucet += i;
            }
        }

        return sucet == number;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int nsd = 1;
        int smaller = Math.min(first, second);

        for (int i = 1; i <= smaller; i++) {
            if (first % i == 0 && second % i == 0) {
                nsd = i;
            }
        }

        return nsd;
    }

    public static void printFactors(int number) {
        if (number < 1) System.out.println("Invalid Value");

        int cislo = 1;
        while (cislo <= number+1) {
             if (number % cislo == 0) System.out.println(cislo);
             cislo++;
        }
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int posledneCislo1 = num1 % 10;
        int posledneCislo2 = num2 % 10;
        int posledneCislo3 = num3 % 10;

        return (posledneCislo1 == posledneCislo2 ||
                posledneCislo1 == posledneCislo3 ||
                posledneCislo2 == posledneCislo3);
    }

    public static boolean hasSharedDigit(int prveCislo, int druheCislo) {
        if (((prveCislo < 10) || (prveCislo > 99)) || ((druheCislo < 10) || (druheCislo > 99))) return false;

        int tempNum1 = prveCislo;
        while (tempNum1 > 0) {
            int digit1 = tempNum1 % 10;
            int tempNum2 = druheCislo;
            while (tempNum2 > 0) {
                int digit2 = tempNum2 % 10;
                if (digit1 == digit2) {
                    return true;
                }
                tempNum2 /= 10;
            }
            tempNum1 /= 10;
        }

        return false;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int sucet = 0;

        while (number > 0) {
            int cislo = number % 10;
            if (cislo % 2 == 0) sucet += cislo;
            number /= 10;
        }

        return sucet;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int posledneCislo = number % 10;

        int prveCislo = number;
        while (prveCislo >= 10) {
            prveCislo /= 10;
        }

        return prveCislo + posledneCislo;
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;

        int temp = Math.abs(number);
        int reverse = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }

        return reverse == Math.abs(originalNumber);
    }

    public static void eMethod(int hodnota) {
        switch (hodnota) {
            case 1 :
                int i = 5;
                break;
            default:
                i = hodnota;
                System.out.println(i);
                break;
        }
    }

    public static boolean isOdd(int cislo) {
        if (cislo < 0) return false;
        else return cislo % 2 == 1;
    }

    public static int sumOdd(int zaciatok, int koniec) {
        if ((zaciatok > koniec) || (zaciatok <= 0) || (koniec <= 0)) return -1;
        int sucet = 0;
        for (int i = zaciatok; i <= koniec; i++) {
            if (isOdd(i)) sucet += i;
        }
        return sucet;
    }

    public static void forSDvomaPodmienkami() {
        int pom = 0;
        for (int i = 0; pom < 3 && i < 10; i++) {
            System.out.println(pom++);
        }
    }

    public static int getDaysInMonth(int mesiac, int rok) {
        if ((mesiac > 12) || (mesiac < 1)) return -1;
        if ((rok > 9999) || (rok < 1)) return -1;
        return switch (mesiac) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if (isLeapYear(rok)) yield 29;
                else yield 28;
            }
            default -> -1;
        };
    }

    public static void printNumberInWord(int cislo) {
        String cisloText = switch (cislo) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(cisloText);
    }

    public static void denVTyzdni(int cisloDna) {
        String den = switch (cisloDna) {
            case 1 -> {yield "Pondelok";} //možný zápis
            case 2 -> "Utorok";
            case 3 -> "Streda";
            case 4 -> "Štvrtok";
            case 5 -> "Piatok";
            case 6 -> "Sobota";
            case 7 -> "Nedela";
            default -> "Neexistujuci deň";
        };
        System.out.println(den);
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ Section 5 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public static boolean isCatPlaying(boolean jeLeto, int teplota) {
        //int max = jeLeto ? 45 : 35;
        if (jeLeto && ((teplota >= 25) && (teplota <= 45))) return true;
        else if (!jeLeto && ((teplota >= 25) && (teplota <= 35))) return true;
        else return false;
    }

    public static void printEqual(int x, int y, int z) {
        if ((x < 0) || (y < 0) || (z < 0)) {
            System.out.println("Invalid Value");
            return;
        } else if ((x == y) && (z == x)) {
            System.out.println("All numbers are equal");
        } else if ((x != y) && (y != z) && (z != x)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long celeDni = minutes / (60 * 24);
        long roky = celeDni / 365;
        long ostatneDni = celeDni % 365;
        System.out.println(minutes + " min = " + roky + " y and " + ostatneDni + " d");
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return 3.14159*radius*radius;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) return -1;
        return x*y;
    }

    public static boolean hasTeen(int prve, int druhe, int tretie) {
        return isTeen(prve) || isTeen(druhe) || isTeen(tretie);
    }

    public static boolean isTeen(int vek) {
        return (vek >= 13) && (vek <= 19);
    }

    public static boolean hasEqualSum(int prve, int druhe, int tretie) {
        return prve+druhe==tretie;
    }

    public static boolean areEqualByThreeDecimalPlaces(double prve, double druhe) {
        int prvyInt = (int)(prve*1000);
        int druhyInt = (int)(druhe*1000);

        return prvyInt==druhyInt;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        if ((year%4==0) && (year%100!=0)) return true;

        if ((year%100==0) && (year%400==0)) return true;

        return false;
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) return false;
        if (barking && ((hourOfDay < 8) || (hourOfDay > 22))) return true;
        return false;

        //return barking && ((hourOfDay > 0) && (hourOfDay < 23));
        /*
        return (hourOfDay >= 0 && hourOfDay <= 23)
                && barking
                && (hourOfDay < 8 || hourOfDay > 22);
         */
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String vysledok = "" + kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h";
        System.out.println(vysledok);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;

        double vysledok = kilometersPerHour / 1.609;
        long vysledokLong = Math.round(vysledok);
        return vysledokLong;
        //return Math.round(kilometersPerHour * 0.621371192); //Math.round vrati long

        //return (kilometersPerHour < 0) ? -1 : Math.round(kilometersPerHour * 0.621371192);

    }

    public static String divocina() {
        String divocina = "divocina";
        return divocina;
    }
}