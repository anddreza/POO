package Aula03.Aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.print("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
        // this é o nome do objeto que chamou
        // this é uma propria referencia ao objeto que chamou
    }

    void destampar(){
        this.tampada = false;
    }
}
