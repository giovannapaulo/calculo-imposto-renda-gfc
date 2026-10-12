public class CalculoIR {

    public String calcularIR(double rendimento) {
        if (rendimento < 0) {
            return "Erro: Rendimento inválido";
        } else if (rendimento <= 5000.00) {
            return "Isenção total";
        } else if (rendimento <= 5500.00) {
            return "Desconto de 75%";
        } else if (rendimento <= 6000.00) {
            return "Desconto de 50%";
        } else if (rendimento <= 6500.00) {
            return "Desconto de 25%";
        } else if (rendimento <= 7350.00) {
            return "Desconto de 10%";
        } else {
            return "Alíquota 27,5%";
        }
    }
}