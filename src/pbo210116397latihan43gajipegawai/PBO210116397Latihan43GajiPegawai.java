/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Gaji Pegawai
 */
package pbo210116397latihan43gajipegawai;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        GajiPegawai pegwai = new GajiPegawai();
        pegwai.setNama("Rizki Adam Kurniawan");
        pegwai.setAlamat("Jalan Semar dlm 4 No 72/66");
        pegwai.setUangTranspot(250000);
        pegwai.setUangTunjangan(300000);
        pegwai.setGajiPokok(4500000);
        pegwai.setTotalGaji(pegwai.getTotalGaji());
        pegwai.tampilData(pegwai.getNama(), pegwai.getAlamat(), 
        pegwai.getUangTranspot(), pegwai.getUangTunjangan(),
        pegwai.getGajiPokok(), pegwai.getTotalGaji());
        
    }
    
}
