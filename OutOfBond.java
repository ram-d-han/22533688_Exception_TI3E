package Exception;

/**
 *
 * @author RAMDHAN
 */
public class OutOfBond {
    String[] namaMahasiswa = {"Ramdhan, Hamid, Gazza"};

    public static void main(String[] args) {
        OutOfBond exception1 = new OutOfBond();
        
        try {
            String nama = exception1.namaMahasiswa[3];
            System.out.println("Nama Mahasiswa yang dipanggil adalah : "+nama);
        } catch(Exception e) {
            System.out.println("Nama mahasiswa gagal didapatkan");
            System.out.println(e.getMessage());
        }
    }
    
}
