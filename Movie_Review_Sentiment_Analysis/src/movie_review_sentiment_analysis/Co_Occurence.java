
package movie_review_sentiment_analysis;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class Co_Occurence {
    
    
      HashSet<String> listofwords = new HashSet();
      ArrayList<String> FilterDataSet =  new ArrayList();
      
    
       public Co_Occurence(HashSet<String> listofwords,ArrayList<String> FilterDataSet){
           
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
               // System.out.println(Split[j] +" = "+graphMap.get(Split[j]));
                int row = graphMap.get(Split[j]);frequency[row]+=1;
                int col = graphMap.get(Split[j+1]);
                graphIndex[row][col]=graphIndex[row][col]+1;
               
                graphIndex[col][row]=graphIndex[col][row]+1;
                
                
                
            } 
           // break;
           
        }
        return graphIndex;
        }
        
        public String Trim(String x){
            char a[] = x.toCharArray();
            String y="";
            for(int i=0;i<a.length;i++){
                
                if((int)a[i]!=39){
                    y+=a[i];
                }
            }
            return y;
        }
       
        public void Visualizations(HashSet<String> ListOfWords , int[][] graphIndex,HashMap<String,Integer> hm,int s , int f,int freq[],HashSet<String> ListOfWords1,int[][] graphIndex1,HashMap<String,Integer> hm1,int freq1[]) throws IOException {
            
            String x = "<head>\n" +
"  <!-- Plotly.js -->\n" +
"  <script src=\"https://cdn.plot.ly/plotly-latest.min.js\"></script>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"  \n" +
"  <div id=\"myDiv\"><!-- Plotly chart will be drawn inside this DIV --></div>\n" +
"  <script> \n";
            String[]  array = ListOfWords.toArray(new String[ListOfWords.size()]);
            int count=-1;
            String data="";
            String data1="";
            for(int i=s;i<f;i++){
                
                count++;
                if(i==f-1){

                String TableData = Trim(array[i])+"(" +freq[i] +")";
                String TableData1 = Trim(array[(f-1)-count])+"(" +freq[(f-1)-count] +")";
                    
                data+="'"+TableData+"'"+"";
                data1+="'"+TableData1+"'"+"";
                
                }
                else{
                     String TableData = Trim(array[i])+"(" +freq[i] +")";
                     data+="'"+TableData+"'"+",";
                     String TableData1 = Trim(array[(f-1)-count])+"(" +freq[(f-1)-count] +")";
                     data1+="'"+TableData1+"'"+",";
                }
            }
            String obrac="[";
            String cbrac="]";
            data=obrac+data+cbrac;
            data1=obrac+data1+cbrac;
            
            
            String y="var xValues = " +data +" ; \n";
            
            String z="var yValues = "+data1 +" ; \n";
            
            ArrayList<String> list = new ArrayList();
           
            for(int i=s;i<f;i++){
                String res="";
                for(int j=s;j<f;j++){
                    
                    
                     

                     
                     if(j==f-1){
                        
                          res+=graphIndex[i][j]+"";
                     }
                     else
                     res+=graphIndex[i][j]+",";
                }
                String eachData="";
                if(i==0){
                eachData=obrac+res+cbrac+"";
                }
                else{
                eachData=obrac+res+cbrac+",";}
                
                list.add(eachData);
            }
            
          //  System.out.println(list);
            
            
            String a="var zValues =  [";
            String a1="";
            for(int i=list.size()-1;i>=0;i--){
                a1+=list.get(i)+"\n";
            }
            a= a+a1 +"];";
            
            
          //  System.out.println(a);System.exit(0);
            
            
            
            
            String b="var colorscaleValue = [\n" +
"  [0, '#3D9970'],\n" +
"  [1, '#3D9970']\n" +
"];\n" +
"\n" +
"var data = [{\n" +
"  x: xValues,\n" +
"  y: yValues,\n" +
"  z: zValues,\n" +
"  type: 'heatmap',\n" +
"  colorscale: colorscaleValue,\n" +
"  showscale: false\n" +
"}];\n" +
"\n" +
"var layout = {\n" +
"  title: 'Annotated Heatmap',\n" +
"  annotations: [],\n" +
"  xaxis: {\n" +
"    ticks: '',\n" +
"    side: 'top'\n" +
"  },\n" +
"  yaxis: {\n" +
"    ticks: '',\n" +
"    ticksuffix: ' ',\n" +
"    width: 700,\n" +
"    height: 700,\n" +
"    autosize: false\n" +
"  }\n" +
"};\n" +
"\n" +
"for ( var i = 0; i < yValues.length; i++ ) {\n" +
"  for ( var j = 0; j < xValues.length; j++ ) {\n" +
"    var currentValue = zValues[i][j];\n" +
"    if (currentValue != 0.0) {\n" +
"      var textColor = 'white';\n" +
"    }else{\n" +
"      var textColor = 'black';\n" +
"    }\n" +
"    var result = {\n" +
"      xref: 'x1',\n" +
"      yref: 'y1',\n" +
"      x: xValues[j],\n" +
"      y: yValues[i],\n" +
"      text: zValues[i][j],\n" +
"      font: {\n" +
"        family: 'Arial',\n" +
"        size: 12,\n" +
"        color: 'rgb(50, 171, 96)'\n" +
"      },\n" +
"      showarrow: false,\n" +
"      font: {\n" +
"        color: textColor\n" +
"      }\n" +
"    };\n" +
"    layout.annotations.push(result);\n" +
"  }\n" +
"}\n" +
"\n" +
"Plotly.newPlot('myDiv', data, layout, {showSendToCloud: true});\n" +
"  </script>\n" +
"</body>\n";
            
            String res = x+y+z+a+b;
           // System.out.println("ailam");
            FileWriter fw=new FileWriter("matrix.html");
            fw.write(res);
            fw.close();
           
            Co_OccurenceVisualizations co = new Co_OccurenceVisualizations(ListOfWords , graphIndex, hm, freq,ListOfWords1 , graphIndex1, hm1, freq1);
            if(co.j==0){
            co.setVisible(true);
            }
            else{
                if(co.Op.equals("Positive")){
                     co = new Co_OccurenceVisualizations(ListOfWords , graphIndex, hm, freq,ListOfWords1 , graphIndex1, hm1, freq1);co.setVisible(true);
                }
                else{
                    co = new Co_OccurenceVisualizations(ListOfWords1 , graphIndex1, hm1, freq1,ListOfWords , graphIndex, hm, freq);co.setVisible(true);
                }
            }
           
            
            
        }
       
        
        
}
