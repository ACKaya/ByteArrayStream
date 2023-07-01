import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
   //     byte [] arr={1,2,3,50,32,54,23,13,42};
     //   ByteArrayInputStream byteArrayIn= new ByteArrayInputStream(arr);
        String str="Popeyes";
        byte[] arr2=str.getBytes();
        ByteArrayOutputStream byteArrayOut=new ByteArrayOutputStream();
        try {

            byteArrayOut.write(arr2);
            System.out.println("CIKTI : "+ byteArrayOut.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*int i=byteArray.read();
        while(i!=-1){
            System.out.println(i);
            i=byteArray.read();
        }
        try {
            byteArray.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


    }
}
