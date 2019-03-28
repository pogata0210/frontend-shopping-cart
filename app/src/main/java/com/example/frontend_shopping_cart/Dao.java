package com.example.frontend_shopping_cart;


public class Dao{
    private static final String serverAddress = "";
    public static final String BASE_URL = "http://10.0.2.2:8080/";
    public static final String PRODUCT_URL = BASE_URL + "/product";

    public interface ObjectCallback<T> {
        void returnObjects(T object);
    }
    /**String tokenRequest = NetworkAdapter.httpRequest(
            "http://10.0.2.2:8080/oauth/token?grant_type=password&username=lucy&password=ILuvM4th&scope=",
            "POST", null, headerProperties); **/
}

/** example 2.0 oauth
 *  public static String httpRequest(final String urlString, final String requestType, final JSONObject content, final Map<String, String> headerProperties) {
 *         String            result     = "";
 *         InputStream       stream     = null;
 *         HttpURLConnection connection = null;
 *         try {
 *             URL url = new URL(urlString);
 *             connection = (HttpURLConnection) url.openConnection();
 *             // Timeout for reading InputStream arbitrarily set to 3000ms.
 *             connection.setReadTimeout(TIMEOUT);
 *             // Timeout for connection.connect() arbitrarily set to 3000ms.
 *             connection.setConnectTimeout(TIMEOUT);
 *             // For this use case, set HTTP method to GET.
 *             connection.setRequestMethod(requestType);
 *
 *             if (headerProperties != null) {
 *                 for (Map.Entry<String, String> entry : headerProperties.entrySet()) {
 *                     connection.setRequestProperty(entry.getKey(), entry.getValue());
 *                 }
 *             }
 *
 *             // Already true by default but setting just in case; needs to be true since this request
 *             // is carrying an input (response) body.
 *             connection.setDoInput(true);
 *
 *             if (requestType.equals("POST") && content != null) {
 *                 OutputStream outputStream = connection.getOutputStream();
 *                 outputStream.write(content.toString().getBytes());
 *                 outputStream.close();
 *             } else {
 *                 // Open communications link (network traffic occurs here).
 *                 connection.connect();
 *             }
 *             //            publishProgress(DownloadCallback.Progress.CONNECT_SUCCESS);
 *             int responseCode = connection.getResponseCode();
 *             if (responseCode != HttpsURLConnection.HTTP_OK) {
 *                 result = Integer.toString(responseCode);
 *                 throw new IOException("HTTP error code: " + responseCode);
 *             }
 *             // Retrieve the response body as an InputStream.
 *             stream = connection.getInputStream();
 *             // publishProgress(DownloadCallback.Progress.GET_INPUT_STREAM_SUCCESS, 0);
 *             if (stream != null) {
 *                 // Converts Stream to String with max length of 500.
 *                 BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
 *                 StringBuilder  sb     = new StringBuilder();
 *
 *                 String line;
 *                 while ((line = reader.readLine()) != null) {
 *                     sb.append(line).append('\n');
 *                 }
 *                 result = sb.toString();
 *             }
 *         } catch (Exception e) {
 *             e.printStackTrace();
 *         } finally {
 *
 *             // Close Stream and disconnect HTTPS connection.
 *             if (stream != null) {
 *                 try {
 *                     stream.close();
 *                 } catch (IOException e) {
 *                     e.printStackTrace();
 *                 }
 *             }
 *             if (connection != null) {
 *                 connection.disconnect();
 *             }
 *
 *         }
 *         return result;
 *     }
 * }

 **/