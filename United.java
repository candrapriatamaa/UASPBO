package sepeda;

public class United extends Sepeda {
	public void tampilkan(){
		double harga;
		String bahan;
		String kategori;

		harga=4200000;
		bahan="titanium";
		kategori="downhill";

		Sepeda m = new Sepeda();

		m.inputData("AVEIRO", "orange", "XCR");
		m.tampilkandata();

		System.out.println("harga :"+harga);
		System.out.println("bahan:"+bahan);
		System.out.println("kategori :"+kategori);
	}
}