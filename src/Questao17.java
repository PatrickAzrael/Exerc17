import java.util.Scanner;
import java.lang.Math;

public class Questao17 {
    public static void main(String[] args) {
        System.out.println("Informe a área a ser pintada (Em M²): ");
        Scanner leia = new Scanner(System.in);
        double area;
        area = leia.nextDouble();
        leia.close();
        float ll = 18;
        float pl = 80;
        double ql;
        double ap;
        double vl;

        ap = (area / 6.0) * 1.1;

        ql = Math.ceil(ap / ll);
        vl = (ql * pl);

        double lg = 3.6;
        float pg = 25;
        double qg;
        double vg;

        qg = Math.ceil(ap / lg);
        vg = (qg * pg);

        double qlm;

        qlm = (ap / ll);

        double qgm;

        qgm = Math.ceil((ap / lg) / ll);

        double ptm;

        ptm = ((qlm * pl) + (qgm * pg));

        System.out.println("Comprando apenas latas (18l), iriam ser necessárias [" + ql
                + "] latas e o valor seria de [R$ " + vl + "].");
        System.out.println("Comprando apenas galões (3,6l), iriam ser necessários [" + qg
                + "] galões e o valor seria de [R$ " + vg + "].");
        System.out.printf(
                "Misturando os galões e as latas, ficariam [%.2f] Galões de 3,6L e [%.2f] latas de 18L e o valor seria de [R$ %.2f].",
                qgm, qlm, ptm);

    }
}