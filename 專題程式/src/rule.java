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
						 			{
						 				FileReader fr; //�ɮ׼g�J
						 				fr = new FileReader(fileName+"/"+filename[i]); //�ɮ׼g�J�j�w���
						 				BufferedReader br = new BufferedReader(fr); //�ɮ�Ū���w�İ�
						 				FileWriter fw; //�ɮ׼g�X
						 				fw = new FileWriter(new File("rule4/"+filename[i]).getAbsolutePath(),true); //�ɮ׼g�X�j�w���
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
						 		catch (FileNotFoundException e)  //�p�Gtry�L�k����N�|����ҥ~�B�z
						 		{
						 			// TODO Auto-generated catch block
						 			System.out.print("FAIL");
						 			e.printStackTrace();
						 		}
	            		}
	        }
	 }
	
	 public static String splitArr(String s) //��ƭ��ը禡
	 {  
		 String[] arr = s.split(" "); //���Φr�ꬰ�r��}�C
			String tmp = ""; //�Ȧs��
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
