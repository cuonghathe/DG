import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
//        Triangle t1 = new Triangle("red",7.6,5.5);
//        t1.showof();
//        circle c1 = new circle("xc",56);
//        c1.showof();

        try {
            DataOutputStream Dos = new DataOutputStream(new FileOutputStream("B1.txt"));
            DataInputStream Dis = new DataInputStream(new FileInputStream("B1.txt"));
            int n1 = 3;
            int n2 = 4;
            Dos.writeInt(n1);
            Dos.writeInt(n2);
            Dos.close();

            int tong = n1 + n2;
            int tich = n1 * n2;

            System.out.println("N1: " + Dis.readInt());
            System.out.println("N2: " + Dis.readInt());
            System.out.println("Tổng: " + tong);
            System.out.println("Tích: " + tich);


        } catch (FileNotFoundException e) {
            System.out.printf("file khoong ton tai");
        } catch (IOException ex) {
            System.out.printf("file khoong doc duoc");
        }

        Thread Tr1 = new Thread1();
        Tr1.run();
    }



}