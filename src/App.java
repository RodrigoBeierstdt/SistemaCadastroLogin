import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
String usuario = null;
String senha = null;
    
              while (true) {
        System.out.print("\nEscolha sua opção:\n1 - Fazer Cadastro\n2 - Fazer Login\n3 - Excluir Conta\nOpção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o nextInt()
      
            if (escolha == 1) {
                System.out.print("Digite um nome de usuário para cadastro: ");
                usuario = scanner.nextLine();
                System.out.print("Digite uma senha para cadastro: ");
                senha = scanner.nextLine();
                System.out.println("Cadastro realizado com sucesso!");
            
            } else if (escolha == 2) {
                System.out.print("Digite seu nome de usuário: ");
                String usuarioLogin = scanner.nextLine();
                System.out.print("Digite sua senha: ");
                String senhaLogin = scanner.nextLine();
                if (usuarioLogin.equals(usuario) && senhaLogin.equals(senha)) {
                    System.out.println("Login realizado com sucesso!");
                } else {
                    System.out.println("Nome de usuário ou senha incorretos.");
                }
            } else if (escolha == 3) {
                System.out.print("Digite seu nome de usuário para excluir a conta: ");
                String usuarioExcluir = scanner.nextLine();
                System.out.print("Digite sua senha para excluir a conta: ");
                String senhaExcluir = scanner.nextLine();
                if (usuarioExcluir.equals(usuario) && senhaExcluir.equals(senha)) {
                    usuario = null;
                    senha = null;
                    System.out.println("Conta excluída com sucesso!");
                } else {
                    System.out.println("Nome de usuário ou senha incorretos.");
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");

            }
        }


    }
}
        
