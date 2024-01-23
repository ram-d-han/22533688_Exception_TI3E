package Exception;

/**
 *
 * @author RAMDHAN
 */
public class NullPointer {
   
    public static void main(String[] args) {
        try {
            String karakter = null;
            int panjangKarakter = karakter.length();
            System.out.println("Panjang dari karakter adalah : "+panjangKarakter);
        } catch(NullPointerException e) {
            System.out.println("Kesalahan dalam menghitung panjang karakter, karakter null");
            System.out.println(e.getMessage());
        }
    }
    
}
