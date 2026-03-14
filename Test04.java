public class Test04 {
    public static void main(String[] args) {
        int size = 7;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int minDistance = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                int value = (size / 2) - minDistance + 1;
                System.out.print(value);
                if (j < size - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
