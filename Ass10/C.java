class C {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println("Size: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("ERROR!!");
        } finally {
            System.out.println("Checked whether NullPointerException is thrown or not!");

        }
    }
}