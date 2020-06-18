import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class levelpositive
{
	public static void main(String[] args) throws Exception //分正面(步驟4)
	{
		String fileName = "positive5/";//命名根目錄下的資料夾的名稱
	     String[] filename;			  
	     File f = new File(fileName);//讀取剛剛命名的資料夾
	        if (f.isDirectory()) 	 //判斷是否為資料夾
	        {	
	            filename = f.list();//將f陣列以索引的方式保留收集的物件順序
	            System.out.println("開始讀檔...");//輸出開始讀檔
	            	for (int i = 0; i <= filename.length-1; i++)//以f陣列的長度作為迴圈跑的次數
	            	{
						 try 
						 		{
						 			{
		
										FileReader fr; //檔案寫入
										fr = new FileReader("positive5/"+filename[i]); //檔案寫入綁定文件
										BufferedReader br = new BufferedReader(fr); //檔案讀取緩衝區
										
										
										FileReader fr3; //檔案寫入
										fr3 = new FileReader("level5.txt"); //檔案寫入綁定文件
										BufferedReader br3 = new BufferedReader(fr3); //檔案讀取緩衝區
										
										FileReader fr4; //檔案寫入
										fr4 = new FileReader("level4.txt"); //檔案寫入綁定文件
										BufferedReader br4 = new BufferedReader(fr4);
										
										FileReader fr5; //檔案寫入
										fr5 = new FileReader("level3.txt"); //檔案寫入綁定文件
										BufferedReader br5 = new BufferedReader(fr5); //檔案讀取緩衝區
										
										FileReader fr6; //檔案寫入
										fr6 = new FileReader("level2.txt"); //檔案寫入綁定文件
										BufferedReader br6 = new BufferedReader(fr6); //檔案讀取緩衝區
										
										FileReader fr7; //檔案寫入
										fr7 = new FileReader("level1.txt"); //檔案寫入綁定文件
										BufferedReader br7 = new BufferedReader(fr7); //檔案讀取緩衝區
										
										
																		
										FileWriter fw2; //檔案寫出
										fw2 = new FileWriter("levelpositive/"+i+"."+"level5."+filename[i]); //檔案寫出綁定文件
										BufferedWriter bw2 = new BufferedWriter(fw2);
										
										FileWriter fw3; //檔案寫出
										fw3 = new FileWriter("levelpositive/"+i+"."+"level4."+filename[i]); //檔案寫出綁定文件
										BufferedWriter bw3 = new BufferedWriter(fw3);
										
										FileWriter fw4; //檔案寫出
										fw4 = new FileWriter("levelpositive/"+i+"."+"level3."+filename[i]); //檔案寫出綁定文件
										BufferedWriter bw4 = new BufferedWriter(fw4);
										
										FileWriter fw5; //檔案寫出
										fw5 = new FileWriter("levelpositive/"+i+"."+"level2."+filename[i]); //檔案寫出綁定文件
										BufferedWriter bw5 = new BufferedWriter(fw5);
										
										FileWriter fw6; //檔案寫出
										fw6 = new FileWriter("levelpositive/"+i+"."+"level1."+filename[i]); //檔案寫出綁定文件
										BufferedWriter bw6 = new BufferedWriter(fw6);
										
										
										
										String tmp = ""; 
										while (br.ready())
										    tmp += br.readLine()+",";
										String[] data2 = tmp.split(",");
										
										
										
										
										
										String tmp3 = ""; 
										while (br3.ready()) 
										    tmp3 += br3.readLine()+","; 
										String[] data3 = tmp3.split(",");
										
										
										
										String tmp4 = ""; 
										while (br4.ready()) 
										    tmp4 += br4.readLine()+","; 
										String[] data4 = tmp4.split(",");
										
										
										
										String tmp5 = ""; 
										while (br5.ready()) 
										    tmp5 += br5.readLine()+","; 
										String[] data5 = tmp5.split(",");
										
										
										
										String tmp6 = ""; 
										while (br6.ready()) 
										    tmp6 += br6.readLine()+","; 
										String[] data6 = tmp6.split(",");
										
										
										
										String tmp7 = ""; 
										while (br7.ready()) 
										    tmp7 += br7.readLine()+","; 
										String[] data7 = tmp7.split(",");
										
										;
																		
									
										bw2.append(splitArr(data3,data2));
										bw3.append(splitArr(data4,data2));
										bw4.append(splitArr(data5,data2));
										bw5.append(splitArr(data6,data2));
										bw6.append(splitArr(data7,data2));
		
										System.out.println("第"+(i+1)+"個檔案處理完成");
										fr.close();//檔案關閉
										
										fr3.close();
										fr4.close();
										fr5.close();
										fr6.close();
										fr7.close();		
										
										bw2.close();
										bw3.close();
										bw4.close();
										bw5.close();
										bw6.close();//檔案關閉  
						 			} 
						 		}
						 		catch (FileNotFoundException e)  //如果try無法執行就會執行例外處理
						 		{
						 			// TODO Auto-generated catch block
						 			System.out.print("FAIL");
						 			e.printStackTrace();
						 		}
	            		}
	        }
				
	}
		public static String splitArr(String[] arr1, String[] arr2) //資料重組函式
		{
			String tmp ="";//設一個空白資串
			for(int i=0;i<arr2.length;i++)//利用陣列data2的長度做一個外迴圈次數
			{
				for(int j=0;j<arr1.length;j++)//利用陣列data1的長度做一個內迴圈次數
				{
					if(arr2[i].matches(".*"+arr1[j]+"..*"))//判斷兩者是否符合
					{
						tmp += arr2[i]+"\r"+"\n";//將陣列i的資料暫存在tmp並換行
						break;//跳出內迴圈
					}
				}	
			}
			return tmp;
		}	
	}