package CwiczeniaZJavaPodstawyHelion;

/**
 * Created by Kasia on 2017-05-21.
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //Ustawienie stóp oprocentowania na wartosci w przedziale 10-15 %.
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }
        double[][] balances = new double[NYEARS][NRATES];

        //Ustawienie sald początkowych na 10 000.
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000;
        }
        //Obliczanie odetek dla przyszłych lat.
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {

                //Pobieranie sald z minionego roku z poprzedniego wiersza.
                double oldBalance = balances[i - 1][j];

                //Obliczanie odsetek.
                double interest = oldBalance * interestRate[j];

                //Obliczanie tegorocznego salda.
                balances[i][j] = oldBalance + interest;
            }
        }
        //Wydruk jednego wiersza stóp oprocentowania.
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();

        //Wydruk tabeli sald.
        for (double[] row : balances) {
            //Wydruk wiersza tabeli.
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}




