public class Pascal {
        public static void print(int b) {
            for(int i=0; i< b; i++ ) {
                for(int j =0; j<=i; j++) {
                    System.out.print(pascal(i,j) + " ");
                }
                System.out.println();
            }
        }

        public static int pascal(int i, int j) {
            if (j == 0 || i == j) {
                return 1;
            } else {
                return pascal(i - 1, j - 1) + pascal(i - 1, j);
            }
        }
}
