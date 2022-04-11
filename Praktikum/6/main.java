public class main {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(40, 4);
        PersegiPanjang pp2 = new PersegiPanjang(35.9, 3.5);
        System.out.println("Persegi Panjang 1");
        System.out.println("Panjang : " + pp1.getPanjang());
        System.out.println("Lebar : " + pp1.getLebar());
        System.out.println("Luas : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());
        System.out.println("");

        System.out.println("Persegi Panjang 2");
        System.out.println("Panjang : " + pp2.getPanjang());
        System.out.println("Lebar : " + pp2.getLebar());
        System.out.println("Luas : " + pp2.getLuas());
        System.out.println("Keliling : " + pp2.getKeliling());

        SegitigaSikuSiku ss1 = new SegitigaSikuSiku();
        SegitigaSikuSiku ss2 = new SegitigaSikuSiku(3, 4);
        System.out.println("Segitiga Siku- Siku 1");
        System.out.println("Alas : " + ss1.getAlas());
        System.out.println("Tinggi : " + ss1.getTinggi());
        System.out.println("Miring : " + ss1.getMiring());
        System.out.println("Luas : " + ss1.getLuas());
        System.out.println("Keliling : " + ss1.getKeliling());
        System.out.println("");

        System.out.println("Segitiga Siku- Siku 2");
        System.out.println("Alas : " + ss2.getAlas());
        System.out.println("Tinggi : " + ss2.getTinggi());
        System.out.println("Miring : " + ss2.getMiring());
        System.out.println("Luas : " + ss2.getLuas());
        System.out.println("Keliling : " + ss2.getKeliling());

        Fish f1 = new Fish("Amber", "AngelFish", 5);
        Fish f2 = new Fish("James", "Guppy", 3);
        System.out.println("Ikan 1");
        System.out.println("Nama : " + f1.name);
        System.out.println("Tipe : " + f1.typeOfFish);
        System.out.println("Friendliness : " + f1.friendliness);
        System.out.println("");
        System.out.println("Ikan 2");
        System.out.println("Nama : " + f1.name);
        System.out.println("Tipe : " + f2.typeOfFish);
        System.out.println("Friendliness : " + f2.friendliness);
        System.out.println("");

        Fish siPalingFriendly = f1.nicestFish(f1, f2);
        System.out.println("Ikan paling friendly");
        System.out.println("Nama : " + siPalingFriendly.name);
        System.out.println("Tipe : " + siPalingFriendly.typeOfFish);
        System.out.println("Friendliness :" + siPalingFriendly.friendliness);
    }
}
