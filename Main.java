public class Main {
    public static void main(String[] args) {


        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2022);
        carro.setNumeroDePortas(4);


        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CG 160");
        moto.setAno(2021);
        moto.setTipoDeGuidao("Esportivo");

        
        System.out.println("=== Detalhes do Carro ===");
        carro.exibirDetalhes();

        System.out.println("\n=== Detalhes da Moto ===");
        moto.exibirDetalhes();
    }
}
