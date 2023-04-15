package virado.no.jiray.javacore.Fmodificarestatico.mains;

import virado.no.jiray.javacore.Fmodificarestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 180);
        Carro carro2 = new Carro("Mercedes", 220);
        Carro carro3 = new Carro("Ferrari", 240);

        Carro.velocidadeLimite = 180;
        carro.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
