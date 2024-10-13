import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.net.URISyntaxException, IOException, InterruptedException {
        int day;
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дату: ");
        day = sc.nextInt();
        System.out.print("Введите месяц: ");
        month = sc.nextInt();
        String uri = "http://numbersapi.com/" + month + "/" + day + "/date";
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(uri)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response);
        System.out.println(response.body());
    }
}