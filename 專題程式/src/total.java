import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class total //�峹�w�e�B�z(�B�J0)
{
	 public static void main(String [] argv) throws IOException 
	 {
		 String tmp = ""; //�r��Ȧs��
		 String fileName = "ckip3/";//�R�W�ڥؿ��U����Ƨ����W��
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
						 				
						 				
						 				while (br.ready()) //�p�G�ɮ�Ū���w�İϦ���� �N����j�餺 �_�h���X
						 					tmp += br.readLine(); //�ɮ�Ū���w�İϤ������ �N���Ū���@����x�s��r��Ȧs����
						 				System.out.println("��"+(i+1)+"���ɮ׳B�z����");
						 				fr.close();//�ɮ�����
						 				  
						 			} 
						 		}
						 		catch (FileNotFoundException e) //�p�Gtry�L�k����N�|����ҥ~�B�z
						 		{
						 			// TODO Auto-generated catch block
						 			System.out.print("FAIL");
						 			e.printStackTrace();
						 		}
	            		}
	            	FileWriter fw; //�ɮ׼g�X
	            	fw = new FileWriter(new File("total.txt").getAbsolutePath(),true); //�ɮ׼g�X�j�w���
	            	BufferedWriter bw = new BufferedWriter(fw); //�ɮ׼g�X�w�İ�
	            	bw.append(splitArr(tmp)); //Ū�����ɮ׫� �N�r��Ȧs������ƭ��� �åB�g�J�ɮ׽w�İ� �x�s�ɮ�
	            	bw.close();//�ɮ�����
	            	
	            					    
	        }
	 }
	 public static String splitArr(String s) 
	 {
		 	String[] arr = s.split(""); //���Φr�ꬰ�r��}�C
			String tmp = ""; //�Ȧs��
			for(int i = 0 ; i < arr.length; i++)//�Harr�}�C�����ק@���j��]������
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
			return tmp;//�^��tmp
	 }
}

