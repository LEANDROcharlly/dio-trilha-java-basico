public class ReprodutorMusical implements Iphone {

    @Override
    public void play() {
        this.tocar();
    }

    public void tocar(){
        System.out.println("musica tocando");
    }

    public void pausar(){
        System.out.println("musica pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("A musica selecionada foi " + musica);
    }

}
