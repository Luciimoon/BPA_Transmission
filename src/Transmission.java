import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Transmission {
    File file = new File("communications.txt");
    static String message = "";



        public static void main(String[] args) throws Exception {
            int ascii_check = 0;
            File file=new File("/home/compsci/IdeaProjects/BPA thing/src/communications.txt");
            Scanner sc=new Scanner(file);
            message = sc.nextLine();
            while(sc.hasNextLine()){

                System.out.println(sc.nextLine());
            }
            System.out.println(message);
            System.out.println("Transmission " + message.substring(0,3) + " confirmed");




            String Code_Message_length = message.substring(10,13);
           // System.out.println(Code_Message_length);
            String Isolated_Message = message.substring(14,message.length()-5);
           // System.out.println(Isolated_Message.length());
            if (Integer.parseInt(Code_Message_length) != Isolated_Message.length() {
                System.out.println("Length error");
                System.exit(0);
            }






             for (int i = 0;Isolated_Message.length() > i;i++) {

                char character = Isolated_Message.charAt(i);
                int ascii = (int) character;
                 ascii_check = ascii_check + ascii;

            }
            System.out.println(ascii_check);

        }



        }




/*
    Character[] Message_Char =
            Isolated_Message.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
            System.out.println(Arrays.toString(Message_Char));

 */