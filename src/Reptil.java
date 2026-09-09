public class Reptil extends Animal{
    private boolean esVenenoso;
    private boolean tienePatas;

    public Reptil(String nombre, String especie, boolean hambre, boolean salud, boolean higiene, boolean esVenenoso, boolean tienePatas) {
        super(nombre, especie, hambre, salud, higiene);
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    public boolean getEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean getTienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }

    public void tomarSol() {
        System.out.println(getNombre() + "está tomando solñ"
        );
    }

    public void mudarPiel() {

        System.out.println(getNombre() + "está mudando la piel"
        );
    }

    public void arrastrarse() {

        if (tienePatas == false) {
            System.out.println(
                    getNombre() + "se está arrastrando"
            );
        } else {
            System.out.println(getNombre() + "camina utilizando sus patas."
            );
        }
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + "emite un sonido de reptil."
        );
    }

    @Override
    public String toString() {

        return "Reptil: " + getNombre() +
                " - Especie: " + getEspecie() +
                " - Venenoso: " + esVenenoso +
                " - Tiene patas: " + tienePatas;
    }

}
