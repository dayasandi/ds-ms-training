package virado.no.jiray.javacore.Aintroducaoclasses.mains;

import virado.no.jiray.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Uno";
        carro1.modelo = "Fiat";
        carro1.ano = 2020;

        carro2.nome = "Veloster";
        carro2.modelo = "Hyundai";
        carro2.ano = 2022;

        carro1 = carro2;

        System.out.println("Temos dois carros primeiro carro é um: " + carro1.nome + " modelo: " + carro1.modelo + " ano: "+ carro1.ano +
           "\nSegundo carro é um: " + carro2.nome + " modelo: " + carro2.modelo + " ano: " + carro2.ano
        );
    }
}
