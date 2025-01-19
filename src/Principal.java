import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();


        int opcion = 0;

        while (opcion !=8){
            System.out.println("""
                    BIENVENIDO AL CONVERSOR DE MONEDAS
                    DIGITE LA OPCION QUE DESEA REALIZAR:
                    1. Dolar => Peso argentino
                    2. Peso argentino => Dolar
                    3. Dolar => Real Brasileño
                    4. Real Brasileño => Dolar
                    5. Dolar => Peso colombiano
                    6. Peso colombiano => Dolar
                    7. Convertir otro tipo de moneda
                    8. Salir
                    """);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD",consulta,teclado);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,teclado);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,teclado);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,teclado);
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
                    break;

            }
        }
    }
}
