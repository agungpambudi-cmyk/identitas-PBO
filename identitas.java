import java.io.Console;

public class identitas {
	public static void main(String[] args){

		String nama,alamat,jurusan,kelas;
	
		

		//console
		Console con = System.console();

		//memasukan variabel nama, alamat, kelas, dan jurusan
		System.out.println("");
		System.out.println("PROGRAM IDENTITAS");
		System.out.println("==============================");

		System.out.println("");
		System.out.println("Masukan Nama                  : ");
		nama = con.readLine();

		System.out.println("Masukan Alamat                  : ");
		alamat = con.readLine();


        System.out.println("Masukan Kelas                 : ");
		kelas = con.readLine();

		System.out.println("Masukan Jurusan                : ");
		jurusan = con.readLine();
      
      
    

		// menampilkan isi variabel yang sudah dibuat
		System.out.println("========================");
        System.out.println("");
        System.out.println("Nama              :" + nama);
        System.out.println("Alamat              :" + alamat);
        System.out.println("kelas              :" + kelas);
         System.out.println("Jurusan              :" + jurusan);
        
       

	}
}