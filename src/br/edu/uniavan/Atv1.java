package br.edu.uniavan;

import br.edu.uniavan.entities.Bicicleta;
import br.edu.uniavan.entities.Carro;
import br.edu.uniavan.entities.Casa;
// import br.edu.uniavan.entities.Edificio;
import br.edu.uniavan.entities.Escola;

public class Atv1 {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("elétrica");
        Carro carro = new Carro("hatch", "alcool");
        // Edificio edificio = new Edificio(1000, 4);
        Casa casa = new Casa(500, 2, 4);
        Escola escola = new Escola(1000, 3, 15);

        System.out.println(bicicleta.pedala());
        System.out.printf(
            "Pegada de carbono da bicicleta: %.2f\n",
            bicicleta.getCarbonFootprint()
        );
        System.out.println(carro.descricao());
        System.out.printf(
            "Pegada de carbono da carro: %.2f\n",
            carro.getCarbonFootprint()
        );
        System.out.printf(
            "Casa com area de %d e %d andares, onde moram %d pessoas\n",
            casa.getArea(),
            casa.getAndares(),
            casa.getNumeroDePessoas()
        );
        System.out.printf(
            "Pegada de carbono da casa: %.2f\n",
            casa.getCarbonFootprint()
        );
        System.out.printf(
            "Escola com area de %d e %d andares, com %d salas\n",
            escola.getArea(),
            escola.getAndares(),
            escola.getNumeroDeSalas()
        );
        System.out.printf(
            "Pegada de carbono da escola: %.2f\n",
            escola.getCarbonFootprint()
        );
    }
}