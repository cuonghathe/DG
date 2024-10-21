public class Thread1 extends Thread {
    public void run(){
        for (int i = 50; i < 100 ; i++){
            if (i % 2 == 0) {
                System.out.println("Thread1 - so nguyen chia het cho 2: " + i);
            }
        }
    }

}
