///265,(496,497) Lines are visualization
package movie_review_sentiment_analysis;

import java.io.IOException;
import static java.lang.Math.abs;


import java.util.ArrayList;


import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;
import java.util.Random;



public class Movie_Review_Sentiment_Analysis {

   static  String result ="";
    
    public void setKeyGraph(int start , int end , int con,String action) throws IOException{
        
        result =  start+" "+end+" "+con+" "+action;
      
      //  Analysis("View");
    }
   
    
    public static int[] Analysis(String Command,TreeSet<Integer> TestData, HashSet<Integer> TrainData,String DataSet,String Op) throws IOException{
     //   System.out.println(result);
        
        
        
        String MetrixDataFile="OriginalDataSet/"+DataSet;
        
        FileList fl = new FileList();
 
        fl.folderNameTrain(MetrixDataFile+"/pos","Train",TrainData);
        
       // HashMap<String,Integer> unknownListPos = fl.unknownList;

      //  System.out.println(fl.dp1);
        
      
       
      //  System.out.println(fl.listOfWords.size());
        
        /*0.9325*/
        
        FileList f2 = new FileList();
        
        f2.folderNameTrain(MetrixDataFile+"/neg","Train",TrainData);
        
        System.out.println("Positive Occur: "+fl.value +" Negetive Occur: "+f2.value);
        
     /*   HashSet<String> U = new HashSet();
        U.addAll(fl.dp1.keySet());
        U.addAll(f2.dp1.keySet());
        
     /*    Map<String, Integer> sorted = fl.dp1
        .entrySet()
        .stream()
        .sorted(comparingByValue())
        .collect(
            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                LinkedHashMap::new));
 
  //  System.out.println("Positive: map after sorting by values: " + sorted);
    
    
     sorted = fl.dp1
        .entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
 
    System.out.println("Positive: "
        + sorted);
    
    
    
    
    
    
    Map<String, Integer> sorted1 = f2.dp1
        .entrySet()
        .stream()
        .sorted(comparingByValue())
        .collect(
            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                LinkedHashMap::new));
 
    //System.out.println("Negetive: map after sorting by values: " + sorted1);
    
    
    
     sorted1 = f2.dp1
        .entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
 
    System.out.println("Negetive: "
        + sorted1);
    
    
    
    
    
    
    
    System.exit(0);*/
        
    /*    String arr[] = U.toArray(new String[U.size()]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.exit(0);*/
       /* fl.dp1.keySet().retainAll(f2.dp1.keySet());
        int c=0;
        for(String keys: fl.dp1.keySet()){
            System.out.println(keys);
        }
      //  System.out.println(c);
        System.exit(0);*/
       
        
    /*    double dis = ((double)U.size()-(((double)fl.dp1.keySet().size()+(double)f2.dp1.keySet().size())-(double)U.size()))/(double)U.size();
        System.out.println(U.size());
        System.out.println("Positive Size: "+fl.dp1.keySet().size());
        System.out.println("Negetive Size: "+f2.dp1.keySet().size());
        System.out.println(((fl.dp1.keySet().size()+f2.dp1.keySet().size())-U.size()));
        System.out.println(dis);
        
        HashSet<String> u1 = new HashSet();
        HashSet<String> u2 = new HashSet();
        
        u1.addAll(U);u2.addAll(U);
        u1.removeAll(fl.dp1.keySet());
        System.out.println("Unique Negetive: "+u1.size());
        u2.removeAll(f2.dp1.keySet());
        System.out.println("Unique Positive: "+u2.size());
        HashSet<String> AllUnique = new HashSet();
        AllUnique.addAll(u1);
        AllUnique.addAll(u2);
        String[] arr = AllUnique.toArray(new String[AllUnique.size()]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.exit(0);*/
        /* 0.3017543859649123 */
        /* 0.3829787234042553 */
    
        
     //  System.out.println(f2.listOfWords.size());
  
       // System.exit(0);
        /*0.84285714285714285714285714285714*/
   
       // HashMap<String,Integer> unknownListNeg = f2.unknownList;

        
        
       
        
 ///0.8048780487804879, 0.8097826086956522, 0.8164251207729468
       
      //  System.out.println(f0.lol.size());
       // System.out.println(f0.FilterDataList.size());
        
      //  System.out.println(f0.listOfWords);
       
        
        
        
      //  Co_Occurence co_occu0 =  new Co_Occurence(f0.listOfWords,f0.FilterDataList);
        
       // System.out.println(f0.FilterDataList.get(2));
        
       // co_occu0.Co_OccurenceMetrix(co_occu0.GraphMap());
        
       // System.exit(0);
        
        //System.out.println(f0.FilterDataList.get(0));
        
        /// System.out.println(f0.listOfWords); 
        
       // HashMap<String,Integer> UnknownGraphMap = new HashMap();
        
     //   UnknownGraphMap=co_occu0.GraphMap();
        
       // int graphIndex0[][]= co_occu0.Co_OccurenceMetrix(UnknownGraphMap);

        ///Passing DataSet with Object f0
        
        
        ///The Co_Ocuurence Metrix
        
        
       
        

        Co_Occurence co_occu =  new Co_Occurence(fl.listOfWords,fl.FilterDataList);
        
        System.out.println(fl.listOfWords);
        
        System.out.println(f2.listOfWords);
        
       
        
       // Co_OccurenceForCosineSimilarity cos_co_occu = new Co_OccurenceForCosineSimilarity(fl.seqList,fl.FilterDataList);
        
        HashMap<String,Integer> PositiveGraphMap = new HashMap();
        
    //    HashMap<String,Integer> CosPositiveGraphMap = new HashMap();
        
        PositiveGraphMap=co_occu.GraphMap();
        
       // CosPositiveGraphMap=cos_co_occu.GraphMap();
        
        int graphIndex[][]= co_occu.Co_OccurenceMetrix(PositiveGraphMap);
        
        
        
        
      //  int cosgraphIndex[][] = cos_co_occu.Co_OccurenceMetrix(CosPositiveGraphMap);
        
     //   String[] ob = fl.listOfWords.toArray(new String[fl.listOfWords.size()]);
        
        
        
 
        Co_Occurence co_occu1 =  new Co_Occurence(f2.listOfWords,f2.FilterDataList);
        
      //  Co_OccurenceForCosineSimilarity cos_co_occu1 = new Co_OccurenceForCosineSimilarity(f2.seqList,f2.FilterDataList);

        HashMap<String,Integer> NegativeGraphMap = new HashMap();
        
      //  HashMap<String,Integer> CosNegativeGraphMap = new HashMap();
        
        NegativeGraphMap=co_occu1.GraphMap();
        
      //  CosNegativeGraphMap = cos_co_occu1.GraphMap();
        
        int graphIndex1[][]= co_occu1.Co_OccurenceMetrix(NegativeGraphMap);
        
        
    /////    co_occu.Visualizations(fl.listOfWords,graphIndex,PositiveGraphMap,0,10,co_occu.frequency,f2.listOfWords,graphIndex1,NegativeGraphMap,co_occu1.frequency);
        
      //  int cosgraphIndex1[][]=cos_co_occu1.Co_OccurenceMetrix(CosNegativeGraphMap);
        
       // String[] ob1 = f2.listOfWords.toArray(new String[f2.listOfWords.size()]);
        FileList f0 = new FileList();
        
        String FilePaths="OriginalDataSet/"+DataSet;
        
        f0.folderNameTest(FilePaths+"/"+Op,"Test",PositiveGraphMap,NegativeGraphMap,TestData);
        
        JaccardDistance jccd = new JaccardDistance();
        
        
        ArrayList SetA[] =  jccd.createSet(fl.FilterDataList, PositiveGraphMap);
        ArrayList SetB[] =  jccd.createSet(f2.FilterDataList, NegativeGraphMap);

        
        
        
      //  System.out.println(f2.dp);
        
        
      
        int jccpos = 0 , jccneg=0;
        
      //  ArrayList<Integer> posIndex = new ArrayList();
     //   ArrayList<Integer> negIndex = new ArrayList();
        
        ArrayList<Integer> getpos = new ArrayList();
        ArrayList<Integer> getneg = new ArrayList();
       
      //  System.out.println(SetA.length);
       // System.out.println(SetB.length);
        
        for(int i=0;i<f0.FilterDataList.size();i++){
            
         //   int jpos = 0 , jneg=0;
           
             TreeSet<Double> pos = jccd.Distance(f0.FilterDataList.get(i), SetA, PositiveGraphMap, fl.FilterDataList.size());
        //     System.out.println("Positive: "+pos);
           
             TreeSet<Double> neg = jccd.Distance(f0.FilterDataList.get(i), SetB, NegativeGraphMap, f2.FilterDataList.size());
           //  System.out.println("Negetive: "+neg);
 
             double avgpos = 0;
             double avgneg=0;
             Double poos[] = pos.toArray(new Double[pos.size()]);
             Double neeg[] = neg.toArray(new Double[neg.size()]);
             
             int size=100;
             
             if(poos.length<=100 || neeg.length<=100){
                 if(poos.length<neeg.length){
                     size=poos.length;
                 }
                 else size=neeg.length;
             }
            
           //  double count1=0;
          //   double count2=0;

             for(int j=0;j<size;j++){
                 
               
                avgpos+=poos[j];
                 //   System.out.println("lol1");
              //  count1++;
                
              
                avgneg+=neeg[j];
                   // System.out.println("lol2");
               // count2++;
                
             }
             if((avgneg/size)>(avgpos/size)){
                 
             
                // System.out.println("Positive: "+(avgpos/size) +" vs "+(avgneg/size));
                 if((avgneg/size)-(avgpos/size)>=0.005){
                    
                 //System.out.println("Ratio: "+(avgneg/size)); 
                 jccpos++;
                 getpos.add(i);
                
                
                 }
                
                // posIndex.add(i);
                
            
             }
             else if((avgpos/size)>(avgneg/size)){
               //  System.out.println("Negetive: "+(avgpos/size) +" vs "+(avgneg/size));
                 if((avgpos/size)-(avgneg/size)>=0.005){
                 jccneg++;
                 getneg.add(i);
                
                 //System.out.println("Positive: "+pos);
                 // System.out.println("Negetive: "+neg);
                 }
                
               //  negIndex.add(i);
             
             }
            
        }
      //  System.out.println(negIndex);
        
        System.out.println("Jaccard Distance Positive : "+jccpos +" vs Jaccard Distance Negative "+jccneg);
       // Collections.sort(getpos , Collections.reverseOrder());
        System.out.println("High Subset of Positive: "+getpos);
        // Collections.sort(getneg , Collections.reverseOrder());
        System.out.println("High Subset Of Negetive: "+getneg);
        
      //  System.exit(0);
        
        SubsetNoDifiend sub = new SubsetNoDifiend();
        graphIndex=sub.FinalMatrics(getpos, f0.FilterDataList, PositiveGraphMap, graphIndex);
        graphIndex1=sub.FinalMatrics(getneg, f0.FilterDataList, NegativeGraphMap, graphIndex1);
        
        
              
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  
        double posValue=0,negValue=0;
        
        ArrayList<Double> pos = new ArrayList();
        ArrayList<Double> neg = new ArrayList();

       // HashSet<String> notConPos[]=new HashSet[f0.FilterDataList.size()];
        
       // HashSet<String> notConNeg[]=new HashSet[f0.FilterDataList.size()];
    
        ///Key Graph Analysis
        
        for(int i=0;i<f0.FilterDataList.size();i++){
  
        KeyGraph KeyGraphAnalysisPositive = new KeyGraph(f0.FilterDataList.get(i),fl.listOfWords,PositiveGraphMap,NegativeGraphMap);
        if(Command.equals("Equation")){
        KeyGraphAnalysisPositive.testClassify(f0.FilterDataList.size());
        posValue = KeyGraphAnalysisPositive.KeyGraphProbability(graphIndex, co_occu, co_occu1);
       
       
     //   notConPos = KeyGraphAnalysisPositive.testList;
 
        }
       // System.exit(0);
        KeyGraph KeyGraphAnalysisNegative = new KeyGraph(f0.FilterDataList.get(i),f2.listOfWords,NegativeGraphMap,PositiveGraphMap);
        if(Command.equals("Equation")){
        KeyGraphAnalysisNegative.testClassify(f0.FilterDataList.size());
        negValue = KeyGraphAnalysisNegative.KeyGraphProbability(graphIndex1, co_occu1, co_occu);
      //  notConNeg = KeyGraphAnalysisNegative.testList;
        }
          //  if(posValue>negValue){
           // System.out.println("Positive: "+KeyGraphAnalysisPositive.unknownList);
           // System.out.println("Negetive: "+KeyGraphAnalysisNegative.unknownList);
           // }
       /* if(posValue<negValue){
            
            String Data[] = f0.FilterDataList.get(i).split(" ");
            
            for(int j=0;j<Data.length-1;j++){
                try{
                int row = NegativeGraphMap.get(Data[j]);
                int col = NegativeGraphMap.get(Data[j+1]);
                
                graphIndex1[row][col] =  graphIndex1[row][col]+1;
                graphIndex1[col][row] =  graphIndex1[col][row]+1;
                }
                catch(Exception e){
                    
                }
            }
            
        }
        else if(posValue>negValue){
            
            String Data[] = f0.FilterDataList.get(i).split(" ");
            
            for(int j=0;j<Data.length-1;j++){
                
                try{
                int row = PositiveGraphMap.get(Data[j]);
                int col = PositiveGraphMap.get(Data[j+1]);
                
                graphIndex[row][col] =  graphIndex[row][col]+1;
                graphIndex[col][row] =  graphIndex[col][row]+1;
                }
                catch(Exception e){
                    
                }
            }
        }*/
       
        //    System.out.println(i+")"+KeyGraphAnalysisPositive.unknownList);
         //   System.out.println(i+")"+KeyGraphAnalysisNegative.unknownList);
          //  System.out.println("-------------------");
        
       /* ArrayList<String> classifyList = new ArrayList();
        for(int i=0;i<f0.FilterDataList.size();i++){
             
            notConPos[i].addAll(notConNeg[i]);
            String object[] = notConPos[i].toArray(new String[notConPos[i].size()]);
            String eachData="";
            for(int j=0;j<notConPos[i].size();j++){
                eachData+=object[j]+" ";
            }
            
            classifyList.add(eachData);
        }*/
        
        pos.add(posValue);
        neg.add(negValue);
        
        }
        
       /////  KeyGraph KeyGraphAnalysisPositive = new KeyGraph(null,null,null,null);
       /////  KeyGraphAnalysisPositive.KeyGraphDataVisualizations(fl.listOfWords,graphIndex, PositiveGraphMap,f2.listOfWords,graphIndex1, NegativeGraphMap, 0, 50, 1);
         
       
         /*
        Positive: 5.596001136386292
        Negetive: 52.51666002640544
        
        Positive: 12.209343749944395
        Negetive: 15.166536910592011
        
        Positive: 2.6153625196110624
        Negetive: 1.847571823625537
        
        
      
        
        
        */
        
        
        
    //    ArrayList<Integer> probablePos = new ArrayList();
    //    ArrayList<Integer> probableNeg = new ArrayList();
      
       ///Key Graph Analysis
      
         if(Command.equals("Equation")){
  
         int positive=0; 
         int negetive=0;
        
         for(int i=0;i<neg.size();i++){

       
            if(neg.get(i)>pos.get(i) ){
             
                 negetive++;
             //    probableNeg.add(i);
                // System.out.print(i+" ");
             }
             
            else if(neg.get(i)<pos.get(i)){
               
                positive++;
               // probablePos.add(i);
              
            }
 
         }
         
      /*   int data=(f0.FilterDataList.size());
         
         ArrayList<Double> probabilityPos = new ArrayList();
         ArrayList<Double> probabilityNeg = new ArrayList();
       //  Collections.sort(probablePos);
       //  Collections.sort(probableNeg);
         int posO=0;int negO=0;
      //   JaccardDistance jccd = new JaccardDistance();
         
         for(int k=0;k<f0.FilterDataList.size();k++){
         
      //   ArrayList SetA[] =  jccd.createSet(classifyList, UnknownGraphMap);
         TreeSet<Double> dis = jccd.Distance(classifyList.get(k), SetA, UnknownGraphMap, f0.FilterDataList.size());
           //  System.out.println(dis);
         Double object[] = dis.toArray(new Double[dis.size()]);
         int posit=0;int negit=0;
         for(int i=0;i<jccd.hotFav.size();i++){
           //  System.out.println(jccd.hotFav.get(i));

             if(Collections.binarySearch(probableNeg, jccd.hotFav.get(i))>=0){
                 negit++;
             }
             else{
                 posit++;
             }
         }
         for(int i=0;i<object.length;i++){
             
            // if(i>f0.FilterDataList.size()/4){
              //   break;
            // }
             if(object[i]<0.85){
                // System.out.println(object[i]);
             int index = Collections.binarySearch(probableNeg, jccd.map.get(object[i]));
             if(index>=0){
                 negit++;
             }
             else{
                 posit++;
             }
             }
             else{
                 break;
             }
            
         }
         
        
         
      //   if(abs(posit-negit)>f0.FilterDataList.size()/2){
            /// System.out.println("aisi");
         probabilityPos.add((double)posit/(double)(posit+negit));
         probabilityNeg.add((double)negit/(double)(posit+negit));
         //    System.out.println("ufffo");
        
            
             
       //  }
      //   else{
             //System.out.println("aisi");
         //    probabilityPos.add((double)positive/(double)data);
          //   probabilityNeg.add((double)negetive/(double)data);
        // }
            
        // System.out.println("Positive: "+posi +" Negetive: "+negi);
             
         
        }*/
     ///    System.out.println("Positive: "+posO +" Negetive: "+negO);
         
         
         System.out.println("Postive Pairs Connections: "+pos);
         System.out.println("Negetive Pairs Connections: "+neg);
         System.out.println("Positive: "+positive +" vs Negetive: "+negetive);
             
         int res[] = new int[2];
         res[0]=positive;
         res[1] = negetive;
         return res;
      /*    int AlterPos=0;
          int AlterNeg=0;
          
        
     
         
       
          for(int i=0;i<f0.FilterDataList.size();i++){

            String SpecificData[] = f0.FilterDataList.get(i).split(" ");
            double positivePro = 0 , negetivePro=0;
            m: for(int j=0;j<SpecificData.length-1;j++){
                
                int posRow=0,posCol=0,negRow=0,negCol=0;
                
                if(!(SpecificData[j].equals(SpecificData[j+1]))){
                    try{
                        
                        
                    if(graphIndex[posRow][posCol]==0 && graphIndex1[negRow][negCol]==0){    
                    posRow=PositiveGraphMap.get(SpecificData[j]);
                    posCol=PositiveGraphMap.get(SpecificData[j+1]);
                    negRow=NegativeGraphMap.get(SpecificData[j]);
                    negCol=NegativeGraphMap.get(SpecificData[j+1]);
                    
                     
                    double probabilityOfRow=((((double)graphIndex[posRow][posCol]+((probabilityPos.get(i))))/(double)co_occu.frequency[posRow]))*100;
                    double probabilityOfCol =((((double)graphIndex[posRow][posCol]+(probabilityPos.get(i)))/(double)co_occu.frequency[posCol]))*100;
                    double pairProbability =  ((probabilityOfRow+probabilityOfCol)/2)+((double)co_occu.frequency[posRow]/((double)co_occu.frequency[posRow]+(double)co_occu1.frequency[negRow]))*((double)co_occu.frequency[posCol]/((double)co_occu.frequency[posCol]+(double)co_occu1.frequency[negCol]));
                    
                    
                    double probabilityOfRow1=((((double)graphIndex1[negRow][negCol]+(probabilityNeg.get(i)))/(double)co_occu1.frequency[negRow]))*100;
                    double probabilityOfCol1 =((((double)graphIndex1[negRow][negCol]+(probabilityNeg.get(i)))/(double)co_occu1.frequency[negCol]))*100;
                    double pairProbability1 =  ((probabilityOfRow1+probabilityOfCol1)/2)+((double)co_occu1.frequency[negRow]/((double)co_occu.frequency[posRow]+(double)co_occu1.frequency[negRow]))*((double)co_occu1.frequency[negCol]/((double)co_occu.frequency[posCol]+(double)co_occu1.frequency[negCol]));
                        //System.out.println("Positive - Negetive"+(pairProbability-pairProbability1));
                    
                    
                    positivePro+=(pairProbability*pos.get(i));
                    negetivePro+=(pairProbability1*neg.get(i));
                   
                    }
                    
                    }
                    catch(Exception e){
                        continue m;
                    }
                }
            }
            if(positivePro>negetivePro){
                
                AlterPos++;
            }
            else{
               
                AlterNeg++;
            }
           
        }
         
       System.out.println("Final Result Positive: "+AlterPos +" vs Final Result Negetive: "+AlterNeg);
     
       }
     
       if(!result.equals("")){
       String Split[] = result.split(" ");
       int start = Integer.parseInt(Split[0]);
       int end = Integer.parseInt(Split[1]);
       int con = Integer.parseInt(Split[2]);
       if(Split[3].equals("pos"))
       KeyGraphAnalysisPositive.KeyGraphDataVisualizations(graphIndex, PositiveGraphMap,start,end,con);
       else if(Split[3].equals("neg")){
       KeyGraphAnalysisNegative.KeyGraphDataVisualizations(graphIndex1, NegativeGraphMap,start,end,con);    
       }
       else{
           System.out.println("Action = "+Split[3]);
       }
              */
       }
       int res[] = new int[2];  
       return res;
       
         
    }
   
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        ///Passing DataSet with Object f0
        
