public class AparelhoTelefonico implements Iphone {

    

    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("ligação atendida");
    }
    
    public void iniciarCorreioVoz(){
        System.out.println("ouviando correio de voz");
    }

    @Override
    public void play() {
        this.iniciarCorreioVoz();
    }
}
