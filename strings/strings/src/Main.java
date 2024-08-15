public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava idare eder";
        System.out.println(mesaj);
        /*
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));

        System.out.println(mesaj.concat(" Eh işte"));

        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("l"));

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); //String ("") veya char("") olabilir.
        System.out.println(mesaj.lastIndexOf('e')); //Aramaya sondan başlar ama baştan itibaren sayıyı verir.
        */

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.replace(' ','-'));

        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim()); //Boşlukları kaldırır.

    }
}