public class Main {
    public static void main(String[] args) {

        //For
        for (int i=1;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti!");

        //While
        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti!");

        //Do-While
        int j=1;
        do {
            System.out.println(j);
            j+=3;
        }while (j<15);
        System.out.println("Do-While Döngüsü Bitti!");

    }
}