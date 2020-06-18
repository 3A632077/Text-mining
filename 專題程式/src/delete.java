import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class delete //文章預前處理(步驟0)
{
	 public static void main(String [] argv) throws IOException 
	 {
			
		 String fileName = "resource1/";//命名根目錄下的資料夾的名稱
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
						 			if(i>=0)
						 			{
						 				FileReader fr; //檔案讀入
						 				fr = new FileReader(fileName+"/"+filename[i]); //檔案寫入綁定文件
						 				BufferedReader br = new BufferedReader(fr); //檔案讀取緩衝區
						 				FileWriter fw; //檔案寫出
						 				fw = new FileWriter(new File("delete2/"+filename[i]).getAbsolutePath(),true); //檔案寫出綁定文件
						 				BufferedWriter bw = new BufferedWriter(fw); //檔案寫出緩衝區
						 				String tmp = ""; //字串暫存器
						 				while (br.ready()) //如果檔案讀取緩衝區有資料 就執行迴圈內 否則跳出
						 					tmp += br.readLine(); //檔案讀取緩衝區內有資料 將資料讀取一行後儲存到字串暫存器內
						 				bw.append(splitArr(tmp)); //讀取完檔案後 將字串暫存器內資料重組 並且寫入檔案緩衝區 儲存檔案
						 				System.out.println("第"+(i+1)+"個檔案處理完成");
						 				fr.close();//檔案關閉
						 				bw.close();//檔案關閉  
						 			} 
						 		}
						 		catch (FileNotFoundException e) //如果try無法執行就會執行例外處理
						 		{
						 			// TODO Auto-generated catch block
						 			System.out.print("FAIL");
						 			e.printStackTrace();
						 		}
	            		}
	            					    
	        }
	 }
	 public static String splitArr(String s) 
	 {
		 	String[] arr = s.split(""); //切割字串為字串陣列
			String tmp = ""; //暫存器
			for(int i = 0 ; i < arr.length; i++)//以arr陣列的長度作為迴圈跑的次數
			{
				if(arr[i].matches("，")||arr[i].matches("、")||arr[i].matches("【")||arr[i].matches("】")||arr[i].matches("（")||arr[i].matches("）")||arr[i].matches("／")||arr[i].matches("「")||arr[i].matches("」")||arr[i].matches("。")||arr[i].matches(" ")||arr[i].matches("《")||arr[i].matches("》")||arr[i].matches("？")||arr[i].matches("!")||arr[i].matches(":")||arr[i].matches("．")||arr[i].matches("-")||arr[i].matches("‧")||arr[i].matches("﹒")||arr[i].matches("︰")||arr[i].matches(">")||arr[i].matches("="))
				{
				s.replaceAll(arr[i],"");//假如有符合matches的條件的話會取代成甚麼都沒有
				}
				else if(arr[i].matches("『")||arr[i].matches("』")||arr[i].matches("：")||arr[i].matches("；")||arr[i].matches("▲")||arr[i].matches("/")||arr[i].matches("%")||arr[i].matches("％")||arr[i].matches("？")||arr[i].matches("●")||arr[i].matches("※")||arr[i].matches("■")||arr[i].matches("$")||arr[i].matches("◎")||arr[i].matches("≠")||arr[i].matches("…")||arr[i].matches("！")||arr[i].matches("~")||arr[i].matches(",")||arr[i].matches("｜"))
				{
				s.replaceAll(arr[i],"");//假如有符合matches的條件的話會取代成甚麼都沒有
				}
				else if(arr[i].matches(""))
				{
				s.replaceAll(arr[i]," ");//假如有符合matches的條件的話會取代成甚麼都沒有
				}
					else{
					tmp += arr[i];//如果沒有符合matches的話arr[i]會暫存在tmp裡
				}
			}
			return tmp;//回傳tmp
	 }
}
