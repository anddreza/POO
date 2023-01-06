package Aula03.Aula02;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        // Aqui é uma referência ao atributo
        // c1.tampada = false;
        c1.tampar();
        // Aqui é uma referência ao método
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}