import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainConApi {
    public static <numeroDeUsuario, PesoMexicano, PesoMexicanoDivisasExchange> void main(String[] args) throws IOException, InterruptedException {
        String PesoMexicano = "MXN";
        String Dolar;
        String Euro;
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Elija una opción:\n" +
                "1. Peso mexicano a Dolar\n" +
                "2. Dolar a Peso mexicano\n" +
                "3. Peso mexicano a Euro\n" +
                "4. Euro a Peso mexicano\n" +
                "5. Salir");
        var numeroDeUsuario = lectura.nextLine();

        Scanner teclado = new Scanner(System.in);

        String direccion = "https://v6.exchangerate-api.com/v6/663511018e75ef407ae55dc4/latest/USD"
                + numeroDeUsuario + "663511018e75ef407ae55dc4/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request;
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/663511018e75ef407ae55dc4/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            switch (opcion) {
                case 1:
                    System.out.println("Escriba el número a convertir: ");
                    break;
                case 2:
                    System.out.println("Escriba el número a convertir: " + PesoMexicano);
                    double valorARetirar = teclado.nextDouble();
                    boolean valorAConvertir;
                    request = null;
                    if (valorAConvertir = request.expectContinue()) {
                        System.out.println("El valor convertido es: ");
                        break;
                    }

                    String json = response.body();
                    System.out.println(response.body());

                    Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
                    System.out.println(PesoMexicano);

                    Scanner convertir = new Scanner(System.in);
                    System.out.println("Escriba la cantidad a convertir");
                    var numeroDeUsario = lectura.nextLine();

                    Object divisasEchange = null;
                    Menu  Menu1 = (Menu) divisasEchange;
                    gson.fromJson(json, PesoMexicano.getClass());
                    System.out.println(PesoMexicano);

                    new Scanner(System.in);
                    System.out.println("Escriba la cantidad a convertir");
                    lectura.nextLine();

                    String url_str = "https://v6.exchangerate-api.com/v6/663511018e75ef407ae55dc4/latest/USD";
            }
        }
    }
