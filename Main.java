import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student Giovanni = new Student("Giovanni", 34);
        Student Laura = new Student("Laura", 27);
        List<Student> listaStudenti = new ArrayList<>(Arrays.asList(Giovanni, Laura));
        System.out.println(listaStudenti);
        Student Paolo = new Student("Paolo",31);
        Student Carlo = new Student("Carlo",20);
        Student Fabrizio = new Student("Fabrizio",36);
        Student Mario = new Student("Mario",25);
        listaStudenti.add(Paolo);
        listaStudenti.add(Carlo);
        listaStudenti.add(Fabrizio);
        listaStudenti.add(Mario);

        System.out.println(listaStudenti);
    }
}

//che accetti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console