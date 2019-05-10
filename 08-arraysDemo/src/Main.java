public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Zeki";
        String ogrenci2 = "Ali";
        String ogrenci3 = "Veli";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("--------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Zeki";
        ogrenciler[1] = "Ali";
        ogrenciler[2] = "Veli";
        ogrenciler[3] = "Ahmet";
        //ogrenciler[4] = "Mehmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
