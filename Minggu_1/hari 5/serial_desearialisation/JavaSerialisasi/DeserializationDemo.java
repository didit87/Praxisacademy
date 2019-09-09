import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws ClassNotFoundException{
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("E:\\LATIHAN GIT\\Dev\\Latihanjava\\src\\JavaSerialisasi\\Karyawan.txt"));
			  Karyawan karyawan=(Karyawan)in.readObject();
			  System.out.println(karyawan.getNama());
			  System.out.println(karyawan.getGender());
			  System.out.println(karyawan.getTempatLahir());
			  System.out.println(karyawan.getTanggalLahir());
			  in.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  

	}
}
