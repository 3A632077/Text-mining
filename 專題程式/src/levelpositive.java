import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class levelpositive
{
	public static void main(String[] args) throws Exception //������(�B�J4)
	{
		String fileName = "positive5/";//�R�W�ڥؿ��U����Ƨ����W��
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
						 			{
		
										FileReader fr; //�ɮ׼g�J
										fr = new FileReader("positive5/"+filename[i]); //�ɮ׼g�J�j�w���
										BufferedReader br = new BufferedReader(fr); //�ɮ�Ū���w�İ�
										
										
										FileReader fr3; //�ɮ׼g�J
										fr3 = new FileReader("level5.txt"); //�ɮ׼g�J�j�w���
										BufferedReader br3 = new BufferedReader(fr3); //�ɮ�Ū���w�İ�
										
										FileReader fr4; //�ɮ׼g�J
										fr4 = new FileReader("level4.txt"); //�ɮ׼g�J�j�w���
										BufferedReader br4 = new BufferedReader(fr4);
										
										FileReader fr5; //�ɮ׼g�J
										fr5 = new FileReader("level3.txt"); //�ɮ׼g�J�j�w���
										BufferedReader br5 = new BufferedReader(fr5); //�ɮ�Ū���w�İ�
										
										FileReader fr6; //�ɮ׼g�J
										fr6 = new FileReader("level2.txt"); //�ɮ׼g�J�j�w���
										BufferedReader br6 = new BufferedReader(fr6); //�ɮ�Ū���w�İ�
										
										FileReader fr7; //�ɮ׼g�J
										fr7 = new FileReader("level1.txt"); //�ɮ׼g�J�j�w���
										BufferedReader br7 = new BufferedReader(fr7); //�ɮ�Ū���w�İ�
										
										
																		
										FileWriter fw2; //�ɮ׼g�X
										fw2 = new FileWriter("levelpositive/"+i+"."+"level5."+filename[i]); //�ɮ׼g�X�j�w���
										BufferedWriter bw2 = new BufferedWriter(fw2);
										
										FileWriter fw3; //�ɮ׼g�X
										fw3 = new FileWriter("levelpositive/"+i+"."+"level4."+filename[i]); //�ɮ׼g�X�j�w���
										BufferedWriter bw3 = new BufferedWriter(fw3);
										
										FileWriter fw4; //�ɮ׼g�X
										fw4 = new FileWriter("levelpositive/"+i+"."+"level3."+filename[i]); //�ɮ׼g�X�j�w���
										BufferedWriter bw4 = new BufferedWriter(fw4);
										
										FileWriter fw5; //�ɮ׼g�X
										fw5 = new FileWriter("levelpositive/"+i+"."+"level2."+filename[i]); //�ɮ׼g�X�j�w���
										BufferedWriter bw5 = new BufferedWriter(fw5);
										
										FileWriter fw6; //�ɮ׼g�X
										fw6 = new FileWriter("levelpositive/"+i+"."+"level1."+filename[i]); //�ɮ׼g�X�j�w���
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
		
										System.out.println("��"+(i+1)+"���ɮ׳B�z����");
										fr.close();//�ɮ�����
										
										fr3.close();
										fr4.close();
										fr5.close();
										fr6.close();
										fr7.close();		
										
										bw2.close();
										bw3.close();
										bw4.close();
										bw5.close();
										bw6.close();//�ɮ�����  
						 			} 
						 		}
						 		catch (FileNotFoundException e)  //�p�Gtry�L�k����N�|����ҥ~�B�z
						 		{
						 			// TODO Auto-generated catch block
						 			System.out.print("FAIL");
						 			e.printStackTrace();
						 		}
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