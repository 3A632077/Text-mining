import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class positive
{
	
	public static void main(String[] args) throws Exception //������(�B�J4)
	{
		 String fileName = "rule4/";//�R�W�ڥؿ��U����Ƨ����W��
	     String[] filename;			  
	     File f = new File(fileName);//Ū�����R�W����Ƨ�
	        if (f.isDirectory()) 	 //�P�_�O�_����Ƨ�
	        {	
	            filename = f.list();//�Nf�}�C�H���ު��覡�O�d���������󶶧�
	            System.out.println("�}�lŪ��...");//��X�}�lŪ��
	            	for (int i = 0; i <= filename.length-1; i++)//�Hf�}�C�����ק@���j��]������
	            	{
	            		FileReader fr; //�ɮ׼g�J
	            		fr = new FileReader("rule4/"+filename[i]); //�ɮ׼g�J�j�w���
	            		BufferedReader br = new BufferedReader(fr); //�ɮ�Ū���w�İ�
	            		BufferedReader br1 = new BufferedReader(fr);
		
	            		FileReader fr2; //�ɮ׼g�J
	            		fr2 = new FileReader("positive.txt"); //�ɮ׼g�J�j�w���
	            		BufferedReader br2 = new BufferedReader(fr2); //�ɮ�Ū���w�İ�
	            		BufferedReader br3 = new BufferedReader(fr2);
		
	            		FileWriter fw; //�ɮ׼g�X
	            		fw = new FileWriter(new File("positive5/"+filename[i]).getAbsolutePath(),true); //�ɮ׼g�X�j�w���
	            		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
	            		String tmp = ""; //�r��Ȧs��
	            		while (br.ready()) //�p�G�ɮ�Ū���w�İϦ���� �N����j�餺 �_�h���X
	            			tmp += br.readLine()+",";
	            		String[] data2 = tmp.split(",");//���Φr�ꬰ�r��}�C(�æs��}�Cdata2)
	            		
		
		
	            		String tmp2 = ""; //�r��Ȧs��
	            		while (br2.ready()) //�p�G�ɮ�Ū���w�İϦ���� �N����j�餺 �_�h���X
	            			tmp2 += br2.readLine()+","; //�ɮ�Ū���w�İϤ������ �N���Ū���@����x�s��r��Ȧs����
	            		String[] data1 = tmp2.split(",");//���Φr�ꬰ�r��}�C(�æs��}�Cdata2)
	            		
		
		
	            		bw.append(splitArr(data1,data2));
		
	            		System.out.println("��"+(i+1)+"���ɮ׳B�z����");
	            		fr.close();//�ɮ�����
	            		bw.close();//�ɮ�����  
	        }
	}
		
		
	}
		public static String splitArr(String[] arr1, String[] arr2) //��ƭ��ը禡
		{
			String tmp ="";//�]�@�Ӫťո��
			for(int i=0;i<arr2.length;i++)//�Q�ΰ}�Cdata2�����װ��@�ӥ~�j�馸��
			{
				
				for(int j=0;j<arr1.length;j++)//�Q�ΰ}�Cdata1�����װ��@�Ӥ��j�馸��
				{
					if(arr2[i].matches(".*"+arr1[j]+"..*"))//�P�_��̬O�_�ŦX
					{
						tmp += arr2[i]+"\r"+"\n";//�N�}�Ci����ƼȦs�btmp�ô���
						break;//���X���j��
					}
					
				}
			}
			return tmp;
		}
		
		
	}