package tsi.prototype;

import java.util.Scanner;

public class Prototype {

    public static void main(String[] args) {
        FabricaViolao fabrica = new FabricaViolao();
        
        fabrica.adicionarViolao(new Violao("Clássico"));
        fabrica.adicionarViolao(new Violao("Folk"));
        fabrica.adicionarViolao(new Violao("Flet"));
        fabrica.adicionarViolao(new Violao("Jumbo"));
        fabrica.adicionarViolao(new Violao("7 Cordas"));
        fabrica.adicionarViolao(new Violao("12 Cordas"));
        fabrica.adicionarViolao(new Violao("Zero"));
        fabrica.adicionarViolao(new Violao("Duplo Zero"));
        fabrica.adicionarViolao(new Violao("Triplo Zero"));
        
        try (Scanner scanner = new Scanner(System.in)) {
            String modelo;
            do {
                System.out.println("Escolha um modelo de violão para fabricar ou digite sair:");
                fabrica.listarVioloes();
                modelo = scanner.nextLine();
                
                PrototipoModelo novoViolao = fabrica.obterPeloModelo(modelo).clone();
                if (novoViolao != null) {
                    System.out.println("Novo violão "+ novoViolao.getModelo() + " fabricado com sucesso!");
                } else {
                    System.out.println("Esta fabrica não fabrica este modelo de violão.");
                }
            } while(!modelo.equals("sair"));
        }
    }
}
