
package movie_review_sentiment_analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class JaccardDistance {
    
    
      public ArrayList<Integer>[] createSet(ArrayList<String> FilterDataList , HashMap<String,Integer> GraphMap){
          
             ArrayList<Integer> set[] = new ArrayList[FilterDataList.size()];
             
             for(int i=0;i<FilterDataList.size();i++){
                 set[i] = new ArrayList();
             }

             for(int i=0;i<FilterDataList.size();i++){
                 
                 boolean visit[] = new boolean[100000];
                 
                 String Split[] = FilterDataList.get(i).split(" ");
                 
                 for(int j=0;j<Split.length;j++){
                     
                     if(GraphMap.get(Split[j])!=null){
                     
                     int index = GraphMap.get(Split[j]);
                     
                     if(visit[index]==false){
                         visit[index]=true;
                         set[i].add(index);
                     }
                 }
                     }
  
             }
             
             return set;
           
      }
      HashMap<Double,Integer> map = new HashMap();
    
      public TreeSet<Double> Distance(String Data,ArrayList<Integer> A[] , HashMap<String,Integer> GraphMap , int Size){
         // System.out.println(Size/4);
          
          String Split[] = Data.split(" ");
          
          HashSet<Integer> B = new HashSet();
          
          for(int k=0;k<Split.length;k++){
              
               Integer index=0;
               int count=0;
               if(GraphMap.get(Split[k])==null){
                   count=count--;
                   index=count;
               }
               else{
                   index=GraphMap.get(Split[k]);
                  
               }
               B.add(index);
          }
          TreeSet<Double> Distance = new TreeSet();
         
          
          for(int i=0;i<Size;i++){
             // System.out.println(A[i]);
             // System.out.println(B);
              
              HashSet<Integer> U = new HashSet();
              U.addAll(A[i]);
              U.addAll(B);
              
            //  System.out.println("U Size: "+U.size());
             // System.out.println("A Size: "+A[i].size());
             // System.out.println("B Size "+B.size());
              
            //  if(i==5) break;
              
              double dis = ((double)U.size()-(((double)A[i].size()+(double)B.size())-(double)U.size()))/(double)U.size();
              if(Distance.add(dis)==true){
                  map.put(dis, i);
              }
            
             
              
          }
          
         
          
          return Distance;
          
      }
    
}
