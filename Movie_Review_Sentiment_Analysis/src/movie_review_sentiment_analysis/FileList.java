/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_review_sentiment_analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class FileList {
   
    public String Content="";
    public HashSet<String> listOfWords =  new HashSet();
  //  public ArrayList<String> seqList = new ArrayList();
    public String eachData="";
    public ArrayList<String> FilterDataList = new ArrayList();
   // int max=0;
 //   public HashMap<String,Integer> unknownList = new HashMap();
     public HashMap<String,Integer> one = new HashMap();
     public HashMap<String,Integer> two = new HashMap();
    
    public String TrimX(String x){
        
        char a[] = x.toCharArray();
        String y="";
        for(int i=0;i<a.length;i++){
            if(a[i]!='.' && a[i]!='!' && a[i]!=','){
                y+=a[i];
            }
        }
        return y;
    }
    
   /* public void PrintList(ArrayList<String> List){
        
        for(int i=0;i<List.size();i++){
            if(i%12==0){
                System.out.println("");
            }
            System.out.print(List.get(i)+" ");
        }
         System.out.println("");
        
    }
    */
    
    public HashMap<String,Integer> dp = new HashMap();
    public HashMap<String,Integer> dp1 = new HashMap();
    int value;
    public void FileContetnt(String Files,String Path,String Cmd) throws IOException {
        try {
              
            String line = "";
            FileReader fileReader
                    = new FileReader(Path+"/"+Files);
            
            

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                       Content+=line;
            }
           
            AdjectiveAndNoun adn = new AdjectiveAndNoun();
            adn.Adjective();
            adn.Noun();
            adn.Verb();
            adn.AdVerb();
          /*  System.out.println("Adjective Lexcion");
            System.out.println("       A     ");
            System.out.println("----------------");
            PrintList(adn.AdjectiveList[0]);
           
            System.out.println("       B     ");
            System.out.println("----------------");
            PrintList(adn.AdjectiveList[1]);
            
            System.out.println("\n");
            System.out.println("Noun Lexcion");
            System.out.println("       A     ");
            System.out.println("----------------");
            PrintList(adn.NounList[0]);
            
            System.out.println("       B     ");
            System.out.println("----------------");
            PrintList(adn.NounList[1]);
           
            System.out.println("\n");
            System.out.println("Verb Lexcion");
            System.out.println("       A     ");
            System.out.println("----------------");
            PrintList(adn.VerbList[0]);
            System.out.println("       B     ");
            System.out.println("----------------");
            PrintList(adn.VerbList[1]);
          
             System.out.println("\n");
            System.out.println("Adverb Lexcion");
             System.out.println("       A     ");
            System.out.println("----------------");
            PrintList(adn.AdVerbList[0]);
            System.out.println("       B     ");
            System.out.println("----------------");
            PrintList(adn.AdVerbList[1]);
           
            
            System.exit(0);
            */
            
            
        /*    System.out.println("Adjective Example (a,b,c)");
            System.out.println("A: "+adn.AdjectiveList[0]);
            System.out.println("B: "+adn.AdjectiveList[1]);
            System.out.println("C: "+adn.AdjectiveList[2]);
            System.out.println("\n");
            System.out.println("Noun Example (a,b,c)");
            System.out.println("A: "+adn.NounList[0]);
            System.out.println("B: "+adn.NounList[1]);
            System.out.println("C: "+adn.NounList[2]);
             System.out.println("\n");
             System.out.println("Verb Example (a,b,c)");
            System.out.println("A: "+adn.VerbList[0]);
            System.out.println("B: "+adn.VerbList[1]);
            System.out.println("C: "+adn.VerbList[2]);
             System.out.println("\n");
             System.out.println("AdVerb Example (a,b,c)");
            System.out.println("A: "+adn.AdVerbList[0]);
            System.out.println("B: "+adn.AdVerbList[1]);
            System.out.println("C: "+adn.AdVerbList[2]);
            System.exit(0);*/
           // adn.Negetive();
        //    adn.Positive();
           // System.out.println(adn.negetive);
            
            String Split[] = Content.split(" ");
          //  System.out.println(Split.length);
           
           
            m: for(int i=0;i<Split.length;i++){
                String x = Split[i].toUpperCase();
                x=TrimX(x);
             
               
               // System.out.println(x);
                
                if(Cmd.equals("Train")){   
                try{
                if((adn.Adjective.get(String.valueOf(x.charAt(0))).contains(x))){
                    listOfWords.add(x);
                    eachData+=x+" ";
                    continue m;
                   
                }
                }
                catch(Exception e){
                  //  System.out.println(x +" = "+"sorry");
                }
                
                
                 
                try{
                   if((adn.Noun.get(String.valueOf(x.charAt(0))).contains(x))){
                    listOfWords.add(x);
                    eachData+=x+" ";
                    continue m;
                   } 
                }
                catch(Exception e){
                    
                }
                
                try{
                   if((adn.Verb.get(String.valueOf(x.charAt(0))).contains(x))){
                   listOfWords.add(x);
                   eachData+=x+" ";
                    continue m;
                   } 
                }
                catch(Exception e){
                  
                }
                try{
                   if((adn.AdVerb.get(String.valueOf(x.charAt(0))).contains(x))){
                   listOfWords.add(x); 
                    eachData+=x+" ";
                    continue m;
                   } 
                }
                catch(Exception e){
                    
                }
                
                
                 if(dp.get(x)==null)  dp.put(x, 1);
                else {
                    int num = dp.get(x);
                    num++;
                    dp.put(x, num);
                }
                ///800 -> 200 , 1 tar jonno koto , baki gular jonno koto
              //  System.out.println(((200*fileL)/800));
                if(dp.get(x)>=(value) && x.length()>5){
                    listOfWords.add(x);
                    int num= dp.get(x);
                    dp1.put(x, num);
                   // unknownList.put(x,1);
                    eachData+=x+" ";
                    continue m;
                }
                

                }
                else if(this.one.get(x)!=null && this.two.get(x)!=null){
                    listOfWords.add(x); 
                    eachData+=x+" ";
                    continue m;
                }
               
             // if(Cmd.equals("Train")){
            /*   try{
                 if((adn.negetive.get(String.valueOf(x.charAt(0))).contains(x))){
                    listOfWords.add(x);
                   //  System.out.println("aisi");
                    unknownList.put(x,1);
                    eachData+=x+" ";
                    continue m;
                   } 
                }
                catch(Exception e){
                   
                }*/
             // }
            /*  else{
                  if(this.pos.get(x) !=null || this.neg.get(x)!=null){
                       listOfWords.add(x);
                       eachData+=x+" ";
                       continue m;
                   } 
              }*/
               /*  try{
                   if((adn.positive.get(String.valueOf(x.charAt(0))).contains(x))){
                    listOfWords.add(x);
                    unknownList.put(x,1);
                    eachData+=x+" ";
                   // continue m;
                   } 
                }
                catch(Exception e){
                    
                }*/
             
              
             
               
               
               
              
                
                
              //  }
               /* else{
                   if(this.pos.get(x) !=null && this.neg.get(x)!=null){
                       listOfWords.add(x);
                       eachData+=x+" ";
                      
                       continue m;
                   } 
                }*/
                
            }
                
                
            
            FilterDataList.add(eachData);
           // System.out.println(Files+": "+eachData); //System.exit(0);
           // System.out.println("");
          /*  System.out.println("");
            System.out.println(Files);
            System.out.println("--------------------");
            String Data[] = eachData.split(" ");
            
            for(int i=0;i<Data.length;i++){
                if(i%15==0){
                    System.out.println("");
                }
                System.out.print(Data[i]+" ");
            }
            System.out.println("");*/
            
            eachData="";
            Content="";
            
            
            // Always close files.
            bufferedReader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Sorry Unable to Open File");
        }
    }
   
    public void folderNameTrain(String Path,String Cmd,HashSet<Integer> Data) throws IOException {
        
        
        double form = 30.0/560.0;
        double occurencePow = form*(double)Data.size();
        double round = occurencePow+0.5;
        value=(int)round;
       
        
        
        File file = new File(Path);
        String[] fileList = file.list();
        
        Integer fileId[] = Data.toArray(new Integer[Data.size()]);
       
        
        for (int i = 0; i < fileId.length ; i++) {
          
           FileContetnt(fileList[fileId[i]],Path,Cmd);
           
        }
    }
    
     public void folderNameTest(String Path,String Cmd,HashMap<String,Integer> one , HashMap<String,Integer> two,TreeSet<Integer> Data) throws IOException {
        
       
        this.one=one;
        this.two=two;
        
        
        
        
        File file = new File(Path);
        String[] fileList = file.list();
        
        Integer fileId[] = Data.toArray(new Integer[Data.size()]);

        for (int i = 0; i <fileId.length ; i++) {
          
           FileContetnt(fileList[fileId[i]],Path,Cmd);
           
        }
    }

}
