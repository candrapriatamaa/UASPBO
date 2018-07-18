package sepeda;

public class Polygon extends Sepeda{
	public void tampilkan(){
		 double harga=3750000;
		 String bahan="Alloy";
		 String kategori="Sport";

		 Sepeda m = new Sepeda();

		 m.inputData("MTB", "Hitam", "CrossCountry");
		 m.tampilkandata();

		  System.out.println("harga :"+harga);
		  System.out.println("bahan :"+bahan);
		  System.out.println("jenis kategori :"+kategori);
		
	}    
}
