import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class delete //�峹�w�e�B�z(�B�J0)
{
	 public static void main(String [] argv) throws IOException 
	 {
			
		 String fileName = "resource1/";//�R�W�ڥؿ��U����Ƨ����W��
	     String[] filename;			  
	     File f = new File(fileName);//Ū�����R�W����Ƨ�
	        if (f.isDirectory()) 	 //�P�_�O�_����Ƨ�
	        {	
	            filename = f.list();//�Nf�}�C�H���ު��覡�O�d���������󶶧�
	            System.out.println("�}�lŪ��...");//��X�}�lŪ��
	            	for (int i = 0; i <= filename.length-1; i++)//�Hf�}�C�����ק@���j��]������
	            		{
						
	            		
						 	try 
						 		{
						 			if(i>=0)
						 			{
						 				FileReader fr; //�ɮ�Ū�J
						 				fr = new FileReader(fileName+"/"+filename[i]); //�ɮ׼g�J�j�w���
						 				BufferedReader br = new BufferedReader(fr); //�ɮ�Ū���w�İ�
						 				FileWriter fw; //�ɮ׼g�X
						 				fw = new FileWriter(new File("delete2/"+filename[i]).getAbsolutePath(),true); //�ɮ׼g�X�j�w���
						 				BufferedWriter bw = new BufferedWriter(fw); //�ɮ׼g�X�w�İ�
						 				String tmp = ""; //�r��Ȧs��
						 				while (br.ready()) //�p�G�ɮ�Ū���w�İϦ���� �N����j�餺 �_�h���X
						 					tmp += br.readLine(); //�ɮ�Ū���w�İϤ������ �N���Ū���@����x�s��r��Ȧs����
						 				bw.append(splitArr(tmp)); //Ū�����ɮ׫� �N�r��Ȧs������ƭ��� �åB�g�J�ɮ׽w�İ� �x�s�ɮ�
						 				System.out.println("��"+(i+1)+"���ɮ׳B�z����");
						 				fr.close();//�ɮ�����
						 				bw.close();//�ɮ�����  
						 			} 
						 		}
						 		catch (FileNotFoundException e) //�p�Gtry�L�k����N�|����ҥ~�B�z
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
		 	String[] arr = s.split(""); //���Φr�ꬰ�r��}�C
			String tmp = ""; //�Ȧs��
			for(int i = 0 ; i < arr.length; i++)//�Harr�}�C�����ק@���j��]������
			{
				if(arr[i].matches("�A")||arr[i].matches("�B")||arr[i].matches("�i")||arr[i].matches("�j")||arr[i].matches("�]")||arr[i].matches("�^")||arr[i].matches("��")||arr[i].matches("�u")||arr[i].matches("�v")||arr[i].matches("�C")||arr[i].matches(" ")||arr[i].matches("�m")||arr[i].matches("�n")||arr[i].matches("�H")||arr[i].matches("!")||arr[i].matches(":")||arr[i].matches("�D")||arr[i].matches("-")||arr[i].matches("�E")||arr[i].matches("�O")||arr[i].matches("�J")||arr[i].matches(">")||arr[i].matches("="))
				{
				s.replaceAll(arr[i],"");//���p���ŦXmatches�����󪺸ܷ|���N���ƻ򳣨S��
				}
				else if(arr[i].matches("�y")||arr[i].matches("�z")||arr[i].matches("�G")||arr[i].matches("�F")||arr[i].matches("��")||arr[i].matches("/")||arr[i].matches("%")||arr[i].matches("�H")||arr[i].matches("�H")||arr[i].matches("��")||arr[i].matches("��")||arr[i].matches("��")||arr[i].matches("$")||arr[i].matches("��")||arr[i].matches("��")||arr[i].matches("�K")||arr[i].matches("�I")||arr[i].matches("~")||arr[i].matches(",")||arr[i].matches("�U"))
				{
				s.replaceAll(arr[i],"");//���p���ŦXmatches�����󪺸ܷ|���N���ƻ򳣨S��
				}
				else if(arr[i].matches(""))
				{
				s.replaceAll(arr[i]," ");//���p���ŦXmatches�����󪺸ܷ|���N���ƻ򳣨S��
				}
					else{
					tmp += arr[i];//�p�G�S���ŦXmatches����arr[i]�|�Ȧs�btmp��
				}
			}
			return tmp;//�^��tmp
	 }
}
