package view;
import controller.FatorialController;
public class Principal {
    public static void main(String[] args) {
        FatorialController fc = new FatorialController();

        int res = fc.CalcFatorial(3);

        System.out.println(res);


    }
}
