package leoni;

public class iPhone {

    static class iPhoneImplementation implements reprodutorMusical, aparelhoTelefonico, navegador {

        @Override
        public void tocar() {
            System.out.println("Reprozindo a música selecionada.");
        }

        @Override
        public void pausar() {
            System.out.println("Player pausado.");
        }

        @Override
        public void selecionarMusica() {
            System.out.println("Selecione a música desejada.");
        }

        @Override
        public void ligar() {
            System.out.println("Ligando...");
        }

        @Override
        public void atender() {
            System.out.println("Ligação (duração mm:ss)");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Reproduzindo Correio de Voz.");
        }

        @Override
        public void exibirPagina() {
            System.out.println("Pagina web");
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Aba adicionada à guia de abas");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }
    }

    public static void main(String[] args) {
        iPhoneImplementation meuiPhone = new iPhoneImplementation();

        meuiPhone.selecionarMusica();
        meuiPhone.tocar();
        meuiPhone.pausar();

        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        meuiPhone.exibirPagina();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}