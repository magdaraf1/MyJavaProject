/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Μάγδα Πατσιάγγουρα Κώστας Πατσάρας
 */
public class Main {
    private static ArrayList<Question> questions;
    private static HashMap<Integer,String> answers;
    
    public static void main(String[] args){

    }
    
    //Η συναρτηση που θα φορτώνει τις ερωτήσεις. Για αρχή θα τις βαζουμε απευθείας στο πρόγραμμα. Ενώ στην συνέχεια 
    //θα τις φορτώνουμε απο το αρχείο.
    public static void loadQuestions(){
        questions = new ArrayList<>();
        Question q1 = new Question(1,"Πότε πήρε τελευταία φορα πρωτάθλημα ο ΠΑΟΚ;","ποδόσφαιρο");
        Question q2 = new Question(2,"Πότε πήρε τελευταία φορά το Eurobasket η εθνική μας;","μπασκετ");
        Question q3 = new Question(3,"Ποιός είναι ο τωρινός προπονητής του ΠΑΟΚ στο ποδόσφαιρο;","ποδοσφαιρο");
        Question q4 = new Question(4,"Σε ποιά χώρα βρίσκεται το Κολοσσαίο;","γεωγραφία");
        Question q5 = new Question(5,"Ποιά είναι η πρωτεύουσα της Ελβετίας;", "γεωγραφία");
        Question q6 = new Question(6,"Ποιά είναι η πρωτεύουσα της Σουηδίας;","γεωγραφία");
        Question q7 = new Question(7,"Ποιό είναι το μικρό όνομα του Καβάφη;","λογοτεχνία");
        Question q8 = new Question(8,"Ποιός από τους παρακάτω έλληνες λογοτέχνες βραβεύτηκε με παγκόσμιο βραβείο ειρήνης;","λογοτεχνία");
        Question q9 = new Question(9,"Ποιός από τους παρακάτω λογοτέχνες διετέλεσε χρέοι διπλωμάτη;","Σεφέρης λογοτεχνία");
        Question q10 = new Question(10,"Από ποια χώρα έχει καταγωγή ο κόκκινος στρατός;","ιστορία");
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        questions.add(q10);
    }
    public static void loadAnswers(){
        answers.put(1,"1985 1986 2002 1991");
        answers.put(2,"2005 2012 1977 1996");
        answers.put(3,"Ivic Muslimovich Ζαγοράκης Πετρόπουλος");
        answers.put(4,"Ιταλία Γαλλία Κίνα Κένυα");
        answers.put(5,"Βέρνη Ζυρίχη Κουπερτίνο Μομπάι");
        answers.put(6,"Στοκχλόλμη Όσλο Λουκέρνη Σόφια");
        answers.put(7,"Κώστας Πέτρος Γιάννης Νίκος");
        answers.put(8,"Καζαντζάκης Σεφερης Ελύτης Σικελιανός");
        answers.put(9,"Σεφέρης Βιζυηνός Σολωμός Μανετάς");
        answers.put(10,"Σοβιετική Ένωση Ρωσία Γερμανία Συρία");
    }
}
