import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class positive
{
	
	public static void main(String[] args) throws Exception //分正面(步驟4)
	{
		 String fileName = "rule4/";//命名根目錄下的資料夾的名稱
	     String[] filename;			  
	     File f = new File(fileName);//讀取剛剛命名的資料夾
	        if (f.isDirectory()) 	 //判斷是否為資料夾
	        {	
	            filename = f.list();//將f陣列以索引的方式保留收集的物件順序
	            System.out.println("開始讀檔...");//輸出開始讀檔
	            	for (int i = 0; i <= filename.length-1; i++)//以f陣列的長度作為迴圈跑的次數
	            	{
	            		FileReader fr; //檔案寫入
	            		fr = new FileReader("rule4/"+filename[i]); //檔案寫入綁定文件
	            		BufferedReader br = new BufferedReader(fr); //檔案讀取緩衝區
	            		BufferedReader br1 = new BufferedReader(fr);
		
	            		FileReader fr2; //檔案寫入
	            		fr2 = new FileReader("positive.txt"); //檔案寫入綁定文件
	            		BufferedReader br2 = new BufferedReader(fr2); //檔案讀取緩衝區
	            		BufferedReader br3 = new BufferedReader(fr2);
		
	            		FileWriter fw; //檔案寫出
	            		fw = new FileWriter(new File("positive5/"+filename[i]).getAbsolutePath(),true); //檔案寫出綁定文件
	            		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
	            		String tmp = ""; //字串暫存器
	            		while (br.ready()) //如果檔案讀取緩衝區有資料 就執行迴圈內 否則跳出
	            			tmp += br.readLine()+",";
	            		String[] data2 = tmp.split(",");//切割字串為字串陣列(並存到陣列data2)
	            		
		
		
	            		String tmp2 = ""; //字串暫存器
	            		while (br2.ready()) //如果檔案讀取緩衝區有資料 就執行迴圈內 否則跳出
	            			tmp2 += br2.readLine()+","; //檔案讀取緩衝區內有資料 將資料讀取一行後儲存到字串暫存器內
	            		String[] data1 = tmp2.split(",");//切割字串為字串陣列(並存到陣列data2)
	            		
		
		
	            		bw.append(splitArr(data1,data2));
		
	            		System.out.println("第"+(i+1)+"個檔案處理完成");
	            		fr.close();//檔案關閉
	            		bw.close();//檔案關閉  
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