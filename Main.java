import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Requisito 1: Criação de uma lista polimórfica (armazena o tipo base Funcionario)
        List<Funcionario> folhaPagamento = new ArrayList<>();

        // Exemplo 1: Desenvolvedor (3000 base + 20h extras * 50.00 = 4000.00)
        Desenvolvedor dev = new Desenvolvedor("Vinicius M. Redondaro", 3000.00, "2024ADS001", 20);
        
        // Exemplo 2: Gerente (8000 base + 15% de bônus = 9200.00)
        Gerente ger = new Gerente("Elon Musk", 8000.00, "2024ADS002", 0.15);

        // Requisito 2: Adiciona os objetos concretos (Desenvolvedor e Gerente) à lista polimórfica
        folhaPagamento.add(dev);
        folhaPagamento.add(ger);
        
        System.out.println("--- Relatório da Folha de Pagamento (Análise e Desenvolvimento de Sistemas) ---");

        // Requisito 3: Laço Polimórfico - Percorrendo a lista de Funcionario
        for (Funcionario f : folhaPagamento) {
            
            // Polimorfismo em Ação: O método chamado é o mesmo (calcularSalario()), 
            // mas a implementação executada é a específica de cada subclasse (Desenvolvedor ou Gerente).
            double salarioFinal = f.calcularSalario();

            // Requisito 4: Impressão no console
            System.out.printf(
                "Funcionário: %s | Matrícula: %s | Salário Final: R$ %.2f%n", 
                f.getNome(), 
                f.getMatricula(), 
                salarioFinal
            );
        }
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Pilares da POO aplicados: Encapsulamento, Modificadores de Acesso (private/protected), Herança (extends) e Polimorfismo (classe abstrata e sobrescrita de calcularSalario()).");
    }
}
