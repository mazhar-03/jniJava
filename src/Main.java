public
    class Main {
    static{
        System.loadLibrary("libjniHome");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.processInt(31));
    }
    public native int processInt(int iVal);
}
