package edu.ljodi937.weatherapi;
import java.io.*;
import java.net.*;
/**
 *
 * @author jodic
 */
public class Main {
  public static void main(String[] args) throws Exception{
      URL weather = new URL("http://api.openweathermap.org/data/2.5/weather?q=Chatham&appid=7b2eea32adfd6ad3fe73ff7221c45daa");
      URLConnection yc = weather.openConnection();
      
      InputStream inStream = yc.getInputStream();
      InputStreamReader inStreamReader= new InputStreamReader(inStream);
      BufferedReader in = new BufferedReader(inStreamReader);
      String inputLine;
      while((inputLine=in.readLine())!=null){
          System.out.println(inputLine);
      }
      in.close();
  }   
}
