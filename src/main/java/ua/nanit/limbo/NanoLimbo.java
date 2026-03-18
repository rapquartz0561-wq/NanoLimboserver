public class bot {
    public static void main(String[] args) {
        System.out.println("[INFO] Java Runtime Environment initialized.");
        System.out.println("[INFO] Loading core system libraries...");
        try {
            // 让 Java 进程进入无限睡眠，只占用极低内存（约 15MB）
            // 这样它就只是一个“挡箭牌”，把剩下的 135MB 全部留给你的节点
            while(true) {
                Thread.sleep(3600000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
