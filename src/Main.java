import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Qual forma de criptografia você gostaria de utilizar ?");
        System.out.print("1 - Criptografia de César\n2 - Criptografia Hash\n3 - Sair\nR: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Iniciando criptografia de César...");
                Timer(500);
                cesar();
                break;
            case 2:
                System.out.println("Iniciando criptografia hash...");
                Timer(500);
                hash();
                break;
            case 3:
                tranks();
                Timer(500);
                System.out.println("Power OFF...");
                System.out.close();
                break;
            default:
                System.out.println("Opção não encontrada.");
                Timer(500);
                tranks();
                break;
        }
    }

    public static void cesar(){
        Scanner sc = new Scanner(System.in);
        CesarCipher cc = new CesarCipher();
        String mensagem; int desloc; String text = "";
        System.out.println("\nQual das opções a seguir você deseja:");
        System.out.println("1 - Encriptografar Mensagem");
        System.out.print("2 - Descriptografar mensagem\nR: ");
        int option = sc.nextInt();
        Timer(500);
        switch (option){
            case 1:
                System.out.print("Qual seria a mensagem que você quer encriptografar ?\nMessage: ");
                mensagem = sc.next();
                System.out.println("E o deslocamento ? ");
                desloc = sc.nextInt();
                System.out.println("Encriptando...");
                text = String.valueOf(cc.Encript(mensagem, desloc));
                Timer(1000);
                System.out.println("Mensagem Encriptografada:");
                break;
            case 2:
                System.out.print("Qual seria a mensagem que você quer Descriptografar ?\nMessage: ");
                mensagem = sc.next();
                System.out.println("E o deslocamento ? ");
                desloc = sc.nextInt();
                System.out.println("Descriptando...");
                text = String.valueOf(cc.Decript(mensagem, desloc));
                Timer(1000);
                System.out.println("Mensagem Descriptografada:");
                break;
            default:
                System.out.println("Opção não encontrada, tente novamente...");
                Timer(500);
                cesar();
                break;
        }
        System.out.println(text + "\n");
        tranks();
    }

    public static void hash() throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        HashCipher hash = new HashCipher();
        System.out.print("Qual seria a mensagem que você quer encriptografar ?\nMessage: ");
        String mensagem = sc.next();
        System.out.println("Encriptando...");
        String text = String.valueOf(hash.Encript(mensagem));
        Timer(1000);
        System.out.println("Mensagem Encriptografada:");
        System.out.println(text + "\n");
        tranks();
    }

    public static void tranks(){
        Timer(500);
        System.out.println("Obrigado por utilizar nossos serviços!");
        System.out.println("Até Breve!");
    }

    public static void Timer(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}