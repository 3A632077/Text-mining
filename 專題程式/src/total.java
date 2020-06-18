import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class total //文章預前處理(步驟0)
{
	 public static void main(String [] argv) throws IOException 
	 {
		 String tmp = ""; //字串暫存器
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
						 			if(i>=0)
						 			{
						 				FileReader fr; //檔案讀入
						 				fr = new FileReader(fileName+"/"+filename[i]); //檔案寫入綁定文件
						 				BufferedReader br = new BufferedReader(fr); //檔案讀取緩衝區
						 				
						 				
						 				while (br.ready()) //如果檔案讀取緩衝區有資料 就執行迴圈內 否則跳出
						 					tmp += br.readLine(); //檔案讀取緩衝區內有資料 將資料讀取一行後儲存到字串暫存器內
						 				System.out.println("第"+(i+1)+"個檔案處理完成");
						 				fr.close();//檔案關閉
						 				  
						 			} 
						 		}
						 		catch (FileNotFoundException e) //如果try無法執行就會執行例外處理
						 		{
						 			// TODO Auto-generated catch block
						 			System.out.print("FAIL");
						 			e.printStackTrace();
						 		}
	            		}
	            	FileWriter fw; //檔案寫出
	            	fw = new FileWriter(new File("total.txt").getAbsolutePath(),true); //檔案寫出綁定文件
	            	BufferedWriter bw = new BufferedWriter(fw); //檔案寫出緩衝區
	            	bw.append(splitArr(tmp)); //讀取完檔案後 將字串暫存器內資料重組 並且寫入檔案緩衝區 儲存檔案
	            	bw.close();//檔案關閉
	            	
	            					    
	        }
	 }
	 public static String splitArr(String s) 
	 {
		 	String[] arr = s.split(""); //切割字串為字串陣列
			String tmp = ""; //暫存器
			for(int i = 0 ; i < arr.length; i++)//以arr陣列的長度作為迴圈跑的次數
			{				
				tmp=tmp+arr[i];
				tmp=tmp.replace("(Na)", "");
				tmp=tmp.replace("(V_2)", "");
				tmp=tmp.replace("(A)", "");
				tmp=tmp.replace("(Caa)", "");
				tmp=tmp.replace("(Cab)", "");
				tmp=tmp.replace("(Cba)", "");
				tmp=tmp.replace("(Cbb)", "");
				tmp=tmp.replace("(D)", "");
				tmp=tmp.replace("(DE)", "");
				tmp=tmp.replace("(Da)", "");
				tmp=tmp.replace("(Dfa)", "");
				tmp=tmp.replace("(Dfb)", "");
				tmp=tmp.replace("(Di)", "");
				tmp=tmp.replace("(Dk)", "");
				tmp=tmp.replace("(FW)", "");
				tmp=tmp.replace("(I)", "");
				tmp=tmp.replace("(Nb)", "");
				tmp=tmp.replace("(Nc)", "");
				tmp=tmp.replace("(Ncd)", "");
				tmp=tmp.replace("(Nd)", "");
				tmp=tmp.replace("(Nep)", "");
				tmp=tmp.replace("(Neqa)", "");
				tmp=tmp.replace("(Neqb)", "");
				tmp=tmp.replace("(Nes)", "");
				tmp=tmp.replace("(Neu)", "");
				tmp=tmp.replace("(Nf)", "");
				tmp=tmp.replace("(Ng)", "");
				tmp=tmp.replace("(Nh)", "");
				tmp=tmp.replace("(Nv)", "");
				tmp=tmp.replace("(P)", "");
				tmp=tmp.replace("(SHI)", "");
				tmp=tmp.replace("(T)", "");
				tmp=tmp.replace("(VA)", "");
				tmp=tmp.replace("(VAC)", "");
				tmp=tmp.replace("(VB)", "");
				tmp=tmp.replace("(VC)", "");
				tmp=tmp.replace("(VCL)", "");
				tmp=tmp.replace("(VD)", "");
				tmp=tmp.replace("(VE)", "");
				tmp=tmp.replace("(VF)", "");
				tmp=tmp.replace("(VG)", "");
				tmp=tmp.replace("(VH)", "");
				tmp=tmp.replace("(VHC)", "");
				tmp=tmp.replace("(VI)", "");
				tmp=tmp.replace("(VJ)", "");
				tmp=tmp.replace("(VK)", "");
				tmp=tmp.replace("(VL)", "");
				tmp=tmp.replace("(PERIODCATEGORY)", "");
				tmp=tmp.replace("(PARENTHESISCATEGORY)", "");
				tmp=tmp.replace("(QUESTIONCATEGORY)", "");
				tmp=tmp.replace("(COMMACATEGORY)", "");
				tmp=tmp.replace("(DASHCATEGORY)", "");
				tmp=tmp.replace("(ETCCATEGORY)", "");
				tmp=tmp.replace("(EXCLAMATIONCATEGORY)", "");
				tmp=tmp.replace("(PAUSECATEGORY)", "");
				tmp=tmp.replace("(SEMICOLONCATEGORY)", "");
				tmp=tmp.replace("(SPCHANGECATEGORY)", "");
			}
			
			tmp+=" ";
			return tmp;//回傳tmp
	 }
}

