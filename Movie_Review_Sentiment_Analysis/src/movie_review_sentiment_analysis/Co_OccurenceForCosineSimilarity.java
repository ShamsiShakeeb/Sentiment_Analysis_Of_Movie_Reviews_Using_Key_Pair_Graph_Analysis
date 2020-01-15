
package movie_review_sentiment_analysis;

import java.util.ArrayList;
import java.util.HashMap;


public class Co_OccurenceForCosineSimilarity {
    
    
    
      ArrayList<String> listofwords = new ArrayList();
      ArrayList<String> FilterDataSet =  new ArrayList();
      
    
       public Co_OccurenceForCosineSimilarity(ArrayList<String> listofwords,ArrayList<String> FilterDataSet){
           
           this.listofwords = listofwords;
           this.FilterDataSet = FilterDataSet;
           
           
           
       }
       
        public HashMap<String,Integer> GraphMap(){
           
        HashMap<String,Integer> graphMap = new HashMap();
        String listofwords[] = this.listofwords.toArray(new String[this.listofwords.size()]);
        
        for(int i=0;i<listofwords.length;i++){
           
            graphMap.put(listofwords[i], i);
         }
         return graphMap;
       }
        public int frequency[];
        public int[][] Co_OccurenceMetrix(HashMap<String,Integer> graphMap){
      
        int graphIndex[][] = new int[this.listofwords.size()][listofwords.size()];
        frequency = new int[listofwords.size()];
   
        
        for(int i=0;i<this.FilterDataSet.size();i++){
            String Split[]=this.FilterDataSet.get(i).split(" ");
            for(int j=0;j<Split.length-1;j++){
              //  System.out.println(Split[j] +" "+Split[j+1]);
                int row = graphMap.get(Split[j]);frequency[row]+=1;
                int col = graphMap.get(Split[j+1]);
                graphIndex[row][col]=graphIndex[row][col]+1;
               
                graphIndex[col][row]=graphIndex[col][row]+1;
                
                
                
            } 
           // break;
           
        }
        return graphIndex;
        }
        
        
       
        
        
}
