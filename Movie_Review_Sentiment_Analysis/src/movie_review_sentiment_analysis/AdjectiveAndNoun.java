/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_review_sentiment_analysis;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

import java.util.HashMap;



/**
 *
 * @author User
 */
public class AdjectiveAndNoun {
    
    
    public  HashMap<String,ArrayList> Adjective  = new HashMap();
    public  HashMap<String,ArrayList> Noun = new HashMap(); ///Except from 'a you it can will if'
    public HashMap<String,ArrayList> Verb = new HashMap();
    public HashMap<String,ArrayList> AdVerb =  new HashMap();
    public HashMap<String,ArrayList> negetive = new HashMap();
    public HashMap<String , ArrayList> positive = new HashMap();
    public  ArrayList AdjectiveList[] =  new ArrayList[27];
    public  ArrayList NounList[] = new ArrayList[27];
    public ArrayList VerbList[] = new ArrayList[27];
    public ArrayList AdVerbList[] = new ArrayList[27];
    public ArrayList NegetiveList[] = new ArrayList[27];
    public ArrayList PositiveList[] = new ArrayList[27];
    
    
    private void objAdjectiveList(){
        for(int i=0;i<=26;i++){
            AdjectiveList[i]=new ArrayList();
        }
    }
     private void objNounList(){
        for(int i=0;i<=26;i++){
            NounList[i]=new ArrayList();
        }
    }
     private void objVerbList(){
        for(int i=0;i<=26;i++){
            VerbList[i]=new ArrayList();
        }
    }
      private void objAdVerbList(){
        for(int i=0;i<=26;i++){
            AdVerbList[i]=new ArrayList();
        }
    }
       private void objNegetiveList(){
        for(int i=0;i<=26;i++){
            NegetiveList[i]=new ArrayList();
        }
    }
      private void objPositiveList(){
        for(int i=0;i<=26;i++){
            PositiveList[i]=new ArrayList();
        }
    }
       
 
    
    public void Adjective() throws IOException{
     try{   
     objAdjectiveList();
    // objnounList();
     String line="";
     FileReader fileReader = 
            new FileReader("english-adjectives.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              //  System.out.println(line);
                String index1 = String.valueOf(line.charAt(0)).toUpperCase();
                int alphabet = (int)(index1.charAt(0))-65;
                AdjectiveList[alphabet].add(line.toUpperCase().trim());
                char latter = (char)(alphabet+65);
                Adjective.put(String.valueOf(latter),AdjectiveList[alphabet]);
           ///     System.out.println(String.valueOf(latter));
                
            }   

            // Always close files.
            bufferedReader.close();  
            
     }
     catch(FileNotFoundException ex){
         System.out.println("Sorry Unable to Open File");
     }
        
    }
    
    public void Noun() throws IOException{
         try{   
     objNounList();
    // objnounList();
     String line="";
     FileReader fileReader = 
            new FileReader("english-nouns.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              //  System.out.println(line);
                String index1 = String.valueOf(line.charAt(0)).toUpperCase();
                int alphabet = (int)(index1.charAt(0))-65;
                 NounList[alphabet].add(line.toUpperCase().trim());
                char latter = (char)(alphabet+65);
                 Noun.put(String.valueOf(latter), NounList[alphabet]);
           ///     System.out.println(String.valueOf(latter));
                
            }   

            // Always close files.
            bufferedReader.close();  
            
     }
     catch(FileNotFoundException ex){
         System.out.println("Sorry Unable to Open File");
     }
        
    }
    
    public void Verb() throws IOException{
         try{   
     objVerbList();
    // objnounList();
     String line="";
     FileReader fileReader = 
            new FileReader("english-verb.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              //  System.out.println(line);
                String index1 = String.valueOf(line.charAt(0)).toUpperCase();
                int alphabet = (int)(index1.charAt(0))-65;
                 VerbList[alphabet].add(line.toUpperCase().trim());
                char latter = (char)(alphabet+65);
                 Verb.put(String.valueOf(latter), VerbList[alphabet]);
           ///     System.out.println(String.valueOf(latter));
                
            }   

            // Always close files.
            bufferedReader.close();  
            
     }
     catch(FileNotFoundException ex){
         System.out.println("Sorry Unable to Open File");
     }
        
    }
     public void AdVerb() throws IOException{
         try{   
     objAdVerbList();
    // objnounList();
     String line="";
     FileReader fileReader = 
            new FileReader("english-adverb.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              //  System.out.println(line);
                String index1 = String.valueOf(line.charAt(0)).toUpperCase();
                int alphabet = (int)(index1.charAt(0))-65;
                 AdVerbList[alphabet].add(line.toUpperCase().trim());
                char latter = (char)(alphabet+65);
                 AdVerb.put(String.valueOf(latter), AdVerbList[alphabet]);
           ///     System.out.println(String.valueOf(latter));
                
            }   

            // Always close files.
            bufferedReader.close();  
            
     }
     catch(FileNotFoundException ex){
         System.out.println("Sorry Unable to Open File");
     }
        
    }
     
     
     public void Negetive() throws IOException{
         try{   
     objNegetiveList();
    // objnounList();
     String line="";
     FileReader fileReader = 
            new FileReader("NegativeMovieWords.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              //  System.out.println(line);
                try{
                String index1 = String.valueOf(line.charAt(0)).toUpperCase();
                int alphabet = (int)(index1.charAt(0))-65;
                
                NegetiveList[alphabet].add(line.toUpperCase().trim());
                char latter = (char)(alphabet+65);
                 negetive.put(String.valueOf(latter), NegetiveList[alphabet]);
           ///     System.out.println(String.valueOf(latter));
                }
                catch(Exception e){
                    
                }
            }   

            // Always close files.
            bufferedReader.close();  
            
     }
     catch(FileNotFoundException ex){
         System.out.println("Sorry Unable to Open File");
     }
   
    }
     
     
     
     
     
      public void Positive() throws IOException{
         try{   
     objPositiveList();
    // objnounList();
     String line="";
     FileReader fileReader = 
            new FileReader("PositiveMovieWords.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              //  System.out.println(line);
                String index1 = String.valueOf(line.charAt(0)).toUpperCase();
                int alphabet = (int)(index1.charAt(0))-65;
                 PositiveList[alphabet].add(line.toUpperCase().trim());
                char latter = (char)(alphabet+65);
                 positive.put(String.valueOf(latter), PositiveList[alphabet]);
           ///     System.out.println(String.valueOf(latter));
                
            }   

            // Always close files.
            bufferedReader.close();  
            
     }
     catch(FileNotFoundException ex){
         System.out.println("Sorry Unable to Open File");
     }
         
         
         
         
         
        
    }
  
  
    
    
 
    
}
