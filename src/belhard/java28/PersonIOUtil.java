package belhard.java28;

import java.io.*;
import java.util.ArrayList;

public class PersonIOUtil {
    public PersonIOUtil() {
    }

    public static void writePersons (String fileName, ArrayList<Person> list) {
        try (FileOutputStream fos = new FileOutputStream ( fileName )) {
            ObjectOutputStream oos = new ObjectOutputStream ( fos );
//            for (Person person : list) {
//                oos.writeObject ( person );
//            }
            oos.writeObject ( list );
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
    public static ArrayList<Person> readPersons (String fileName) throws IOException {
        FileInputStream fis = new FileInputStream ( fileName );
        try (ObjectInputStream ois = new ObjectInputStream ( fis )) {
            ArrayList<Person> list = new ArrayList<> ();
            return list = (ArrayList<Person>) ois.readObject ();
        } catch (EOFException e) {
            System.out.println (new EmptySourceFileException ( "Файл пустой" ));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println (new EmptySourceFileException ( "Файл не найден" ));
        }
        return null;
    }
}
