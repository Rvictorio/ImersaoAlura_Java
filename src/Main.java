import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

    String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
    URI endereco = URI.create(url);
       var client = HttpClient.newHttpClient();
       var request = HttpRequest.newBuilder(endereco).GET().build();
       HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
       String body = response.body();
        System.out.println(body);

        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        }
    }

