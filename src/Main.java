public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camisa", 49, "Camisa polo azul");
        Produto p2 = new Produto("Calça", 99, "Calça jeans preta");

        System.out.println("Produto 1: " +
                "\n Nome: " + p1.getTipo() +
                "\n Preço: " + p1.getPreço() +
                "\n Descrição: " + p1.getDescrição());
        System.out.println("\n Produto 2: " +
                "\n Nome: " + p2.getTipo() +
                "\n Preço: " + p2.getPreço() +
                "\n Descrição: " + p2.getDescrição());
    }
}