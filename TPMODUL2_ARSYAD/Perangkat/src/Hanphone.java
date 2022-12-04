public class Handphone extends Perangkat {
    protected boolean fingerprint; // atribut

    //constructor
    public Handphone(String drive, int ram, float processor){
        super(drive, ram, processor)
        this.fingerprint = fingerprint;
    }
    
    // overriding method informasi dari class Perangkat
    @Override
    public void informasi() {
        // TODO Auto-generated method sub
        System.out.println("INI ADALAH PERANGKAT YANG MEMILIKI" + drive + "namun ram nya" + ram);
        System.out.println("PERANGKAT INI MEMILIKI PROCESSOR" + processor + "dengan fitur fingerprint didalamnya" + fingerprint "mantap");
    }

    // method void fingerprint
    public void Fingerprint(){
        System.out.println("PERANGKAT INI TERNYATA MEMILIKI FITUR FINGER PRINT LOHH");
    }

    // method void telfon
    public void Telfon(int no_hp){
        System.out.println("Nomor handphone hp ini adalah" + no_hp);
    }

    // method void kirimSMS1
    public void KirimSMS1(int no_hp){
        System.out.println("kirim sms ke nomor hp berikut" + no_hp);
    }

     // method void kirimSMS2
     public void KirimSMS2(int no_hp1, int no_hp2){
        System.out.println("Kamu bisa mengirim ke 2 nomor hp sekaligus" + no_hp1 + no_hp2);
    }
}
