public class Test
{
 /**
  * Método que comprueba las funcionalidades de los métodos
  * checkIndex, validIndex, lisFile y removeFile.
  */
 public void comprobacion()
 {
    MusicOrganizer organizadorMusical = new  MusicOrganizer();
    
    System.out.println("Ingresamos los elementos de la colección");
    System.out.println("rock.mp3  " + "punk.mp3  " + "heavy.mp3  " + "jazz.mp3  ");
    organizadorMusical.addFile("rock.mp3");
    organizadorMusical.addFile("punk.mp3");
    organizadorMusical.addFile("heavy.mp3");
    organizadorMusical.addFile("jazz.mp3");
    
    
    System.out.println("Nos aseguramos por pantalla si están todos los archivos (4)");
    System.out.println(organizadorMusical.getNumberOfFiles());
    
    System.out.println("Invocamos el método checkIndex que no hará nada en los índices correctos del 0 al 3"); 
    organizadorMusical.checkIndex(0);
    organizadorMusical.checkIndex(1);
    organizadorMusical.checkIndex(2);
    organizadorMusical.checkIndex(3);
    
    System.out.println("Apartir del índice 4 y para índices negativos saltará el aviso,");
    
    System.out.println("Para 4");
    organizadorMusical.checkIndex(4);
    
    System.out.println("Para -1");
    organizadorMusical.checkIndex(-1);
    
    System.out.println("Invocamos el método listFile que nos muestra el nombre del archivo en su índice correcto");
    organizadorMusical.listFile(0);
    organizadorMusical.listFile(1);
    organizadorMusical.listFile(2);
    organizadorMusical.listFile(3);
    
    System.out.println("Invocamos el método validIndex que nos muestra (no por pantalla) true o false si el índice es correcto o no"); 
    organizadorMusical.validIndex(0);
    organizadorMusical.validIndex(1);
    organizadorMusical.validIndex(2);
    organizadorMusical.validIndex(3);
    organizadorMusical.validIndex(4);
    
    System.out.println("Invocamos el método removeFile para borrar el archivo que queramos");
    organizadorMusical.removeFile(2);
    
    System.out.println("Vemos por pantalla que el archivo no está, ahora son (3)");
    System.out.println(organizadorMusical.getNumberOfFiles());
    





}
}
