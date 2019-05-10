public class Main {

    public static void main(String[] args) {
//        String sehir = "Ankara";
//        int sayi = sehir;
        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[4]);
            // } catch (Exception exception) {
//        } catch (ArrayIndexOutOfBoundsException exception) {
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Loglandı : " + exception);
        } finally {
            System.out.println("Finally çalışır.");
        }

    }
}
