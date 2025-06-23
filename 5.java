class main{
    public static void main(String[] args) {
        
        int x=10;
        int y=20;
       

        if (x < y) {
            for (int i = 10 + 1; i < y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 10 - 1; i > y; i--) {
                System.out.println(i);
            }
        }
    }
}
