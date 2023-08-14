package controller;

public class FatorialController {
    public FatorialController() {
        super();
    }

    public int CalcFatorial(int numero) {

        if (numero > 1) {
            return CalcFatorial(numero-1) * numero;
        }

        return 1;
    }
}
