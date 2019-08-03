package unit3;

public class CompoundInterest {
    public static void main(String[] args){
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] interesRate = new double[NRATES];
        for (int j=0; j<interesRate.length; j++)
            interesRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];
        for (int j=0; j<balances[0].length;j++)
            balances[0][j] = 1000;

        for (int i=1; i<balances.length;i++){
            for (int j=0; j<balances[i].length;j++){
                double oldBalance = balances[i-i][j];
                double interest = oldBalance * interesRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }

        for(int j=0; j<interesRate.length;j++)
            System.out.printf("%9.0f%%", 100 * interesRate[j]);

        System.out.println();

        for (double[] row:balances){
            for (double b: row){
                System.out.printf("%10.2f", b);
            }
            System.out.println();

        }
    }
}
