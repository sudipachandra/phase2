package apis;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestCalls {
    public static String[] getRequest(String _url) throws  Throwable{
        String[] returnItems= new String[2];
        URL url = new URL(_url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
//        connection.setRequestProperty("User-Agent","PostmanRuntime/7.28.4");
        connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.61 Safari/537.36.");
        int responseCode =connection.getResponseCode();
        System.out.println(responseCode);
        returnItems[0]=""+responseCode;

        //reading resposne
        InputStream inStream =connection.getInputStream();
        InputStreamReader streamReader = new InputStreamReader(inStream);
        BufferedReader br = new BufferedReader(streamReader);
        //System.out.println(br.readLine());
        returnItems[1]=br.readLine();
        return returnItems;
    }

    public static String postRequest(String _url,String _payload) throws  Throwable{
        URL url = new URL(_url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent","JavaCode");

        //put payload
        connection.setDoOutput(true);
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(_payload.getBytes());
        outputStream.flush();

        int responseCode =connection.getResponseCode();
        System.out.println(responseCode);

        //reading resposne
        InputStream inStream =connection.getInputStream();
        InputStreamReader streamReader = new InputStreamReader(inStream);
        BufferedReader br = new BufferedReader(streamReader);
        return br.readLine();
    }


    public static void main(String[] args) throws Throwable {
        //REST API
        // LIST USERS
        //url ==https://reqres.in/api/users?page=2
        //GET
        System.out.println(getRequest("https://reqres.in/api/users?page=2"));

        //POST
        String payload="{" +
                "    \"name\": \"morpheus\"," +
                "    \"job\": \"leader\"" +
                "}";
        System.out.println(postRequest("https://reqres.in/api/users",payload));

        System.out.println(getRequest("https://www.swiggy.com/dapi/restaurants/search/v2_2?lat=28.6862738&lng=77.2217831&trackingId=a6fd6353-41ec-1449-4977-9d781ad88a9c&str=Pizza&withMenuItems=true&sld=false&non_partner_search=false&submitAction=SUGGESTION&metadata=%7B%22type%22%3A%22suggestV1_tag_V1%22%2C%22data%22%3A%7B%22subType%22%3A%22DISH%22%2C%22vegIdentifier%22%3A%22NA%22%2C%22cloudinaryId%22%3A%22isaihr9c3lyyf7ml7opi%22%2C%22dishFamilyId%22%3A%22846647%22%7D%7D")[1]);

    }
}