        int totalData = 700;
        int testData = 140;
        int k_fold_cross_validation=50;
        
        
        double positive=0;
        double negetive=0;
        
        for(int j=0;j<k_fold_cross_validation;j++){
       
        HashMap<TreeSet<Integer> , HashSet<Integer>> hm = new HashMap();
        
        HashSet<Integer> alldata = new HashSet();
        for(int i=0;i<totalData;i++){
            alldata.add(i);
        }

       TreeSet<Integer> hs = new TreeSet(); 
        boolean visit[] = new boolean[totalData+1]; 
        for(;;) {
        int x =   usingRandomClass(totalData); 
       
       
        if(hs.size()==testData) break;
        
        if(visit[x]==false)   {  
	hs.add(x);
        visit[x]=true;
        }
        
        }

     
 
      //  System.out.println(hs);
        alldata.removeAll(hs);
        
       
        if(hm.get(hs)==null)
        hm.put(hs,alldata);
        else {System.out.println("Data Matched");System.exit(0);}
        
        
        
        System.out.println("Tested: "+hs);
        System.out.println("Tested "+hs.size());
        System.out.println("AllData: "+alldata.size());
            
        
      //  System.out.println(hm.get(hs));
        
         int result[] = new int[2];
       
         result = Analysis("Equation",hs,alldata,"tokens","pos");
         
         positive += (double) result[0];
         negetive += (double) result[1];
        
        }
        
        System.out.println("Positive Accuracy: "+(positive/(testData*k_fold_cross_validation))*100);
        System.out.println("Negetive Accuracy: "+(negetive/(testData*k_fold_cross_validation))*100);
        
     //   VisualizeKeyGraph vis = new VisualizeKeyGraph();
       
       // vis.setVisible(true);
    }
    
    static int usingRandomClass(int totalData) {
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(totalData-1) + 1;
	return (randomInt);
   }
    
}
