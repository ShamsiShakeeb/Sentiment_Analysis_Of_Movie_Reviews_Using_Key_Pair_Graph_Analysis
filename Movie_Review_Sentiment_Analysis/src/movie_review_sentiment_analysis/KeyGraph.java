/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_review_sentiment_analysis;

import java.io.FileWriter;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 *
 * @author User
 */
public class KeyGraph {
    
    
        String Data="";
        HashSet<String> ListOfWords = new HashSet();
        HashMap<String,Integer> GraphMap1 = new HashMap();
        HashMap<String,Integer> GraphMap2 = new HashMap();
        LinkedHashSet<String> unknownList = new LinkedHashSet();
        
     //   public int pairsConnectionsPositive[] ;
        public static double previousRow = 0, PreviousCol=0;
        
        
        public HashSet<String> testList[];
        
        public void testClassify(int Size){
            
                testList = new HashSet[Size];
                
                for(int i=0;i<Size;i++){
                    testList[i] = new HashSet();
                }
        }
       
    
        public KeyGraph(String Data,HashSet<String> ListOfWords,HashMap<String,Integer> GraphMap1 , HashMap<String,Integer> GraphMap2){
            
               this.Data=Data;
               this.ListOfWords = ListOfWords;
               this.GraphMap1 = GraphMap1;
               this.GraphMap2 = GraphMap2;
            //   pairsConnectionsPositive = new int[this.FilterDataList.size()] ;
               
               
        }
        
        public int previousrow = 0;
        public int previouscol=0;
        

