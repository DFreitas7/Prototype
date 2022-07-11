package tsi.prototype;

import java.util.HashMap;

public class FabricaViolao {
    private final HashMap<String, PrototipoModelo> violoes;

    public FabricaViolao() {
        this.violoes = new HashMap<>();
    }
    
    public void adicionarViolao(PrototipoModelo violao) {
        if (violoes.get(violao.getModelo()) != null) {
            System.out.println("Este violao já é feito nesta fábrica");
            return;
        }
        
        violoes.put(violao.getModelo(), violao);
    }
    
    public PrototipoModelo obterPeloModelo(String modelo) {
        return violoes.get(modelo);
    }
    
    void listarVioloes() {
        for (String modelo : violoes.keySet()) {
            System.out.println(modelo);
        }
    }
}
