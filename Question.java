/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author Μάγδα Πατσιάγγουρα Κώστας Πατσάρας
 */
public class Question {
    private int id;
    private String category;
    private String question; // The question as a String
    //private boolean hasPicture; //true if image is included
    public Question(int i, String q, String c){
        id = i;
        question = new String(q);
        category = new String(c);
    }
    public int getId(){
        return id;
    }
    public String getCategory(){
        return category;
    }
    public String getQuestion(){
        return question;
    }

}