        public double KeyGraphProbability(int graphIndex[][] , Co_Occurence co_occu, Co_Occurence co_occu1  ){
          
           double PairConnectionsProbabilityPositive=1;
           
     //   double PairConnectionsProbabilityNegative[] = new double[this.FilterDataList.size()];
        
        
        
       // int pairConnectionsNegetive[] = new int[this.FilterDataList.size()];
        
       // ArrayList<Double> list  = new ArrayList();    
       
    //    for(int i=0;i<this.FilterDataList.size();i++){
            boolean visited[][] = new boolean[this.ListOfWords.size()][this.ListOfWords.size()];
         //   PairConnectionsProbabilityPositive[i]=1;
            int countL=0;
            boolean svr=false;
            String Split[] = this.Data.split(" ");
            for(int j=0;j<Split.length-1;j++){
                if(!(Split[j].equals(Split[j+1]))){ 
                    int row=0,col=0;boolean StringNotFound=true;
                    try{ 
                     row =  GraphMap1.get(Split[j]);
                    
                    }
                    catch(Exception e){
                        row=0;
                        col=0;
                        StringNotFound=false;
                    }
                     if(StringNotFound){
                     try{
                     col = GraphMap1.get(Split[j+1]);
                    
                     }
                     catch(Exception e){
                          col=0;
                          row=0;
                     }
                     }
                    
                     if(visited[row][col]==false && visited[col][row]==false){
                         visited[row][col]=true;
                         visited[col][row]=true;
                         
                         if(graphIndex[row][col]!=0){
                           //  previousrow =GraphMap1.get(Split[j]); previouscol=GraphMap1.get(Split[j+1]);
                          //   previousRow=(double)row;
                           //  PreviousCol=(double)col;
                           ///  System.out.println(Split[j]+" vs "+Split[j+1]+" = "+graphIndex[row][col]); 
                             double probabilityOfRow=(((double)graphIndex[row][col]/(double)co_occu.frequency[row]))*100;
                             double probabilityOfCol =(((double)graphIndex[row][col]/(double)co_occu.frequency[col]))*100;
                             
                             double pair = (double) graphIndex[row][col];
                             
                             int row1=0;
                             int col1=0;
                             if(GraphMap2.get(Split[j])!=null){
                             row1 = GraphMap2.get(Split[j]);}
                             if(GraphMap2.get(Split[j+1])!=null){
                             col1=GraphMap2.get(Split[j+1]);
                             }
                             
                             
                        //     double pairProbability =  ((probabilityOfRow+probabilityOfCol)/2)+((double)co_occu.frequency[row]/((double)co_occu.frequency[row]+(double)co_occu1.frequency[row1]))*((double)co_occu.frequency[col]/((double)co_occu.frequency[col]+(double)co_occu1.frequency[col1]));
                              double pairProbability =  (((probabilityOfRow+probabilityOfCol)/2)+pair)+((double)co_occu.frequency[row]/((double)co_occu.frequency[row]+(double)co_occu1.frequency[row1]))*((double)co_occu.frequency[col]/((double)co_occu.frequency[col]+(double)co_occu1.frequency[col1]));
                            // System.out.println(countL+" "+pairProbability +" = "+Split[j]+" ("+co_occu.frequency[row]+")" +" vs "+Split[j+1]+" ("+co_occu.frequency[col]+")" +" === "+graphIndex[row][col]);
                             PairConnectionsProbabilityPositive+=pairProbability;
                             countL++;
                         }
                         else{
                             
                           // break;
                            // unknownList.add(Split[j]);
                            // unknownList.add(Split[j+1]);
                          /*   if(GraphMap1.get(Split[j])!=null && GraphMap1.get(Split[j+1])!=null){
                                 
                                 double row1 = (double)GraphMap1.get(Split[j]); 
                                 double col1 = (double)GraphMap1.get(Split[j+1]); 
                                 int row2 = GraphMap1.get(Split[j]);
                                 int col2 = GraphMap1.get(Split[j+1]);
                                 double XDotY = ((double)previousrow*(double)previouscol)+(row1*col1);
                                 double normx = Math.pow(previousrow, 2)+Math.pow(row1,2);
                                 double normy = Math.pow(previouscol, 2)+Math.pow(col1, 2);
                                 double normX = Math.pow(normx, 0.5);
                                 double normY = Math.pow(normy, 0.5);
                                 double cosineSim = XDotY/(normX*normY);
                                 
                                 
                                 
                                 if(cosineSim<=0.02){
                                     
                                     double probabilityOfRow=((1/(double)co_occu.frequency[row2]))*100;
                                     double probabilityOfCol =((1/(double)co_occu.frequency[col2]))*100; 
                                     
                                     int row3=0;
                             int col3=0;
                             if(GraphMap2.get(Split[j])!=null){
                             row3 = GraphMap2.get(Split[j]);}
                             if(GraphMap2.get(Split[j+1])!=null){
                             col3=GraphMap2.get(Split[j+1]);
                             }
                                  double pairProbability1 =  ((probabilityOfRow+probabilityOfCol)/2)+((double)co_occu.frequency[row2]/((double)co_occu.frequency[row2]+(double)co_occu1.frequency[row3]))*((double)co_occu.frequency[col2]/((double)co_occu.frequency[col2]+(double)co_occu1.frequency[col3]));
                             
                            // System.out.println(countL+" "+pairProbability +" = "+Split[j]+" ("+co_occu.frequency[row]+")" +" vs "+Split[j+1]+" ("+co_occu.frequency[col]+")" +" === "+graphIndex[row][col]);
                             PairConnectionsProbabilityPositive[i]+=pairProbability1;
                             countL++;     
                               //  System.out.println("( "+previousrow+"," +previouscol+")" +"( "+row1 +" , "+col1 +") = "+cosineSim);
                                 
                                 
                                 }
                                 
                               
                                 previousrow=row2;
                                 previouscol=col2;
                                 
                                 
                             }*/
                             
                            // testList[i].add(Split[j]);
                            // testList[i].add(Split[j+1]);
                            
                             //svr=true;
                            
                         }
                     }
                }
               
            }
            
       //    pairsConnectionsPositive[i]=countL;
           
           double list1 =  ((PairConnectionsProbabilityPositive) *((double)countL/this.ListOfWords.size()));
          
          // break;
      //  }
        
        return list1;
            
        }
       /* HashSet<Integer> filterwords = new HashSet();
        public void FilterKeyGraphVisualize(int graphIndex[][]){
            for(int i=0;i<ListOfWords.size();i++){
                for(int j=i+1;j<ListOfWords.size();j++){
                    if(graphIndex[i][j]>=5){
                        filterwords.add(i);
                        filterwords.add(j);
                    }
                }
            }
        }*/
        public static String Operations="pos";
        public void KeyGraphDataVisualizations(HashSet<String> ListOfWords,int graphIndex[][] , HashMap<String,Integer> GraphMap, HashSet<String> ListOfWords1,int graphIndex1[][] , HashMap<String,Integer> GraphMap1,int to , int from,int con){
            try{
         //   FilterKeyGraphVisualize(graphIndex);
            FileWriter fw=new FileWriter("graphFile1.json");
            fw.write("{ \n");
            fw.write((char)34+"nodes"+(char)34+":[ \n");
            String[] object = ListOfWords.toArray(new String[ListOfWords.size()]);
           
          
            
            String data="";
            int freq[] =  new int[from];
            for(int i=to;i<from;i++){
                for(int j=i+1;j<from;j++){

                    if(graphIndex[i][j]>=con){
                         freq[i]++;
                         freq[j]++;
                         if(i!=from-1 && j!=from-1){
                         data+=("{\"source\":"+(i-to)+",\"target\":"+(j-to)+",\"weight\":"+((double)graphIndex[i][j])+"},\n");}
                         else{
                         data+=("{\"source\":"+(i-to)+",\"target\":"+(j-to)+",\"weight\":"+((double)graphIndex[i][j])+"},\n");   
                         }
                    }
                }
            }
            String nodes="";
            for(int i=to;i<from;i++){
            if(i!=from-1)    
            nodes+=("{"+(char)34+"name"+(char)34+":"+(char)34+object[i]+"( " +freq[i]+" )"+(char)34+","+(char)34+"group"+(char)34+":"+(GraphMap.get(object[i])-to)+"},\n");
            else{
            nodes+=("{"+(char)34+"name"+(char)34+":"+(char)34+object[i]+"( " +freq[i]   +" )"+(char)34+","+(char)34+"group"+(char)34+":"+(GraphMap.get(object[i])-to)+"}\n");    
            }
            
            }
            fw.write(nodes);
            fw.write("],\n");
            fw.write("\"links\":[ \n");
            StringBuilder newData = new StringBuilder (data);
            newData.delete(data.length()-2,data.length()-1);
            fw.write(newData.toString());
         //   System.out.println(newData);
            fw.write("]\n");
            fw.write("}");
            
            fw.close();
            
            
            
            }
            catch(Exception e){
                System.out.println(e);
            }
            VisualizeKeyGraph vis = new VisualizeKeyGraph(ListOfWords,graphIndex,GraphMap,ListOfWords1,graphIndex1,GraphMap1);
            
            
            
            if(vis.action.equals("")){
            vis.setVisible(true);
            }
            else {
              if(vis.action.equals("pos")){   
              vis = new VisualizeKeyGraph(ListOfWords,graphIndex,GraphMap,ListOfWords1,graphIndex1,GraphMap1);
              vis.setVisible(true);
              }
              else{
                 vis = new VisualizeKeyGraph(ListOfWords1,graphIndex1,GraphMap1,ListOfWords,graphIndex,GraphMap);
              vis.setVisible(true);  
              }
            }
           
           
           
        }
        
}
