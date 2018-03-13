class Min {

    public static int foundMin(int[] tableau) {
        int min = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

}
