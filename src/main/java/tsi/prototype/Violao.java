
package tsi.prototype;

public class Violao implements PrototipoModelo {
    private final String modelo;

    public Violao(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public PrototipoModelo clone() {
        return new Violao(modelo);
    }
    
}
