package PBO;

import java.util.Scanner;

// Class MonitorBeraksi untuk mengelola data monitor
public class MonitorBeraksi {
    public static void main(String[] args) {
        try {
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            // Array untuk menyimpan data monitor
            Monitor[] monitors = new Monitor[2];

            for (int i = 0; i < monitors.length; i++) {
                System.out.println("Masukkan data Monitor " + (i + 1));
                System.out.print("Brand: ");
                String brand = scanner.nextLine();
                System.out.print("Size: ");
                String size = scanner.nextLine();

                // Objek MonitorDetail (sebagai turunan Monitor)
                monitors[i] = new MonitorDetail(brand, size);
            }

            // Perulangan untuk menampilkan data monitor
            for (Monitor monitor : monitors) {
                System.out.println("================");
                System.out.println("Data Monitor:");
                System.out.println(monitor.displayInfo());
            }

        } catch (Exception e) {
            System.out.println("Salah: " + e.getMessage());
        }
    }
}
