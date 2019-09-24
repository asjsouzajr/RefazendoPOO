package guanabara_polimorfismo;

public class Ave extends Animal {
	private String corPena;
    public void fazerNinho(){
        System.out.println("Ninho feito");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhocas e insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
