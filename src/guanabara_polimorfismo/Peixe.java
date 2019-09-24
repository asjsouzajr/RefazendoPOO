package guanabara_polimorfismo;

public class Peixe extends Animal{
	private String corEscama;
    public void soltarBolhas(){
        System.out.println("oooOO oooOO oooOO oooOO");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias na Água");
    }

    @Override
    public void emitirSom() {
        System.out.println("Blub blub blub");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
