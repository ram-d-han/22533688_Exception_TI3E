package Exception;

/**
 *
 * @author RAMDHAN
 */
public class Arithmetic {
    
    public int hitung(int nilai1, int nilai2) {
        int hasil = nilai1/nilai2;
        return hasil;
    }

    public static void main(String[] args) {
        Arithmetic exception1 = new Arithmetic();
        
        try {
            exception1.hitung(40,0);
            System.out.println("Kedua nilai dapat dibagi & membagi");
        } catch(Exception e) {
            System.out.println("Terjadi kesalahan yang mengakibatkan exception");
            System.out.println("Nilai tidak bisa dibagi dengan 0, error : "+e.getMessage());
        }
    }
    
}
