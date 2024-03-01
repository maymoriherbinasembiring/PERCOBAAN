class Mahasiswa{
    String Nama;
    String NIM;
    String Prodi;
    String Angkatan;   
}
public class UASPemogramanBerorientasiObjek{
public static void main(String[] args) {
    Mahasiswa Mahasiswaku = new Mahasiswa ();
    Mahasiswaku.Nama = "MayMoriHerbinaSembiring";
    Mahasiswaku.NIM = "21040174";
    Mahasiswaku.Prodi = "TeknikInformatika";
    Mahasiswaku.Angkatan = "2021";

    System.out.println("Nama:"+Mahasiswaku.Nama);
    System.out.println("NIM:"+Mahasiswaku.NIM);
    System.out.println("Prodi:"+Mahasiswaku.Prodi);
    System.out.println("Angkatan:"+Mahasiswaku.Angkatan);

    }

}