public class MainApp {
    // main  class
    public static void main(Stringp[ args]) throws Exception {
        System.out.println("Class Handphone");
        //pembuatan objek handphone1 dari class handphone
        Handphone hanphone1 = new Handphone(null, 8, 4, fingerprint: true)
        hanphone1.Informasi(); // pemanggilan method informasi objek handphone1
        handphone1.Fingerprint(); // pemanggilan method fingerprint objek handphone1
        handphone1.kirimSMS1(); // pemanggilan method kirimSMS1 objek handphone1
        handphone1.KirimSMS2(); // pemanggilan method kirimSMS2 objek handphone1
        System.out.println("");

        System.out.println("Class laptop");
        //pembuatan objek laptop1 dari class laptop
        Laptop laptop1 = new Laptop(null, 16, 8, true)
        laptop1.Informasi(); // pemanggilan method informasi objek laptop1
        laptop1.bukaGame(); // pemanggilan method bukaGame objek laptop1
        laptop1.kirimEmail1(); // pemanggilan method kirimEmail1 objek laptop1
        laptop1.kirimEmail2(); // pemanggilan method kirimEmail2 objek laptop1
    }
}