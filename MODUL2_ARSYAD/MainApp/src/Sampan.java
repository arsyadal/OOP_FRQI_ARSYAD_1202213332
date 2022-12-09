public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void Berlabuh() {
        // TODO Auto-generated method stub
        super.Berlabuh("transportasi air jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    
    @Override
    public void Berlayar() {
        // TODO Auto-generated method stub
        super.Berlayar("Transportasi air jenis sampan sedang berlayar menggunakan" + layar);
    }   

    @Override
    public void Informasi() {
        // TODO Auto-generated method stub
        super.Informasi("Transportasi air jenis Sampan dengen kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar" + biaya);
    } 
}


    
