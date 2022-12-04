public class Laptop extends Perangkat {
    protected boolean webcam; //atribut

    //constructor
    public Laptop(String drive, int ram, float processor, boolean webcam){
    super(drive, ram, processor, webcam);
    this.webcam = webcam;   
    }

    // overriding method informasi dari class Perangkat
    @Override
    public void informasi() {
        // TODO Auto-generated method sub
        System.out.println("INI ADALAH PERANGKAT YANG MEMILIKI" + drive + "dengan ram nya" + ram);
        System.out.println("PERANGKAT INI MEMILIKI PROCESSOR" + processor + "dengan fitur webcam didalamnya" + webcam "mantap");
    }

    // method void bukaGame
     public void bukaGame(String nama_game){
        System.out.println("BUKA GAME YANG KAMU INGINKAN!" + nama_game);
    }
    
    // method void kirimEmail1
    public void kirimEmail1(String email){
        System.out.println("KAMU YAKIN MAU MENGIRIM KE EMAIL INI?" + email);
    }
    
    // method void kirimEmail2
    public void kirimEmail2(String email1, String email2){
        System.out.println("KAMU BISA JUGA LOH MENGIIM KE DUA EMAIL SEKALIGUS" + email1 + email2);
    }
}
