public
    class Main {
    static{
        System.loadLibrary("libjniHome");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.processInt(31));
        System.out.println(main.processString("Hello Mazhar!"));
    }
    public native int processInt(int iVal);
    public native String processString(String str);
}
