//UMI ZUNNURAIN 13020210097

public class Test0097 {
	 public static void main(String[] args) {
        // buat instansi objek balok1 dari Class Balok() →default const.
        Balok balok1 = new Balok();

        // buat instansi objek balok2 dari Class Balok(20,35, 15)→param const.
        Balok balok2 = new Balok(20, 35, 15);

        // set nilai l = 5 dari konstruktor Balok()
        balok1.setL(5);

        // set nilai p = 25 dari konstruktor Balok()
        balok1.setP(25);

        // set nilai t = 10 dari konstruktor Balok(20,35, 15)
        balok2.setT(10);

        // panggil method info dari konstruktor Balok ()
        balok1.info();

        // panggil method info dari konstruktor Balok(20,35, 15)
        balok2.info();
    }
}

// class Balok
class Balok extends PersegiPanjang {
    int t;

    public Balok() {
        // berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass PersegiPanjang serta tinggi=15
        super();
        this.t = 15;
    }

    public Balok(int p, int l, int t) {
        // berisi nilai pada saat runtime p <- p, l <- l dari konstruktor superclass PersegiPanjang t <- t;
        super(p, l);
        this.t = t;
    }

    // buat getter setter class balok
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int volume() {
        // fungsi untuk menghitung volume balok : p x l x t
        return getP() * getL() * t;
    }

    public void info() {
        // fungsi untuk tampil nilai panjang, lebar, tinggi, Luas, dan volume balok
        System.out.println("Nilai panjang: " + getP());
        System.out.println("Nilai lebar: " + getL());
        System.out.println("Nilai tinggi: " + t);
        System.out.println("Nilai luas: " + luas());
        System.out.println("Nilai volume: " + volume());
    }
}

// class PersegiPanjang
class PersegiPanjang {
    int p, l;

    public PersegiPanjang() {
        // berisi nilai panjang=30 & lebar=20
        this.p = 30;
        this.l = 20;
    }

    public PersegiPanjang(int p, int l) {
        // berisi nilai pada saat runtime p <- p, l <- l
        this.p = p;
        this.l = l;
    }

    // buat getter setter class PersegiPanjang
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int luas() {
        // fungsi untuk menghitung luas persegi panjang : p x l
        return
		p*l;
	}
public int keliling(){
    return 2 * (p + l);
}
}