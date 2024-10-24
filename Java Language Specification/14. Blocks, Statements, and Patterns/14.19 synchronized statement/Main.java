class Main {
    public static void main(String[] args) {
        Main t = new Main();
        // 1! thread can lock a monitor >1 time
        synchronized(t) {
            synchronized(t) {
                System.out.println("made it!");
            }
        }
    }
}