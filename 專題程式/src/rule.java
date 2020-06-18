import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class rule {
	public static void main(String [] argv) throws IOException 
	 {
		String fileName = "ckip3/";//命名根目錄下的資料夾的名稱
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
						 				fr = new FileReader(fileName+"/"+filename[i]); //檔案寫入綁定文件
						 				BufferedReader br = new BufferedReader(fr); //檔案讀取緩衝區
						 				FileWriter fw; //檔案寫出
						 				fw = new FileWriter(new File("rule4/"+filename[i]).getAbsolutePath(),true); //檔案寫出綁定文件
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
						 		catch (FileNotFoundException e)  //如果try無法執行就會執行例外處理
						 		{
						 			// TODO Auto-generated catch block
						 			System.out.print("FAIL");
						 			e.printStackTrace();
						 		}
	            		}
	        }
	 }
	
	 public static String splitArr(String s) //資料重組函式
	 {  
		 String[] arr = s.split(" "); //切割字串為字串陣列
			String tmp = ""; //暫存器
			for(int i = 0 ; i < arr.length-5; i++)
			{
				int a=i+1;
				int b=i+2;
				int c=i+3;
				int d=i+4;
				int e=i+5;

				if((arr[i].matches(".*N.")||arr[i].matches(".*N.."))&&(arr[a].matches(".*D")||arr[a].matches(".*D.")||arr[a].matches(".*D.."))&&(arr[b].matches(".*V.")||arr[b].matches(".*V.."))&&(arr[c].matches(".*N.")||arr[c].matches(".*N.."))&&(arr[e].matches(".*N.")||arr[e].matches(".*N..")||arr[e].matches(".*V.")||arr[e].matches(".*V.."))) 
					{
						tmp +=arr[i];
						tmp +=arr[a];
						tmp +=arr[b];
						tmp +=arr[c];
						tmp +=arr[d];
						tmp +=arr[e]+'\r'+'\n';
						i+=5;
					}
				//N+ADV+V+N+*+(N or V)

				
				else if((arr[i].matches(".*N.")||arr[i].matches(".*N.."))&&(arr[a].matches(".*D")||arr[a].matches(".*D.")||arr[a].matches(".*D.."))&&(arr[b].matches(".*V.")||arr[b].matches(".*V.."))&&(arr[d].matches(".*N.")||arr[d].matches(".*N..")||arr[d].matches(".*V.")||arr[d].matches(".*V..")))
					{	
						tmp +=arr[i];
						tmp +=arr[a];
						tmp +=arr[b];
						tmp +=arr[c];
						tmp +=arr[d]+'\r'+'\n';
						i+=4;
					}
				//N+ADV+V+*+(N or V)
					
				else if((arr[b].matches(".*N.")||arr[b].matches(".*N.."))&&(arr[i].matches(".*D")||arr[i].matches(".*D.")||arr[i].matches(".*D.."))&&(arr[a].matches(".*V.")||arr[a].matches(".*V.."))&&(arr[d].matches(".*N.")||arr[d].matches(".*N..")||arr[d].matches(".*V.")||arr[d].matches(".*V..")))
					{
						tmp +=arr[i];
						tmp +=arr[a];
						tmp +=arr[b];
						tmp +=arr[c];
						tmp +=arr[d]+'\r'+'\n';
						i+=4;
					}
				//ADV+V+N+any(N or V)
				
				else if((arr[i].matches(".*N.")||arr[i].matches(".*N.."))&&(arr[a].matches(".*V.")||arr[a].matches(".*V.."))&&(arr[b].matches(".*V.")||arr[b].matches(".*V.."))&&(arr[d].matches(".*N.")||arr[d].matches(".*N..")||arr[d].matches(".*V.")||arr[d].matches(".*V..")))
					{
						tmp +=arr[i];
						tmp +=arr[a];
						tmp +=arr[b];
						tmp +=arr[c];
						tmp +=arr[d]+'\r'+'\n';
						i+=4;
					}
				//N+V+V+any(N or V)
				
				else if((arr[i].matches(".*N.")||arr[i].matches(".*N.."))&&(arr[a].matches(".*De")||arr[a].matches(".*I")||arr[a].matches(".*T"))&&(arr[b].matches(".*N.")||arr[b].matches(".*N.."))&&(arr[d].matches(".*N.")||arr[d].matches(".*N..")||arr[d].matches(".*V.")||arr[d].matches(".*V..")))
					{
						tmp +=arr[i];
						tmp +=arr[a];
						tmp +=arr[b];
						tmp +=arr[c];
						tmp +=arr[d]+'\r'+'\n';
						i+=4;
					}
				//N+T+N+any+(N or V)
				
				else if((arr[i].matches(".*V.")||arr[i].matches(".*V.."))&&(arr[a].matches(".*De")||arr[a].matches(".*I")||arr[a].matches(".*T"))&&(arr[b].matches(".*N.")||arr[b].matches(".*N.."))&&(arr[d].matches(".*N.")||arr[d].matches(".*N..")||arr[d].matches(".*V.")||arr[d].matches(".*V..")))
					{
						tmp +=arr[i];
						tmp +=arr[a];
						tmp +=arr[b];
						tmp +=arr[c];
						tmp +=arr[d]+'\r'+'\n';
						i+=4;
					}
				//V+T+N+any+(N or V)
				
			}
			return tmp;
	 }

}
