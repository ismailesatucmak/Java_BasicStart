public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Engin";
        String ogrenci2 = "Selin";
        String ogrenci3 = "Derin";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-----------------------------");

        String[] ogrenciler = new String[3];

        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";

        for (int i=0;i<ogrenciler.length;i++){

            System.out.println(ogrenciler[i]);

        }

        System.out.println("-----------------------------");

        //Bu yöntem daha kullanışlı.

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


    }
}