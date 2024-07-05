package PBO;

// Class MonitorDetail extends Monitor adalah Inheritance/pewariasan
public class MonitorDetail extends Monitor {
    // Constructor MonitorDetail (brand, size)
    public MonitorDetail(String brand, String size) {
        super(brand, size);
    }

    //
    public int getTahunProduksi(){
        //  mengambil tahun dari angka size
        return Integer.parseInt(getSize().substring(0, 2)) + 2000;
    }
    
    public String getTipeLayar() {
        // Menentukan jenis layar berdasarkan ukuran
        int ukuran = Integer.parseInt(getSize());
        //seleksi if
        if (ukuran > 18) {
            return "LED";
        } else {
            return "Bukan LED";
        }
    }
    
    // Overriding displayInfo untuk menambahkan informasi tambahan
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Produksi: "+getTahunProduksi()+
                "\nTipe Layar: "+getTipeLayar();
    }
}
