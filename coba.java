import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        //input jumlah data
        System.out.print("Masukkan jumlah objek: ");
        int objek = in.nextInt();

        product[] p = new product[objek];

        for (int i = 0; i < p.length; i++) {
            System.out.print("Masukkan nomor: ");
            int number = in.nextInt();
            System.out.print("masukkan nama: ");
            String nama = in.next();
            System.out.print("quantity: ");
            int quantity = in.nextInt();
            System.out.print("price: ");
            double price = in.nextDouble();
            p[i] = new product(number, nama, quantity, (int) price);
            p[i].print();
        }
        p[1] = new product();
        cd[] c = new cd[5];
        c[4] = new cd();

        
    }  
}
