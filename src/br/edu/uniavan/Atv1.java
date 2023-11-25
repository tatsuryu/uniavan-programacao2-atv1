package br.edu.uniavan;

import br.edu.uniavan.entities.Bicicleta;
import br.edu.uniavan.entities.Carro;
import br.edu.uniavan.entities.Edificio;

public class Atv1 {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("elétrica");
        Carro carro = new Carro("hatch", "alcool");
        Edificio edificio = new Edificio(1000, 4);

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
            "Edificio com area de %d e %d andares\n",
            edificio.getArea(),
            edificio.getAndares()
        );
        System.out.printf(
            "Pegada de carbono do edificio: %.2f\n",
            edificio.getCarbonFootprint()
        );
    }
}