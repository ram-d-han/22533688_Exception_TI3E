package Exception;

/**
 *
 * @author RAMDHAN
 */
public class IlegalArgument {
    public String nama;
    
    public void setNama(String nama) {
        if(nama instanceof String) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama harus berupa String");
        }
    }

    public static void main(String[] args) {
        IlegalArgument exception1 = new IlegalArgument();
        
        try {
            exception1.setNama(20);
            System.out.println("Nama yang dimasukkan adalah : "+exception1.nama);
        } catch(Exception e) {
            System.out.println("Terjadi Kesalahan, input bukan String");
            System.out.println(e.getMessage());
        }
    }
    
}
