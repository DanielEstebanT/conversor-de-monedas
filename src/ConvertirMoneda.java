import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaAConvertir, ConsultarMoneda consulta, Scanner teclado){
        double valor;
        double valorConvertido;

        Moneda moneda = consulta.buscarMoneda(monedaBase,monedaAConvertir);
        System.out.println("Ingrese la cantidad de " + monedaBase +" que desea convertir");
        valor = Double.parseDouble(teclado.nextLine());
        valorConvertido = valor * moneda.conversion_rate();
        System.out.println(valor+" "+monedaBase+" = " + valorConvertido +" "+ moneda.target_code());
        System.out.println("""
                Esto teniendo en cuenta que la tasa de conversion actual es:
                1 %s = %s %s
                """.formatted(monedaBase,moneda.conversion_rate(),monedaAConvertir));
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner teclado){
        System.out.println("Ingrese el codigo de la moneda base");
        String monedaBase = teclado.nextLine().toUpperCase();
        System.out.println("Ingrese el codigo de la moneda a la cual desea convertir");
        String monedaAConvertir = teclado.nextLine().toUpperCase();
        convertir(monedaBase,monedaAConvertir,consulta,teclado);
    }
}
