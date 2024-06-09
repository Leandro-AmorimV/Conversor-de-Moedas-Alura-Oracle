import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Moedas convertendoMoeda(String moedaOriginal, String moedaAConverter, double valor){
        URI link = URI.create("https://v6.exchangerate-api.com/v6/4de15a14ea2ac8a1dba30f6d/pair/" + moedaOriginal + "/" +
        moedaAConverter + "/" + valor);

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(link)
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
            Moedas moedas = gson.fromJson(response.body(), Moedas.class);

            System.out.println("\n *******************************");
            System.out.println("A moeda de origem: " + moedas.getMoedaOriginal());
            System.out.println("A moeda usada para conversão: " + moedas.getMoedaAConverter());
            System.out.println("O valor requisitado para a conversão: " + valor);
            System.out.println("\n O Valor convertido: " + moedas.getValorConvertido());
            System.out.println("*******************************\n");

            return moedas;

        } catch (IOException e) {
            throw new RuntimeException("Erro IO");
        } catch (InterruptedException e) {
            throw new RuntimeException("Aplicação Interrompida");
        } catch (Exception e){
            throw new RuntimeException("Erro ao fazer a conversão");
        }

    }


}
