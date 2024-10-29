
public class TiketPesawat {
    private String nm;
    private String asaL;
    private String dst;
    private double Tiket;
    private double disk;

    public TiketPesawat(String nmInfo, String aSaL, String dst, double Tiket, double disk) {
        this.nm = nmInfo;
        this.asaL = aSaL;
        this.dst = dst;
        this.Tiket = Tiket;
        this.disk = disk;
    }

    public double hbt() {
        return Tiket - (Tiket * (disk / 100));
    }

    public double h() {
        return Tiket * (disk / 100);
    }

    public void t() {
        System.out.println("Nama Penumpang: " + nm);
        System.out.println("Asal: " + asaL);
        System.out.println("Tujuan: " + dst);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + disk + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hbt());
        System.out.println("Jumlah Diskon: " + h());
    }
}