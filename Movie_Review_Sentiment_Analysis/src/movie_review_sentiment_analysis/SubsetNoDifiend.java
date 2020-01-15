
package movie_review_sentiment_analysis;

import java.util.ArrayList;
import java.util.HashMap;


public class SubsetNoDifiend {
    
    public int[][] FinalMatrics(ArrayList<Integer> index , ArrayList<String> FilterDataList , HashMap<String,Integer> GraphMap , int[][] graphIndex){
       
         for(int i=0;i<index.size();i++){
            
            String Split[]=FilterDataList.get(index.get(i)).split(" ");
            
            for(int j=0;j<Split.length-1;j++){
                
                if(GraphMap.get(Split[j])!=null && GraphMap.get(Split[j+1])!=null){
                    int row = GraphMap.get(Split[j]);
                    int col = GraphMap.get(Split[j+1]);
                    
                    graphIndex[row][col] = graphIndex[row][col]+1;
                    graphIndex[col][row]=graphIndex[col][row]+1;
                    
                }
               
            }
         }
        
         return graphIndex;
    }
    
}
